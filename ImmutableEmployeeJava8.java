import java.time.LocalDate;

public final class ImmutableEmployeeJava8 {
	
	private final String empName;
	private final LocalDate dob;
	private final LocalDate dateOfMarriage;
	private final String gender;
	private final String departmentName;
	
	public ImmutableEmployeeJava8(String empName, LocalDate dob, LocalDate dateOfMarriage, String gender, String departmentName) {
		super();
		this.empName = empName;
		this.dob = dob;
		this.dateOfMarriage = dateOfMarriage;
		this.gender = gender;
		this.departmentName = departmentName;
	}

	public String getEmpName() {
		return empName;
	}

	public LocalDate getDob() {
		return dob;
	}
	
	public LocalDate getDateOfMarriage() {
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

