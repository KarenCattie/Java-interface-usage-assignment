/*
* File name: [BasePlusCommissionProgrammer.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab06]
* Date: [Nov 19, 2022]
* Professor: [Daniel]
* Purpose: [this is the concrete subclass that inherit from subclass CommissionProgrammer]
*/
// THIS IS A CODE FILE FOR LAB 6. THIS CODE FILE REQUIRES SOME MODIFICATIONS!!!


//BasePlusCommissionProgrammer.java
//BasePlusCommissionProgrammer class extends CommissionProgrammer.
/**
 * this is the concrete subclass that inherit from subclass CommissionProgrammer
 * it contains it's own variables
 * @author Yalin Su
 *
 */
public class BasePlusCommissionProgrammer extends CommissionProgrammer { 

private double baseSalary; // base salary per week
/**
 * 
 * @param first the first name of the base-plus commission Programmer that inherited from subclass CommissionProgrammer
 * @param last the last name of the base-plus commission Programmer that inherited from subclass CommissionProgrammer
 * @param ssn the social security number of the base-plus commission Programmer that inherited from subclass CommissionProgrammer
 * @param grossSales the gross sales of the base-plus commission Programmer that inherited from subclass CommissionProgrammer
 * @param commissionRate the commission rate of the base-plus commission Programmer that inherited from subclass CommissionProgrammer
 * @param baseSalary the base salary of the base-plus commission Programmer
 */
//constructor
public BasePlusCommissionProgrammer(String first, String last, 
String ssn, double grossSales, double commissionRate, double baseSalary) {
super(first, last, ssn, grossSales, commissionRate);

if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
}
/**
 * setter method for the baseSalary of the base-plus commission programmer
 * @param baseSalary the base salary of the base-plus commission Programmer
 */
//set base salary
public void setBaseSalary(double baseSalary) {
if (baseSalary < 0.0) { // validate baseSalary                  
  throw new IllegalArgumentException("Base salary must be >= 0.0");
}

this.baseSalary = baseSalary;                
} 
/**
 * getter method for accessing the baseSalary variable
 * @return baseSalary
 */
//return base salary
public double getBaseSalary() {
return baseSalary;
}

//calculate earnings; override method earnings in CommissionProgrammer

//MODIFY THIS PORTION. WHY WILL THIS PORTION OF YOUR CODE REQUIRE MODIFICATION?
//PROVIDE THE ANSWER TO THIS QUESTION TO YOUR PROFESSOR DURING DEMO

/**
 * calculate payment amount; inherited and override method getPaymentAmount in CommissionProgrammer
 * @return payment amount for the base salary after the 10% increase for the base-plus commission programmer
 */
@Override                                                            
public double getPaymentAmount() {                                             
return getBaseSalary() + super.getPaymentAmount();                        
} 

/**
 * This is the BasePlusCommissionProgrammer subclass's toString method that inherited and override from subclass CommissionProgrammer
 * @return String representation of BasePlusCommissionProgrammer object
 */
//return String representation of BasePlusCommissionProgrammer object
@Override     
public String toString() {
	return String.format("base-plus %s; %s: $%,.2f"
						, super.toString()
						, "base salary"
						, getBaseSalary());
}                                       
//TO DO: COMEPLETE THIS PORTION. Format your solution according to sample output.     
//START     

//END


}



