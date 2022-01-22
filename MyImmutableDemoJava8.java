import java.time.LocalDate;
import java.time.Month;	

public class MyImmutableDemoJava8{
	
	public static void main(String[] args) {
		//Immutable Demo using Java 8 Date and Time API(JODA API)
		ImmutableEmployeeJava8 e2 = new ImmutableEmployeeJava8("Alex",
				LocalDate.of(2000, Month.DECEMBER, 31),
				LocalDate.of(2019, Month.JANUARY, 01),
				"M","Sales");
		System.out.println("Immutable Employee Data : " + e2);
		
		//Changing the date 
		System.out.println("Reducing months in date of marriage " + e2.getDateOfMarriage().minusMonths(2));
		//Chages not reflected in Original Employee Object
		System.out.println("Employee Date : " + e2);
	}
}
