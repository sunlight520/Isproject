package com.ad.test;

import com.ad.database.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test4 {
    public static void main(String[] args) {
        org.hibernate.cfg.Configuration configuration = new Configuration().configure();
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取Session
        Session session = sessionFactory.openSession();
        User user = session.get(User.class,1);
        System.out.println(user.getComment().size());
        session.close();
    }
}

