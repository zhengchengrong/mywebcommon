package com.zcr.myapp.rpc.service.impl;

import com.zcr.common.annotation.BaseService;
import com.zcr.common.base.BaseServiceImpl;
import com.zcr.myapp.dao.mapper.UserAppMapper;
import com.zcr.myapp.dao.model.UserApp;
import com.zcr.myapp.dao.model.UserAppExample;
import com.zcr.myapp.rpc.api.UserAppService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* UserAppService实现
* Created by shuzheng on 2018/8/8.
*/
@Service
@Transactional
@BaseService
public class UserAppServiceImpl extends BaseServiceImpl<UserAppMapper, UserApp, UserAppExample> implements UserAppService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserAppServiceImpl.class);

    @Autowired
    UserAppMapper userAppMapper;

}