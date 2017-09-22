
//imports Scanner package
import java.util.Scanner;

public class FirstUserInputProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader=new Scanner(System.in);
		
		System.out.print("What is your first name?");
		String name= reader.nextLine();
		
		System.out.print("What is your favorite color?");
		String color=reader.nextLine();
		String str= ("Hi " + name + "," + color + " is a great color!");
		System.out.println(str);
		
		
		
		
		
		

	}

}
