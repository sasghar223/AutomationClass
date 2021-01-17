import java.util.ArrayList;
import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {
		ArrayList<String> Colors = new ArrayList<String>();
		Colors.add("red");
		Colors.add("green");
		Colors.add("blue");
		Colors.add("yellow");
		Colors.add("orange");
		System.out.println("DISPLAY Colors : "+Colors);
		Colors.get(1);
		System.out.println("DISPLAY Colors INDEX : "+Colors.get(1));
		
		Scanner Addcolor = new Scanner(System.in);
		  System.out.println("input color : ");
		//String color = Addcolor.nextLine();
	    //Colors.add(color);
	    System.out.println(Colors);
	    String color1 ="";
	    while(!color1.equals("q")){
        	System.out.println("add a color : ");
        	color1 = Addcolor.nextLine();
        	if(!color1.equals("q"))
        	{
        	Colors.add(color1);
        	}
        	  System.out.println(Colors);
        	  if (color1 == "q"){
                  break;
//        		  System.out.println("quit");
        		 
        	  }
        	  
	    }
	    

	    
	   
	}

}
