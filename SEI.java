import java.io.*;
import java.util.*;

//1) Declare the sub class, SEI.
public class SEI extends student {

//2) Define private instance variables house and WBL (meaning how many work based learning hours have they completed)
  private String house;
  private int WBL;

//3) Define default constructor that inherits the super class constructor and sets "house" to SEI and "WBL" to 0.
  public SEI() {
    super();
    house = "SEI";
    WBL = 0;
  }


//4) Define parameterized constructor that takes in a new name, ID, and WBL, passing the first two to the super constructor (I'm not taking in "house" because its an SEI student by nature...)
  public SEI(String newName, String newID, int WBL) {
  super(newName, newID);
  this.WBL = WBL;
}

//5) Define setWBL
public void setWBL(int newWBL) {
  WBL = newWBL;
}

//6 Define getWBL
public int getWBL() {
    return WBL;
}

//7 Define a toString() method so it inherits the super toString() method and adds two new lines displaying house and WBL status.
public String toString() {
    return super.toString() + "\nHouse: " + house + "\nWBL: " + WBL;
  }

//8 Check your curly brackets

//9 Compile this file only and fix any errors in this file

//10 Go to main.java and complete # 5 - 10.  Compile and run after each step.  Check in with me with any issues.
}