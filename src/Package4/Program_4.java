package Package4;

import java.util.Scanner;

public class Program_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		     	Scanner input_value= new Scanner(System.in);
				System.out.println("Enter your name");
				//input_value.next();
				String name=input_value.next();
				//name+=input_value.nextLine();
				System.out.println(name);
				
				//********************************************************************************************************
				
				System.out.println("Enter your student ID ");
				int ID=input_value.nextInt();
				System.out.println(ID);
				
				System.out.println("Enter your study field ");
				String study_field=input_value.next();
				//study_field+=input_value.nextLine();
				
				System.out.println("Here is entered information: "+name+" ---"+ID+ "----"+study_field);
				System.out.println("The end of the program1");
				System.out.println("The end of the program2");
				// Hello
				// First commit step
				System.out.println("------------------------------------------------------------------------------------");
				//*******************************************************************************************************
				
				

			}

	
	}
