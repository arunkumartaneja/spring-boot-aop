package com.example.aop.dao;

import java.util.Random;

import org.springframework.stereotype.Repository;

import com.example.aop.model.AppModel;

@Repository
public class AppDao {

    public AppModel getData() {
        Random random = new Random();
        String name = random.ints(97, 123).limit(5)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        return new AppModel(name);
    }

    public AppModel getData(String name) {
        return new AppModel(name);
    }

    public AppModel generateError() throws Exception {
        throw new Exception("error throw from app dao");
    }

}
