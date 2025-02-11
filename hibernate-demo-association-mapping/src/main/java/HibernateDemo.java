import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HibernateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step 1: Get the session Factory from HibernateUtil
		
		SessionFactory sessionFactory = HibernateUtil.getSession();
		
		//Step 2: Open a session from the session Factory
		
		Session session  =  sessionFactory.openSession();
		
		
		//Step 3: Begin Transaction
		
		session.beginTransaction();
		
		//Step 4: Perform query to Fetch the employee 
		
		EmployeeEntity empEntity = session.get(EmployeeEntity.class, 102);
		System.out.println("Employee ID :" + empEntity.getEmployeeId());
		System.out.println("Employee Name :" + empEntity.getEmployeeName());
		System.out.println("Employee Contact :" + empEntity.getEmployeeContact());
		System.out.println("Employee Department Id :" + empEntity.getDeptEntity().getDeptId());
		System.out.println("Employee Department Name :" + empEntity.getDeptEntity().getDeptName());
		System.out.println("Entire Employee Entity :" + empEntity);
		
		//Step 5: Close the connection
		
		session.close();
		sessionFactory.close();

	}

}
