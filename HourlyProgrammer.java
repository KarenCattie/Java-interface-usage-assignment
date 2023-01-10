/*
* File name: [HourlyProgrammer.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab06]
* Date: [Nov 19, 2022]
* Professor: [Daniel]
* Purpose: [this is the concrete subclass that inherit from abstract superclass Programmer]
*/
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

// HourlyProgrammer.java
// HourlyProgrammer class extends Programmer.
/**
 * this is the concrete subclass that inherit from abstract superclass Programmer,
 * it contains it's own variables
 * @author Yalin
 *
 */
public class HourlyProgrammer extends Programmer{
private double wage; // wage per hour
private double hours; // hours worked for week
/**
 * 
 * @param first the first name of the hourly programmer that inherited from superclass Programmer
 * @param last the last name of the hourly programmer that inherited from superclass Programmer
 * @param ssn the social security number of the hourly programmer that inherited from superclass Programmer
 * @param wage the wage of the hourly programmer
 * @param hours the hours of the hourly programmer
 */
//constructor
public HourlyProgrammer(String first, String last,
String ssn, double wage, double hours) 
{
super(first, last, ssn);

if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.wage = wage;
this.hours = hours;
} 
/**
 * setter method for the the wage of the hourly programmer
 * @param wage the wage of the hourly programmer
 */
//set wage
public void setWage(double wage) {
if (wage < 0.0) { // validate wage
  throw new IllegalArgumentException(
     "Hourly wage must be >= 0.0");
}

this.wage = wage;
} 
/**
 * getter method for accessing the wage variable
 * @return wage
 */
//return wage
public double getWage() {
return wage;
} 
/**
 * setter method for the the hours of the hourly programmer
 * @param hours the hours of the hourly programmer
 */
//set hours worked
public void setHours(double hours) {
if ((hours < 0.0) || (hours > 168.0)) { // validate hours
  throw new IllegalArgumentException(
     "Hours worked must be >= 0.0 and <= 168.0");
}

this.hours = hours;
} 
/**
 * getter method for accessing the hours variable
 * @return hours
 */
//return hours worked
public double getHours() {
return hours;
} 

//calculate earnings; override abstract method earnings in Programmer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/**
 * calculate payment amount; override abstract method getPaymentAmount in Programmer
 * @return the hourly programmer's payment amount
 */
@Override                                                           
public double getPaymentAmount() {                                            
if (getHours() <= 40) { // no overtime                           
  return getWage() * getHours();   
}
else {                                                             
  return 40 * getWage() + (getHours() - 40) * getWage() * 1.5;
}
}                                          

//return String representation of HourlyProgrammer object   
/**
 * This is the HourlyProgrammer subclass's toString method that inherited and override from superclass Programmer
 * @return String representation of HourlyProgrammer object
 */
@Override       
public String toString() {
	return String.format("hourly programmer: %s%n%s: $%,.2f; %s:%, .2f"
						, super.toString()
						, "hourly wage", getWage()
						, "hours worked", getHours());
}

//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
// INSERT YOUR CODE
//END

                     
}

