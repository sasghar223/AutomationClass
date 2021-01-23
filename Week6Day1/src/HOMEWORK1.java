
public class HOMEWORK1 {
	 int getcal(int a, int b) {
		 int c = a+b;
		return c;
		 
	 }
	 long getcal(long a, long b) {
		 long c = a-b;
		return c;
		 
	 }
	double getcal(double b, double a) {
		double d = b*a;
		return d; 
	}
	
	float getcal(float a, float j) {
		float f = a/j;
		return f;
	}
	public static void main(String[] args) {
		HOMEWORK1 obj = new HOMEWORK1();
		int result = obj.getcal(3,6);
		long result1 = obj.getcal(6L,3L);
		System.out.println(result);
		System.out.println(result1);
	}
	
}
