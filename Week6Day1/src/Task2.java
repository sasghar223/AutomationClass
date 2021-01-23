
public class Task2 extends task1 {
	
	
	public int mymethod(int a, int c,int g) {
		int b = a * c * g;
		return b; 
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task2 obj2 = new Task2();
		task1 obj1 = new task1();
		int result = obj2.mymethod(2,4,6);
		int result1= obj1.mymethod(4,6);
		System.out.println(result);
		System.out.println(result1);
	}

}
