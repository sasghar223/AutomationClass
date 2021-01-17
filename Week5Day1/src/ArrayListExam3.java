
public class ArrayListExam3 {

	public static void main(String[] args) {
//		int num = 10;
//		int num1 = 5;
		ArrayListExam3 obj= new ArrayListExam3();
		boolean result;
		result = obj.makes10(10,5);
		System.out.println(" result : "+obj.makes10(10,5));
	
	}
	
	public boolean makes10(int num1,int num2)
	{
		int sum=0;
		boolean var=false;
		sum=num1+num2;
		if(num1==10 || num2==10 || sum==10)
		{
			var=true;
		}
		else
		{
			var=false;
		}
		
		return var;
		
		
		
	}

}
