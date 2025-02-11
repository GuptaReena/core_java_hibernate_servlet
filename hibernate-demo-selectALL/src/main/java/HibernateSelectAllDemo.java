import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.criteria.HibernateCriteriaBuilder;
import org.hibernate.query.criteria.JpaCriteriaQuery;
import org.hibernate.query.criteria.JpaRoot;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;

public class HibernateSelectAllDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Step 1: Get session from HibernateUtils
		System.out.println("Obtain the session factory");
		SessionFactory sessionFactory =  HibernateUtil.getSession();
		
		//Step 2: Open a session from the session Factory
		System.out.println("Going to Open the session ");
		Session session = sessionFactory.openSession();
		
		
		//Step 3: Begin the Transaction
		System.out.println("Going to begin the transaction");
		session.beginTransaction();
		
		//step 4 :Perform the Select Operation
		//We can do in 2 ways
		//First way : USing JPQL Queries
		
		List<EmployeeEntity> allEmployee = session.createQuery("Select e from EmployeeEntity e",EmployeeEntity.class).getResultList();
		allEmployee.forEach((eachEmployee) -> System.out.println(eachEmployee));
		
	
		//Second way : Criteria API 
		HibernateCriteriaBuilder cb = session.getCriteriaBuilder();
		JpaCriteriaQuery<EmployeeEntity> cq = cb.createQuery(EmployeeEntity.class);
		JpaRoot<EmployeeEntity> rootEntity = cq.from(EmployeeEntity.class);
		CriteriaQuery<EmployeeEntity> all = cq.select(rootEntity);
		
		List<EmployeeEntity> allEmp = session.createQuery(all).getResultList();
		System.out.println("Fetching all the employee using Criteria API ");
		
		allEmp.forEach((eachEmployee) -> System.out.println(eachEmployee));
		
		
		//third way : Using Native SQl
		
		String sqlQueries = "Select * from employee";
		
		NativeQuery<EmployeeEntity> query = session.createNativeQuery(sqlQueries, EmployeeEntity.class);
		
		List<EmployeeEntity> allEmps = query.list();
		System.out.println("Fetching all the employee using Native API ");
		
		allEmps.forEach((eachEmployee) -> System.out.println(eachEmployee));
		
		
		
		//Step 5: Close the Connection
		session.close();
		sessionFactory.close();
		
	}

}
