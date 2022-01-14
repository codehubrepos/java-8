import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterExample {

	public static void main(String[] args) {
		
		// Traditional way to filter the product whose price is more than 25000
		List<Product> list = new ArrayList<>();
		for (Product product : getProducts()) {
			if(product.getPrice() > 25000f)
				list.add(product);
		}
		
		System.out.println("******************Filtering Using Old Way******************");
		for (Product product : list) {
			System.out.println(product);
		}
		
		//Filtering Using Stream API
		System.out.println("******************Filtering Using Steam API******************");
		List<Product> list2 = getProducts()
				.stream().filter((product) -> product.getPrice() > 25000f)
				.collect(Collectors.toList());
		
		list2.forEach(System.out :: println);

	}
	
	private static  List<Product> getProducts(){
		List<Product> list = new ArrayList<>();
		list.add(new Product(1,"HP Laptop",25000f));
		list.add(new Product(2,"Dell Laptop",30000f));
		list.add(new Product(3,"Lenevo Laptop",28000f));
		list.add(new Product(4,"Sony Laptop",28000f));
		list.add(new Product(5,"Apple Laptop",90000f));
		return list;
	}

}

class Product {

	private int id;
	private String name;
	private float price;
	
	public Product(int id, String name, float price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
