import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DeleteDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//step 1: Get the session Factory from HibernateUtil
		
		System.out.println("Going to Obtain session Factory");
		SessionFactory sessionFactory =  HibernateUtil.giveSession();
		
		//Step 2: from Session Factory open the session
		
		System.out.println("Going to open the session");
		Session session = sessionFactory.openSession();
		
		try(sessionFactory;session){
			
			//Step 3: Begin Transaction
			
			System.out.println("Going to Begin the transaction");
			session.beginTransaction();
			
			//step 4: Perform Delete Operation
			//This is a 2 step process
				//First :  we fetch the empId
				//second : Remove the 
			
			System.out.println("Going to fetch the employee with the ID :106 ");
			EmployeeEntity empEntity = session.get(EmployeeEntity.class, 106);
			
			System.out.println("Remove the Employee with the ID:106");
			session.remove(empEntity);
					
				//Step 5: Commit the transaction
			System.out.println("Going to Commit the transaction");
			session.getTransaction().commit();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}

	}

}
