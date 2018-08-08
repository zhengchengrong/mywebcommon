package com.zcr.myapp.controller;


import com.zcr.common.base.BaseController;
import com.zcr.myapp.common.constant.UpmsResult;
import com.zcr.myapp.common.constant.UpmsResultConstant;
import com.zcr.myapp.dao.model.UserApp;
import com.zcr.myapp.rpc.api.UserAppService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/hello")
public class MyAppController extends BaseController{


    @Autowired
    private UserAppService userAppService;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    @ResponseBody
    public Object index() {
        UserApp userApp = new UserApp();
        userApp.setId(2);
        userApp.setAge(10);
        userApp.setName("zcr");
        userAppService.insertSelective(userApp);
        System.out.println(userApp.getId());
        return new UpmsResult(UpmsResultConstant.SUCCESS, userApp.getName());
    }
}
