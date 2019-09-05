package shailesh.DemoHib;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;


public class App 
{
    public static void main( String[] args )
    {
    	
    	Laptop laptop = new Laptop();
    	laptop.setLid(7);
    	laptop.setLname("hp");
    	
    	
    	Name n = new Name();
    	n.setFname("snehal");
    	n.setMname("null");
    	n.setLname("shelke");
//    	
    	Students s = new Students();
        s.setId(15);
        s.setName(n);
        s.setMarks(94);
        s.setLaptop(laptop);
        laptop.getStudent().add(s);
        //        laptop.getStudent().add(s);
    	
    	//Students a = null;
    
        
        Configuration con = new Configuration().configure().addAnnotatedClass(Students.class).addAnnotatedClass(Laptop.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session1 = sf.openSession();
        
        session1.beginTransaction();
        
        session1.save(s);
        
//        Query q1 = session1.createQuery("from Students where id=11");
//        q1.setCacheable(true);
//        a = (Students) q1.uniqueResult();
//        System.out.println(a);
        
        session1.getTransaction().commit();
        session1.close();
        
//        session.save(laptop);
//        session.save(s);
        //s = (Students) session.get(Students.class, 12);
        
        
//        Session session2 = sf.openSession();
//        
//        session2.beginTransaction();
//        
//        Query q2 = session2.createQuery("from Students where id=11");
//        q2.setCacheable(true);
//        a = (Students) q2.uniqueResult();
//        System.out.println(a);
//        
//        session2.getTransaction().commit();
//        session2.close();
        
    }
}
