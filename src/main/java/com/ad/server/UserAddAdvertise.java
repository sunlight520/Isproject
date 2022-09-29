package com.ad.server;

import com.ad.database.Advertise;
import com.ad.database.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import java.util.HashSet;
import java.util.Set;

public class UserAddAdvertise {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        Advertise advertise = new Advertise();
        Set<Advertise> advertises = new HashSet<>();
        advertise.setHousingid(2);
        advertises.add(advertise);
        User user = new User();
        user.setAdvertise(advertises);
        session.save(advertise);
        session.save(user);
        session.beginTransaction().commit();
        session.close();
    }
}
