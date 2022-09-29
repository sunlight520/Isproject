package com.ad.test;

import com.ad.database.Advertise;
import com.ad.database.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.testng.annotations.Test;

import java.util.HashSet;
import java.util.Set;

public class Test05 {
    @Test
    public void test01(){
        Configuration configuration = new
                Configuration().configure("hibernate.cfg.xml");
        //获取 SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取 Session
        Session session = sessionFactory.openSession();
        //创建 Customer
        User user = new User();
        //创建 Orders
        Set<Advertise> advertises = new HashSet<>();
        Advertise advertise = new Advertise();
        advertise.setHousingid(8);
        //建⽴关联关系
        advertises.add(advertise);
        user.setAdvertise(advertises);
        //保存
        session.save(user);
        session.save(advertise);
        //提交事务
        session.beginTransaction().commit();
        //关闭session
        session.close();
    }
}
