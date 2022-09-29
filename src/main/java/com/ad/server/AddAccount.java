package com.ad.server;

import com.ad.database.Accounts;
import com.ad.database.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class AddAccount {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().configure();
        //获取SessionFactory
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        //获取Session
        Session session = sessionFactory.openSession();
        Accounts accounts = new Accounts();
        accounts.setUsername("胖胖万");
        accounts.setPassword("money");
        accounts.setAuthoritylevel(2);
        Set<Accounts> accountsSet = new HashSet<>();
        accountsSet.add(accounts);
        User user = new User();
        user.setAccount(accountsSet);
        session.save(accounts);
        session.save(user);
        session.beginTransaction().commit();
        session.close();
    }
}
