import java.util.Date;
import java.util.Optional;

public class OptionalExample {

	public static void main(String[] args) {
		
		//Create an empty Optional Object
		Optional<String> strOptional1 = Optional.empty();
		System.out.println(strOptional1);
		
		//Create an Optional Object using of
		Optional<String> strOptional2 = Optional.of("Sample Value1");
		System.out.println(strOptional2);
		
		//Create an Optional Object using ofNullable
		Optional<String> strOptional3 = Optional.ofNullable("Sample Value2");
		System.out.println(strOptional3);
		
		// Get Value from Optional
		//System.out.println("Using Get Value :" + strOptional1.get()); // Throw an exception
		System.out.println("Using Get Value :" + strOptional2.get());
		System.out.println("Using Get Value :" + strOptional3.get());
		
		//isPresent
		System.out.println("Using isPresent : " + strOptional1.isPresent());
		System.out.println("Using isPresent : " + strOptional2.isPresent());
		System.out.println("Using isPresent : " + strOptional3.isPresent());
		
		//ifPresent(Consumer)
		strOptional1.ifPresent(str -> System.out.println(str.toUpperCase()));  //No output
		strOptional2.ifPresent(str -> System.out.println(str.toUpperCase()));
		strOptional3.ifPresent(str -> System.out.println(str.toLowerCase()));
		
		//orElse
		System.out.println("Using orElse : " + strOptional1.orElse("Some default Value"));
		String country = null;
		Optional<String> countryOptional = Optional.ofNullable(country);
		System.out.println("Using orElse : " + countryOptional.orElse("India"));
		
		//orElseGet(Supplier)
		Optional<Date> optionalDate = Optional.empty();
		System.out.println("Using orElseGet : " + optionalDate.orElseGet(() -> new Date()));
		
		//orElseThrow
		Optional<Integer> intOptional1 = Optional.empty();
		Optional<Integer> intOptional2 = Optional.of(1);
		//System.out.println("Using orElseThrow : " + intOptional1.orElseThrow(IllegalArgumentException :: new)); Throws Exception
		System.out.println("Using orElseThrow : " + intOptional2.orElseThrow(IllegalArgumentException :: new));
		
		//filter
		Optional<Integer> age = Optional.of(20);
		System.out.println("Using filter : " + age.filter(n -> n>18).get());
		
		//map
		Optional<Integer> price = Optional.of(2);
		System.out.println("Using map : " + price.map(n->n*n).get());
		
		//map with check isPresent
		Optional<Integer> prc = Optional.ofNullable(3);
		Optional tmp = prc.map(n->n*3);
		if(tmp.isPresent())
			System.out.println("Using map : " + tmp.get());
		
	}
}
