package com.zcr.myapp.rpc.api;

import com.zcr.common.base.BaseServiceMock;
import com.zcr.myapp.dao.mapper.UserAppMapper;
import com.zcr.myapp.dao.model.UserApp;
import com.zcr.myapp.dao.model.UserAppExample;

/**
* 降级实现UserAppService接口
* Created by shuzheng on 2018/8/8.
*/
public class UserAppServiceMock extends BaseServiceMock<UserAppMapper, UserApp, UserAppExample> implements UserAppService {

}
