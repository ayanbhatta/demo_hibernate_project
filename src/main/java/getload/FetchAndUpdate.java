package getload;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import demo_hibernate_project.Employee;

public class FetchAndUpdate {

	public static void main(String[] args) {
		 Configuration conf = new Configuration();
		 conf.configure();
		 SessionFactory sef = conf.buildSessionFactory();
		 Session ses = sef.openSession();
		 Transaction tran = ses.beginTransaction();
		 Employee e = ses.get(Employee.class, 1);
		 if(e !=null) {
			 e.setName("hib");
			 e.setSalary(3498.0);
			 tran.commit();
		 }
				

	}

}
