import java.util.ArrayList;

public class ArrayListExam2 {

	public static void main(String[] args) {
		ArrayList<String> Names = new ArrayList<String>();
		
		Names.add("ali");
		Names.add("sam");
		Names.add("sarah");
		Names.add("seemal");
		Names.add("emily");
			for(int i=0; i<Names.size();i++) {
				System.out.println("THIS IS PRINTING ALL VAlUES : "+Names.get(i));
			}


	}

}
