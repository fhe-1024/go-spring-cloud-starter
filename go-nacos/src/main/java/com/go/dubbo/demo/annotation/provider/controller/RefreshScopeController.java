package com.go.dubbo.demo.annotation.provider.controller;

import com.go.dubbo.demo.annotation.provider.config.RefreshScopeConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/refresh-scope")
public class RefreshScopeController {

    @Autowired
    private RefreshScopeConfig refreshScopeConfig;

    @ResponseBody
    @RequestMapping("/see-config")
    public String seeConfig() {
        return refreshScopeConfig.getUserName();
    }

}
