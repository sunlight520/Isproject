package com.ad.test;

import com.ad.database.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class Test1 {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取Session
        Session session = sessionFactory.openSession();
        housing housing = new housing();
        Advertise advertise = new Advertise();
        housing.setPrice(122);
        housing.setAddress("杭州");
        housing.setDescription("不好看");
        Set<housing> housings = new HashSet<>();
        housings.add(housing);
        advertise.setHousings(housings);
        session.save(advertise);
        session.save(housing);
        session.beginTransaction().commit();
        session.close();
    }
}
