package com.itworker.dao;

import com.itworker.domain.Accot;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 账户Dao接口
 */
@Repository
public interface AccotDao {

    /**
     * 查询所有账户信息
     * @return 账户信息
     */
    @Select("select * from accot")
    public List<Accot> findAll();

    /**
     * 保存账户信息
     * @param accot
     */
    @Insert("insert into accot (name, money) values (#{name}, #{money})")
    public void saveAccot(Accot accot);
}
