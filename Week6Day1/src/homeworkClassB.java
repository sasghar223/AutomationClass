
public class homeworkClassB extends homeworkClassA{
	
	public int mymethod(int num, int num1) {
		int c = num * num1;
		return c;
	}
	public long mymethod(long num, long num1) {
		long c = num / num1;
		return c;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		homeworkClassA obj1 = new homeworkClassA();
		homeworkClassB obj2 = new homeworkClassB();
		int result= obj1.mymethod(3,4);
		long result1= obj1.mymethod(8L,4L);
		int resul2= obj2.mymethod(3,4);
		long result3= obj2.mymethod(8L,4L);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(resul2);
		System.out.println(result3);
		
	}

}
