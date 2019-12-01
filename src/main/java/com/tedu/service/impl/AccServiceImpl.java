package com.tedu.service.impl;

import com.tedu.dao.AccDao;
import com.tedu.pojo.Acc;
import com.tedu.service.AccService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccServiceImpl implements AccService {
    @Autowired
    AccDao accdao;

    @Override
    public List<Acc> findAll() {
        return accdao.findAll();
    }
}
