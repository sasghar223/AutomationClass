import java.util.HashMap;

public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String>  Book= new HashMap< String, String >();
		Book.put("book1", "sam");
		Book.put("book2", "ali");
		Book.put("book3", "seth ");
		
		for(String i:Book.keySet()) {
			
			System.out.println("Print salary "+i+" Printing all values : "+ Book.get(i));
		}
		
		
		String returnauthor = Book.get("book2");
		System.out.println(returnauthor);
		Boolean Bookexist = Book.containsKey("book1");
		System.out.println(Bookexist);

	}

}
