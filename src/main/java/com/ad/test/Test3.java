package com.ad.test;


import com.ad.database.Advertise;
import com.ad.database.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test3 {
    public static void main(String[] args) {
        org.hibernate.cfg.Configuration configuration = new Configuration().configure();
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取Session
        Session session = sessionFactory.openSession();
        User user = new User();
        Advertise advertise1 = new Advertise();
        Advertise advertise2 = new Advertise();
        advertise1.setHousingid(1);
        advertise2.setHousingid(2);
        advertise1.setUser(user);
        advertise1.setUser(user);
        user.getAdvertise().add(advertise1);
        user.getAdvertise().add(advertise2);
        session.save(user);
        session.save(advertise1);
        session.save(advertise2);
        session.beginTransaction().commit();
        session.close();
    }

}
