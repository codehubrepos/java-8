import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CreateStreamObjects {

	public static void main(String[] args) {
		
		//Create a Stream
		Stream<String> stream = Stream.of("a","b","c");
		stream.forEach(System.out :: println);
		
		//Create Stream from sources
		Collection<String> collection = Arrays.asList("Java","Spring","Hibernate","Sprint-Boot","Microservices");
		Stream<String> stream2 = collection.stream();
		stream2.forEach(System.out :: println);
	}

}
