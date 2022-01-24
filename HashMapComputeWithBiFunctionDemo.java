import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class HashMapComputeWithBiFunctionDemo {

	public static void main(String[] args) {
		
		Map<Integer, String> hashMap = new HashMap<Integer, String>();
	    String msg = "Hello ";
	    String defaultUser = "Anonymous";
		
	    hashMap.put(1, "Sam");
	    hashMap.put(4, "Alex");
	    hashMap.put(3, "John");
	    hashMap.put(2, "Tom");
	    hashMap.put(1, null);
	    
	    //hashMap.compute(1, (key, oldValue) -> oldValue.concat(msg)); // throws NPE
	    
	    BiFunction<Integer, String, String> f1 = (key, oldValue) -> oldValue == null 
	    		? defaultUser
	            : oldValue.toUpperCase();
	    
	    hashMap.compute(4, f1);
	    hashMap.compute(1, f1);
	    System.out.println("HashMap using compute() => " + hashMap);
	    
	    // Using computeIfPresent(key, BiFunction)
	    BiFunction<Integer, String, String> f2 = (key, oldValue) -> msg + oldValue + "!";
	    hashMap.computeIfPresent(4, f2);
	    hashMap.computeIfPresent(1, f2);
	    System.out.println("HashMap using computeIfPresent() => " + hashMap);


	}

}
