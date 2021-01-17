
public class Homework2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Homework2 obj = new Homework2();
		String v = "aSmile";
		String v1 = "bSmile";
		boolean result;
		boolean result1;
		boolean result2;
		result = obj.monkeyTrouble(v, v1);
		result1 = obj.monkeyTrouble(v1, v1);
		result2 = obj.monkeyTrouble(v, v);
		System.out.println(result +" "+ result1 +" "+ result2);
	}
	
	
	
	public boolean monkeyTrouble(String v, String v1)
	{
	if(v==v1) {
		return true; 
	} else {
		return false; 
	}
	}
}
