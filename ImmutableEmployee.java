import java.util.Date;

public final class ImmutableEmployee {
	
	private final String empName;
	private final Date dob;
	private final Date dateOfMarriage;
	private final String gender;
	private final String departmentName;
	
	public ImmutableEmployee(String empName, Date dob, Date dateOfMarriage, String gender, String departmentName) {
		super();
		this.empName = empName;
		this.dob = new Date(dob.getTime());
		this.dateOfMarriage = dateOfMarriage;
		this.gender = gender;
		this.departmentName = departmentName;
	}

	public String getEmpName() {
		return empName;
	}

	public Date getDob() {
		return new Date(dob.getTime());
	}
	
	public Date getDateOfMarriage() {
		return dateOfMarriage;
	}

	public String getGender() {
		return gender;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	@Override
	public String toString() {
		return "ImmutableEmployee [empName=" + empName + ", dob=" + dob + ", dateOfMarriage=" + dateOfMarriage
				+ ", gender=" + gender + ", departmentName=" + departmentName + "]";
	}

}

