/*
* File name: [CommissionProgrammer.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab06]
* Date: [Nov 19, 2022]
* Professor: [Daniel]
* Purpose: [this is the concrete subclass that inherit from abstract superclass Programmer]
*/
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!

//CommissionProgrammer.java

//CommissionProgrammer class extends Programmer.
/**
 * this is the concrete subclass that inherit from abstract superclass Programmer,
 * it contains it's own variables
 * @author Yalin Su
 *
 */
public class CommissionProgrammer extends Programmer { 

private double grossSales; // gross weekly sales
private double commissionRate; // commission percentage
/**
 * 
 * @param first the first name of the commission programmer that inherited from superclass Programmer
 * @param last the last name of the commission programmer that inherited from superclass Programmer
 * @param ssn the social security number of the commission programmer that inherited from superclass Programmer
 * @param grossSales the gross sales of the commission programmer
 * @param commissionRate the commission rate of the commission programmer
 */
//constructor
public CommissionProgrammer(String first, String last, 
String ssn, double grossSales, double commissionRate) {
super(first, last, ssn);

if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate 
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
this.commissionRate = commissionRate;
} 
/**
 * setter method for the gross sales of the commission programmer
 * @param grossSales the gross sales of the commission programmer
 */
//set gross sales amount on the creation of apps
public void setGrossSales(double grossSales) {
if (grossSales < 0.0) { // validate
  throw new IllegalArgumentException("Gross sales must be >= 0.0");
}

this.grossSales = grossSales;
} 
/**
 * getter method for accessing the grossSales variable
 * @return grossSales
 */
//return gross sales amount 
public double getGrossSales() {
return grossSales;
} 
/**
 * setter method for the the commission rate of the commission programmer
 * @param commissionRate the commission rate of the commission programmer
 */
//set commission rate
public void setCommissionRate(double commissionRate) {
if (commissionRate <= 0.0 || commissionRate >= 1.0) { // validate
  throw new IllegalArgumentException(
     "Commission rate must be > 0.0 and < 1.0");
}

this.commissionRate = commissionRate;
} 
/**
 * getter method for accessing the commissionRate variable
 * @return commissionRate
 */
//return commission rate
public double getCommissionRate() {
return commissionRate;
} 

//calculate earnings; override abstract method earnings in Programmer.

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO
/**
 * calculate payment amount; override abstract method getPaymentAmount in Programmer
 * @return getCommissionRate() * getGrossSales() the commission programmer's payment amount
 */
@Override                                                           
public double getPaymentAmount(){                                            
return getCommissionRate() * getGrossSales();                    
}                                             

//return String representation of CommissionProgrammer object
/**
 * This is the CommissionProgrammer subclass's toString method that inherited and override from superclass Programmer
 * @return String representation of CommissionProgrammer object
 */
@Override                                  
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     
public String toString() {
	return String.format("commission programmer: %s%n%s: $%,.2f; %s:%, .2f"
						, super.toString()
						, "gross sales"
						, getGrossSales()
						, "commission rate"
						, getCommissionRate());
}
//END

}

