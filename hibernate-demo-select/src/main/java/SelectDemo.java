import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class SelectDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1 : Get session from Hibernate util		
		System.out.println("Going to Obtain session Factory");
		SessionFactory sessionFactory =  HibernateUtil.getSession();
		
		//Step 2 : Open a Session from session Factory
		System.out.println("Going to open the session.....");
		Session session = sessionFactory.openSession();
		
		
		// 3. do the select operation
		EmployeeEntity emp1 = session.get(EmployeeEntity.class, 101);
		System.out.println("emp1 : " + emp1); // prints the employee info with id 101
		EmployeeEntity emp2 = session.get(EmployeeEntity.class, 45678);
		System.out.println("emp2 : " + emp2); // prints null since employee with id 45678 is not present
				
		// getReference() method replaces the load() method, as load() is deprecated 
		EmployeeEntity emp3 = session.getReference(EmployeeEntity.class, 101);
		
		System.out.println("emp3 : " + emp3); // prints the employee info with id 101
		//EmployeeEntity emp4 = session.getReference(EmployeeEntity.class, 45678);
		//System.out.println("emp4 : " + emp4); // throws exception since employee with id 45678 is not present
				
		// 4. close the Session and SessionFactory
		session.close();
		sessionFactory.close();
	}

}
