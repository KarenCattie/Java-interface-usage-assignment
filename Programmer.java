/*
* File name: [Programmer.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab06]
* Date: [Nov 19, 2022]
* Professor: [Daniel]
* Purpose: [this is the abstract superclass that contains the most generic variables and methods for all different types of programmer
* 			needs, and implements Payme interface]
*/
// LAB 6: YOU ARE REQUIRED TO MODIFY THIS CODE!!!

//Programmer.java

//Programmer - This is an abstract superclass that IMPLEMENTS the Payme interface.

//SOME MODIFICATION ARE REQUIRED IN THIS SECTION OF YOUR HERE - LOOK CLOSELY!!!
/**
 * this is the abstract superclass that contains the most generic variables and methods 
 * for all different types of programmer needs, and implements Payme interface
 * @author Yalin Su
 *
 */
public abstract class Programmer implements Payme  {

private String firstName;
private String lastName;
private String socialSecurityNumber;
/**
 * 
 * @param first the first name of the programmer
 * @param last the last name of the programmer
 * @param ssn the social security number of the programmer
 */
//three-argument constructor
public Programmer(String first, String last, String ssn) {
 firstName = first;
 lastName = last;
 socialSecurityNumber = ssn;
}
/**
 * getter method for accessing the first name variable
 * @return firstName
 */
public String getFirstName() {
	return firstName;
}
/**
 * getter method for accessing the last name variable
 * @return lastName
 */
public String getLastName() {
	return lastName;
}
/**
 * getter method for accessing the social security number variable
 * @return socialSecurityNumber
 */
public String getSocialSecurityNumber() {
	return socialSecurityNumber;
}

/** CHANGES ARE REQUIRED IN THIS SECTION. 
* THINK OF THE BEST WAY TO ACCESS PRIVATE VARIABLES.
* IN THIS PORTION OF YOUR CODE INCLUDE ALL OF SUCH THAT APPLIES.
*/


//return String representation of Programmer object
/**
 * This is the Programmer superclass's toString method that returns the formatted string to display info as requested
 * @return String representation of Programmer object
 */
public String toString() {
return String.format("%s %s%nsocial security number: %s"  
				   , getFirstName()
				   , getLastName()
				   , getSocialSecurityNumber());
} 


//Note: We do NOT implement Payme method getPaymentAmount() here. 
// THEREFORE, TO AVOID A COMPILATION ERROR, YOU SHOULD DECLARE THIS CLASS AS....??


// abract method must be overriden by concrete subclasses
public abstract double getPaymentAmount(); /** No implementation here. DO YOU KNOW WHY? What should this method be?*/
} 


