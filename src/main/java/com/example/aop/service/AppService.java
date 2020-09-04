package com.example.aop.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.aop.dao.AppDao;
import com.example.aop.model.AppModel;

@Service
public class AppService {

    @Autowired
    private AppDao appDao;

    public AppModel getData() {
        return appDao.getData();
    }

    public AppModel getData(String name) {
        return appDao.getData(name);
    }

    public AppModel generateError() throws Exception {
        return appDao.generateError();
    }

}
