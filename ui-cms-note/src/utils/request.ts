/**
 * request 网络请求工具
 * 更详细的 api 文档: https://github.com/umijs/umi-request
 */
import {extend} from 'umi-request';
import {notification} from 'antd';

const {API_ROOT} = process.env

const codeMessage = {
  200: '服务器成功返回请求的数据。',
  201: '新建或修改数据成功。',
  202: '一个请求已经进入后台排队（异步任务）。',
  204: '删除数据成功。',
  400: '发出的请求有错误，服务器没有进行新建或修改数据的操作。',
  401: '用户没有权限（令牌、用户名、密码错误）。',
  403: '用户得到授权，但是访问是被禁止的。',
  404: '发出的请求针对的是不存在的记录，服务器没有进行操作。',
  406: '请求的格式不可得。',
  410: '请求的资源被永久删除，且不会再得到的。',
  422: '当创建一个对象时，发生一个验证错误。',
  500: '服务器发生错误，请检查服务器。',
  502: '网关错误。',
  503: '服务不可用，服务器暂时过载或维护。',
  504: '网关超时。',
};

/**
 * 异常处理程序
 */
const errorHandler = (error: { response: Response }): Response => {
  const {response} = error;
  console.info("response ~~")
  console.info(response)
  // @ts-ignore
  if (response && response.code != 0) {
    const errorText = codeMessage[response.status] || response.statusText;
    const {status, url} = response;

    notification.error({
      message: `请求错误 ${status}: ${url}`,
      description: errorText,
    });
  } else if (!response) {
    notification.error({
      description: '您的网络发生异常，无法连接服务器',
      message: '网络异常',
    });
  }
  return response;
};

/**
 * 配置request请求时的默认参数
 */
const request = extend({
  errorHandler, // 默认错误处理
  credentials: 'include', // 默认请求是否带上cookie
});

// request拦截器, 改变url 或 options.
// @ts-ignore
request.interceptors.request.use(async (url, options) => {

  let c_token = localStorage.getItem("token");
  if (c_token) {
    const headers = {
      'Content-Type': 'application/json',
      'Accept': 'application/json',
      'token': c_token
    };
    return (
      {
        url: API_ROOT + url,
        options: {
          ...options,
          headers: headers
        },
      }
    );
  } else {

    return (
      {
        url: API_ROOT + url,
        options: {
          ...options
        },
      }
    );
  }

})

// @ts-ignore
request.interceptors.response.use(async (response, info) => {

  let data: any = {}
  try {
    data = await response.clone().json()
  } catch (e) {
    // @TODO responseType已指定, 但不知道如何获取?? 只能靠异常抛出
    // 解析错误则直接返回
    console.log("JSON转换异常 ----> ")
    // return Promise.reject(response)
    return response
  }

  // @adjust 直接抛出异常的提示自行处理, 直接返回
  if (data.error && data.exception) {
    console.log("抛出异常")
    notification.error({
      message: data.message || data.msg,
    });

    return Promise.reject(response)
  }

  // code不为0 先统一提示报错信息
  if (data.code !== 0) {

    // 登录超时
    // 16 -> token格式可能被改了
    if ([16, 17, 18, 401].includes(data.code)) {
      // @fixme 登录判断 是否已经提示过踢人
      // @ts-ignore
      window.g_app._store.dispatch({
        type: 'login/logout',
        callback: () => {
          window.location.reload();
        }
      });
      return

    }

    notification.error({
      message: data.message || data.msg,
    });
  }


  return response;

})

export default request;
