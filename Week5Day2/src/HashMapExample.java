import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>  Department= new HashMap< Integer, String >();
		Department.put(1001, "development");
		Department.put(1002, "Testing");
		Department.put(1003, "security ");
		
		for(Integer i:Department.keySet()) {
			
			System.out.println("Printing all values : "+ Department.get(i));
		}
		
		
		
		
	}

}
