package com.portal.common.ultil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;


public class hibernateUltil {

    private static SessionFactory sessionFactory= builSessionFactory();

    private static SessionFactory builSessionFactory() {
        try{
            return new Configuration().configure().buildSessionFactory();

        }catch (Throwable ex){
            System.err.println("Initial SessionFactory  creation failed:  ");
                    throw new ExceptionInInitializerError(ex);
        }
    }

    public static  SessionFactory getSessionFactory(){
        return sessionFactory;
    }
}
