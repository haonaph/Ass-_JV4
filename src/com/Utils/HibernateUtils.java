package com.Utils;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;


public class HibernateUtils {
  private static SessionFactory factory;
  private static Session session;
  
  public static  SessionFactory getSessionFacetory() 
  {
  	if(factory == null || !factory.isOpen())
  	{
  		Configuration config = new Configuration();
  		config.configure("hibernate.cfg.xml");
  		
  		factory = config.buildSessionFactory();
  	}
  	return factory;
  }
	public static Session getSession()
	{
		if(session == null || !session.isOpen())
		{
			session = getSessionFacetory().openSession();
		}
		return session;
	}
}
