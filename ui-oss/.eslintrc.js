const { strictEslint } = require.resolve('@umijs/fabric/dist/eslint')

Object.assign(strictEslint.rules, {
  'no-unused-expressions': 0,
  // 放宽条件，单双引号都可以
  quotes: [0],
  'comma-dangle': 0,
  // @adjust 忽略注释换行问题
  'spaced-comment': 0,
  'padded-blocks': 0,
  'no-trailing-spaces': 0,
  'object-shorthand': 0,
  'no-case-declarations': 0,
  'no-underscore-dangle': 0,
  'no-plusplus': 0,
  'no-unused-vars': 0,
  'no-empty-function': 0,
  'no-multi-spaces': 0,
  'no-useless-return': 0,
  'max-len': 0,
  'no-empty': 0,
  'eol-last': 0,
  'comma-spacing': 0,
  // @adjust 允许不写行尾空行
  'no-multiple-empty-lines': 0,
  'object-curly-spacing': 0,
  'no-debugger': 0,
  'no-shadow': 0,
  'no-use-before-define': 0,
  /*  // @adjust 允许一行代码偏长
    'max-len': 0,*/
  // TypeScript
  '@typescript-eslint/no-unused-vars': 0,
  '@typescript-eslint/no-empty-interface': 0,
  '@typescript-eslint/no-use-before-define': 0,
  // react相关
  // 'react/no-array-index-key': [0],
  // 'react/no-access-state-in-setstate': [0],
  // 'react/sort-comp': [0],
  // 'react/no-find-dom-node': [0],
  'react/no-unused-state': 0,
  'react/no-string-refs': 0,
  'react/no-array-index-key': 0,
  'react/no-access-state-in-setstate': 0,
  'react/jsx-boolean-value': 0,
  // 以下配置需谨慎！！！
  'no-bitwise': 0,
  // 'prefer-destructuring': 0,
  // 'no-nested-ternary': 0,
  // 'import/no-dynamic-require': 0,
  // 'global-require': [0],
  // 'no-use-before-define': 0,
  // 'no-script-url': 0,
  // 'no-useless-concat': 0,
});


module.exports = {
  extends: [...strictEslint],
  globals: {
    ANT_DESIGN_PRO_ONLY_DO_NOT_USE_IN_YOUR_PRODUCTION: true,
    page: true,
    REACT_APP_ENV: true,
  },
};
