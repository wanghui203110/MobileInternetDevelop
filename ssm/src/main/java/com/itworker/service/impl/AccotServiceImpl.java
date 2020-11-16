package com.itworker.service.impl;

import com.itworker.dao.AccotDao;
import com.itworker.domain.Accot;
import com.itworker.service.AccotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("accotService")
public class AccotServiceImpl implements AccotService {

    @Autowired
    private AccotDao accotDao;

    public List<Accot> findAll() {
        System.out.println("业务层：查询所有账户信息...");
        return accotDao.findAll();
    }

    public void saveAccot(Accot accot) {
        System.out.println("业务层：保存账户...");
        accotDao.saveAccot(accot);
    }
}
