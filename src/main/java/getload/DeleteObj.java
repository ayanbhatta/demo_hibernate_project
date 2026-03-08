package getload;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import demo_hibernate_project.Employee;

public class DeleteObj {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter id to delete : ");
		int eid = sc.nextInt();

		Configuration conf = new Configuration();
		conf.configure();
		SessionFactory sef = conf.buildSessionFactory();
		Session ses = sef.openSession();
		Transaction tran = ses.beginTransaction();
		Employee e = ses.get(Employee.class, eid);
		if (e != null) {
			ses.delete(e);
			tran.commit();
		}else {
			System.err.println("invalid id");
		}
		
	}

}
