package com.kelitech.persistence.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
 
public class HibernateUtil {
	 
    private static final SessionFactory sessionFactory = buildSessionFactory();
 
    @SuppressWarnings("deprecation")
	private static SessionFactory buildSessionFactory() {
        try {
        	Configuration config = new Configuration().configure();
        	SchemaExport schemaExport = new SchemaExport(config);
        	schemaExport.create(true, false);
            // Create the SessionFactory from hibernate.cfg.xml
            return config.buildSessionFactory();
        }
        catch (Throwable ex) {
            // Make sure you log the exception, as it might be swallowed
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
 
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }
 
    public static void shutdown() {
    	// Close caches and connection pools
    	getSessionFactory().close();
    }
 
}
