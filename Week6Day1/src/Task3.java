
public class Task3 {
	
 int getsum(int a, int b) {
	 int c = a+b;
	return c;
	 
 }
 
 long getsum(long a, long b) {
	 long c = a+b;
	return c;
	 
 }
 
 void getsum(String name, int b) {
	 
	 System.out.println("print the String  "+ name+ ", print the num "+ b);
	 
 }
 
	public static void main(String[] args) {
		Task3 obj = new Task3();
		 int result = obj.getsum(2,3);
		System.out.println(result);
		obj.getsum("sam", 324);
	
}
	}
