import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

public class MyImmutableDemo{
	
	public static void main(String[] args) {
		ImmutableEmployee e1 = new ImmutableEmployee("John",new Date("12/31/2000"),new Date("01/01/2019"),"M","Sales");
		System.out.println("Original Employee Data : " + e1);
		
		e1.getDateOfMarriage().setYear(2018-1900);   // Modified the year to 2018
		e1.getDob().setYear(1995-1900);  //Modified teh year to 1995
		System.out.println("Modified Employee Data : " + e1);
		
	}
	
}
