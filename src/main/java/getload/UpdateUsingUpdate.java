package getload;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import demo_hibernate_project.Employee;

public class UpdateUsingUpdate {

	public static void main(String[] args) {
		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tran = ses.beginTransaction();
		Employee e = new Employee();
		e.setId(1);
		e.setName("newName");
		e.setSalary(123000);
		ses.update(e);
		tran.commit();

	}

}
