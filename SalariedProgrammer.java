/*
* File name: [SalariedProgrammer.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab06]
* Date: [Nov 19, 2022]
* Professor: [Daniel]
* Purpose: [this is the concrete subclass that inherit from abstract superclass Programmer]
*/
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//SalariedProgrammer.java
//SalariedProgrammer concrete class extends abstract class Programmer.
/**
 * this is the concrete subclass that inherit from abstract superclass Programmer,
 * it contains it's own variables
 * @author Yalin Su
 *
 */
public class SalariedProgrammer extends Programmer {
private double weeklySalary;
/**
 * 
 * @param first the first name of the salary programmer that inherited from superclass Programmer
 * @param last the last name of the salary programmer that inherited from superclass Programmer
 * @param ssn the social security number of the salary programmer that inherited from superclass Programmer
 * @param weeklySalary the weekly salary of the salary programmer
 */
//constructor
public SalariedProgrammer(String first, String last, 
String ssn, double weeklySalary) {
super(first, last, ssn); 

if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 
/**
 * setter method for the the weeklySalary of the salary programmer
 * @param weeklySalary the weekly salary of the salary programmer
 */
//set salary
public void setWeeklySalary(double weeklySalary) {
if (weeklySalary < 0.0) {
  throw new IllegalArgumentException(
     "Weekly salary must be >= 0.0");
}

this.weeklySalary = weeklySalary;
} 
/**
 * getter method for accessing the weeklySalary variable
 * @return the weekly salary of the salary programmer
 */
//return salary
public double getWeeklySalary() {
return weeklySalary;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/**
 * override abstract method getPaymentAmount in Programmer
 * @return the salary programmer's payment amount
 */
@Override                                                           
public double getPaymentAmount() {  
return getWeeklySalary();                                        
}                                             

/**
 * This is the SalariedProgrammer subclass's toString method that inherited and override from superclass Programmer
 * @return String representation of SalariedProgrammer object
 */  
@Override        
public String toString() {
	return String.format("salaried programmer: %s%n%s: $%,.2f"
						, super.toString()
						,"weekly salary"
						, getWeeklySalary());
}
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END
}

