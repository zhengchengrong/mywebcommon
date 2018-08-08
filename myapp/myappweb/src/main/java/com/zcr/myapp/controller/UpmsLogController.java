package com.zcr.myapp.controller;


import com.zcr.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 日志controller
 * Created by shuzheng on 2017/3/14.
 */
@Controller
@Api(value = "日志管理", description = "日志管理")
@RequestMapping("/manage")
public class UpmsLogController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpmsLogController.class);

    @ApiOperation(value = "日志首页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String index() {
        return "/sso/login.jsp";
    }
    @ApiOperation(value = "获取json")
    @RequestMapping(value = "/getJson", method = RequestMethod.GET)
    @ResponseBody
    public String getjson() {
        return "{'zcr':'123'}";
    }
}