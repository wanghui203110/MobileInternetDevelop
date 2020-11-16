package com.itworker.test;

import com.itworker.dao.AccotDao;
import com.itworker.domain.Accot;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class TestMybatis {

    /**
     * 测试查询
     * @throws IOException
     */
    @Test
    public void run1() throws IOException {

        // 1.加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2.创建SqlSessionFactory工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3.创建SqlSession对象
        SqlSession sqlSession = factory.openSession();

        // 4.获取代理对象
        AccotDao accotDao = sqlSession.getMapper(AccotDao.class);

        // 5.调用方法
        List<Accot> list = accotDao.findAll();
        for (Accot accot : list) {
            System.out.println(accot);
        }

        // 6.释放资源
        sqlSession.close();
        inputStream.close();
    }

    /**
     * 测试保存
     * @throws IOException
     */
    @Test
    public void run2() throws IOException {

        Accot accot = new Accot();
        accot.setName("张三丰");
        accot.setMoney(12345d);

        // 1.加载配置文件
        InputStream inputStream = Resources.getResourceAsStream("SqlMapConfig.xml");

        // 2.创建SqlSessionFactory工厂对象
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);

        // 3.创建SqlSession对象
        SqlSession sqlSession = factory.openSession();

        // 4.获取代理对象
        AccotDao accotDao = sqlSession.getMapper(AccotDao.class);

        // 5.调用方法
        accotDao.saveAccot(accot);

        // 提交事务
        sqlSession.commit();

        // 6.释放资源
        sqlSession.close();
        inputStream.close();
    }
}
