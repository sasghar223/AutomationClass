
public class Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Homework1 obj = new Homework1();
		int result = obj.LargestNum(1,3,7);
		int result1 = obj.LargestNum(1,44,7);
		int result2 = obj.LargestNum(1,200,7);
		System.out.println(result +" "+ result1+" "  + result2);
	}
	
	public int LargestNum (int num1,int num2, int num3)
	{
		if(num1 > num2 && num1 >num3) {
			return num1;
		}else if (num2> num1 && num2>num3) {
			return num2;
		}else {
			return num3;
		}
	
	}

}
