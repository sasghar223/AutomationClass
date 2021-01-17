import java.util.HashMap;

public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer, String>  salary= new HashMap< Integer, String >();
		salary.put(1001, "sam");
		salary.put(1002, "ali");
		salary.put(1003, "seth ");
		
		for(Integer i:salary.keySet()) {
			
			System.out.println("Print salary "+i+" Printing all values : "+ salary.get(i));
		}
		

	}

}
