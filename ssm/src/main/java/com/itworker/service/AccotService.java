package com.itworker.service;

import com.itworker.domain.Accot;

import java.util.List;

/**
 * 账户的业务逻辑接口
 */
public interface AccotService {

    /**
     * 查询所有的账户信息
     * @return
     */
    public List<Accot> findAll();

    /**
     * 保存账户信息
     * @param accot
     */
    public void saveAccot(Accot accot);
}
