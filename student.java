import java.io.*;
import java.util.*;

//1) Declare the super class, student.
public class student {

//2) Define private instance variable name and ID

private String name;
private String ID;

//3) Define default constructor with name and ID unknown
public student() {
    name = "n/a";
    ID = "n/a";
  }

//4) Define parameterized constructor that takes in the ame and ID
public student(String name, String ID) {
  super();
  this.name = name;
  this.ID = ID;
}
  
//5) Define setName and setID 
  public void setName(String newName) {
    name = newName;
  }

  public void setID(String newID) {
    ID = newID;
  }

//6 Define getName and getID
public String getName() {
    return name;
}

public String getID() {
  return ID;
}
//7 Define toString() so that when you print an object of this class it clearly displays the name and ID on two different lines (use the escape sequence \n)

  public String toString() {
    return "Name: " + name + "\nID: " + ID;
  }


//8 Check your curly brackets
//9 Compile this file and fix any errors in this file

//10 Go to main.java and complete #1 and #2 there, then compiling and running main.java after each step.  Check in with me with any issues.
}