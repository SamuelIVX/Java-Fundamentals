//This file is for instanstiating and interacting with objects created from classes in this folder
//You the database manager, are perfect, and don't make input errors so we aren't going to worry about input validation.  You also know all the methods in all the classes, so you don't need a fancy user interface, you just do things directly.

//javac Main.java and java Main

import java.io.*;
import java.util.*;


public class Main{
	
// declaring the "main" method (below) requires this special format.  The main method tells java to look here for what to actually run.  You can name the class (above)  main, or something else
	public static void main(String[] args){
    System.out.println("-------------------");
		System.out.println("Testing student:");


	//*********COMPILE AND RUN AFTER EACH STEP!!!!!	************
		
	//1) After creating the student class, instantiate a default student object and print the object.  This will test your toString() method and your default constructor.
    student createStudent = new student();
    System.out.println("\"Default Constructor\"");
    System.out.println(createStudent);
    
	//2) Now instantiate an student with a name and ID number using the parameterized constructor, and print the object.  Make sure it prints the info you passed to it.
    System.out.println("\"Parameterized Constructor\"");
    student paraStudent = new student("samuel", "218510287");
    System.out.println(paraStudent);

    System.out.println("-------------------");
    System.out.println("Testing IB:");
	//3) After creating the IB class, instantiate a default IB object and print it. This will test your IB toString() method and your default constructor. Make sure it behaves as intended.
    System.out.println("\"Default Constructor\"");
    IB createIB = new IB();
    System.out.println(createIB);

		
	//4) Now instantiate an IB student with a name, ID number and true or false for EE using the parameterized constructor, and print it.  Make sure it prints the info you passed to it, as well as the "House" field
    System.out.println("\"Parameterized Constructor\"");
    IB paraIB = new IB("josh", "657892134", true);
    System.out.println(paraIB);

    System.out.println("-------------------");
		System.out.println("Testing SEI:");
		
	//5) After creating the SEI class, instantiate a default SEI object and print it. This will test your SEI toString() method and your default constructor. Make sure it behaves as intended.
    System.out.println("\"Default Constructor\"");
    SEI createSEI = new SEI();
    System.out.println(createSEI);

	//6) Now instantiate a new SEI student with a name, ID number, and a number of WBL hours using the parameterized constructor, and print it.  Make sure it prints the info you passed to it, as well as the "house" field.  
    System.out.println("\"Parameterized Constructor\"");
    SEI paraSEI = new SEI("bobby", "786203849", 88);
    System.out.println(paraSEI);

    System.out.println("-------------------");
		System.out.println("Testing setters and getters:");
		
	//7) Use the setter to change the WBL hours of your SEI object.
    paraSEI.setWBL(120);
    
	//8 Modify the command below to to display the WBL hours only of your SEI object.  Make sure the result reflects the change made in #7
    
		System.out.println("New WBL Hours: " + paraSEI.getWBL());
    
	//9 You should realize that you can print any return method, like I did in #8.  Modify the lines of code below to prompt the user to change the name of your IB student to their preferred name, and then display it...
    System.out.println("-------------------");
    Scanner input = new Scanner(System.in);
		System.out.println("Input name change: ");	
    paraIB.setName(input.nextLine());
		System.out.println("Your name has been changed to: " + paraIB.getName());

		
	//10 Create one more test of your class system.  Explain what you are doing.


    
	}//ends main

}//ends class