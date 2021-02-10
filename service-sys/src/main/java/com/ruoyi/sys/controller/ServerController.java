package com.ruoyi.sys.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ruoyi.common.vo.ResultVo;
import com.ruoyi.sys.domain.metrics.Server;

/**
 * 服务器监控
 *
 * @author ruoyi
 */
@RestController
@RequestMapping("/monitor/server")
public class ServerController {
    @PreAuthorize("@ss.hasPermission('monitor:server:list')")
    @GetMapping()
    public ResultVo getInfo() throws Exception {
        Server server = new Server();
        server.copyTo();
        return ResultVo.success(server);
    }
}
