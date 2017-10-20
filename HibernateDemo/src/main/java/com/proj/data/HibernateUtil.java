package com.proj.data;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

import com.proj.entitties.RestoMenu;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {
			
			ServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
					.configure().build();
			
			Metadata metadata = new MetadataSources( standardRegistry )
					.addAnnotatedClass(RestoMenu.class)
					.getMetadataBuilder().build();
			
			return metadata.getSessionFactoryBuilder().build();
			
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("Error in buildSessionFactory");
		}

	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

}
