package model;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.junit.Test;

@SuppressWarnings("all")
public class T {
	private SessionFactory sf = new AnnotationConfiguration().configure().buildSessionFactory();
	
	@Test
	public void C01(){
		Product p = new Product();
		User u = new User();
		Sort s = new Sort();
		Order o = new Order();
		Entry e = new Entry();
		Admin a = new Admin();
	}
}

