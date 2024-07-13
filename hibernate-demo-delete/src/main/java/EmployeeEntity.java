import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


//Delete 


@Entity
@Table(name="employee")
public class EmployeeEntity {

	@Id
	@Column(name="emp_id")
	private int empId;
	
	@Column(name="emp_name")
	private String empName;
	
	@Column(name="emp_contact")
	private String empContact;
	
	@Column(name="emp_dept")
	private int empDept;
	
	

	public EmployeeEntity() {
		
	}

	public EmployeeEntity(int empId, String empName, String empContact, int empDept) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empContact = empContact;
		this.empDept = empDept;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpContact() {
		return empContact;
	}

	public void setEmpContact(String empContact) {
		this.empContact = empContact;
	}

	public int getEmpDept() {
		return empDept;
	}

	public void setEmpDept(int empDept) {
		this.empDept = empDept;
	}

	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + ", empContact=" + empContact + ", empDept="
				+ empDept + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(empContact, empDept, empId, empName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeEntity other = (EmployeeEntity) obj;
		return Objects.equals(empContact, other.empContact) && empDept == other.empDept && empId == other.empId
				&& Objects.equals(empName, other.empName);
	}
	
	
	
}
