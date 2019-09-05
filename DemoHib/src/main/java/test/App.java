package test;

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
    	
        Configuration con = new Configuration().configure().addAnnotatedClass(ImageWrapper.class);
        
        ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
        
        SessionFactory sf = con.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        
        session.beginTransaction();
        
        
        
//<----------------------------------reading image from database----------------------------------------------------------------->
        
//        ImageWrapper iw = (ImageWrapper) session.get(ImageWrapper.class, 1);
//        byte [] imageData = iw.getData();
//        
//        try {
//			FileOutputStream fos = new FileOutputStream("/home/webwerks/test_return.jpg");
//			fos.write(imageData);
//			fos.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
        
//<------------------------------------------------------------------------------------------------------------------------------>
        
//<-------------------------------------inserting image into database using hibernate--------------------------------------------->        
//        File file = new File("/home/webwerks/test.jpg");
//        
//        byte [] imageData = new byte[(int) file.length()];
//        
//        try {
//			FileInputStream fis = new FileInputStream(file);
//			fis.read(imageData);
//			fis.close();
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//        
//        ImageWrapper image = new ImageWrapper();
//        image.setId(1);
//        image.setImageName("test");
//        image.setData(imageData);
//        
//        session.save(image);
//<------------------------------------------------------------------------------------------------------------------------------>
        
        
        
        
        //Native queries
//        SQLQuery q = session1.createSQLQuery("select name,marks from Students where marks>80");
        //q.addEntity(Students.class);
//        List<Students> students = q.list();
//        for(Students s:students) {
//        	System.out.println(s);
//        }
        
        
        
        
        
        
// 		  HQL queries
//        int b =80;
//        Query q = session1.createQuery("select sum(marks) from Students where marks> :b");
//        q.setParameter("b", b);
//        
//        Long s = (Long) q.uniqueResult();
//        System.out.println(s);
   
        
//        List<Object[]> s = (List<Object[]>) q.list();
//        
//        for(Object[] student: s) {
//        	System.out.println(student[0]+":"+student[1]+":"+student[2]);
//        }

        
        
        
//        List<Students> students = q.list();
//        
//        for(Students s: students) {
//        	System.out.println(s);
//        }
        
//        Random r = new Random();
//        
//        for(int i=1;i<=50; i++) {
//        	
//        	Students s = new Students();
//        	s.setId(i);
//        	s.setName("Name "+i);
//        	s.setMarks(r.nextInt(100));
//        	session1.save(s);
//        	
//        }
 
        session.getTransaction().commit();
        session.close();
        
        
    }
}
