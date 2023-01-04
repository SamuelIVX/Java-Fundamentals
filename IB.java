import java.io.*;
import java.util.*;

//1) Declare the sub class, IB.
public class IB extends student { 

//2) Define private instance variables house and EE (meaning did they submit their extended essay)
  private String house;
  private boolean EE;


//3) Define default constructor that inherits the super class constructor and sets "house" to IB and "EE" to false
public IB() {
  super();
  house = "IB";
  EE = false;
}

//4) Define parameterized constructor that takes in a new name, ID, and EE, passing the first two to the super constructor (I'm not taking in "house" because its an IB student by nature...)

  public IB(String newName, String newID, boolean EE) {
  super(newName, newID);
  this.EE = EE;
}


//5) Define setEE
public void setEE(boolean newEE) {
  EE = newEE;
}

//6 Define getEE
public boolean getEE() {
    return EE;
}

//7 Define a toString() method so it inherits the super toString() method and adds two new lines displaying house and EE status.
  public String toString() {
    return super.toString() + "\nHouse: " + house + "\nEE: " + EE;
  }

//8 Check your curly brackets
//9 Compile this file only and fix any errors in this file

//10 Go to main.java and complete #3 and #4 there, then compile and run main.java.  Check in with me with any issues.
}