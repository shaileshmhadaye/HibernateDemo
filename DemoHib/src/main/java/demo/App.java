package demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Random;

import javax.swing.border.EmptyBorder;

import org.hibernate.Query;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	Configuration con = new Configuration().configure().addAnnotatedClass(Employee.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
    	
        try {
            
            
    //-------------------first session-------------------------------------
            Session session = sf.openSession();
            session.beginTransaction();
            
            Employee e = (Employee) session.load(Employee.class, 1);
            System.out.println(e.getEname());
            
            e = (Employee) session.load(Employee.class, 1);
            System.out.println(e.getEname());
            
            session.getTransaction().commit();
            session.close();
            
    //----------------------second session---------------------------------
            
            Session session1 = sf.openSession();
            session1.beginTransaction();
            
            e = (Employee) session1.load(Employee.class, 1);
            System.out.println(e.getEname());
            
            session1.getTransaction().commit();
            session1.close();
		} finally {
			System.out.println(sf.getStatistics().getEntityFetchCount());
			System.out.println(sf.getStatistics().getSecondLevelCacheHitCount());
			sf.close();
		}
        
        
        
        
        
//--------------------------save v/s saveOrUpdate------------------------------------
        
//        Session session1 = sf.openSession();
//        
//        session1.beginTransaction();
//        
//        Employee e = new Employee();
//        e.setEid(5);
//        e.setEname("abhijeet");
//        e.setTech("android");
//        
//        session1.save(e);
//                
//        session1.getTransaction().commit();
//        session1.close();
//        
//        Session session2 = sf.openSession();
//        
//        session2.beginTransaction();
//        
//        e.setTech("ML");
//        
//        session2.saveOrUpdate(e);//updates record
//                
//        session2.getTransaction().commit();
//        session2.close();
        
//-----------------------------------------------------------------------------------------------       
    }
}
