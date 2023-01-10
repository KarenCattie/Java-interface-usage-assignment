/*
* File name: [PaymeInterfaceTest.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab06]
* Date: [Nov 19, 2022]
* Professor: [Daniel]
* Purpose: [this is the main class for testing the interface Payme]
*/
// LAB 6: PaymeInterfaceTest.java

//This is the test for your interface Payme.

/**
 * This is the main class to test the interface Payme processes Programmer and invoice polymorphically
 * instantiate 6 objects for testing and create a 6 elements array to loop out the display info as requested
 * @author Yalin Su
 * @version 11.0.15
 * @since jdk11.0.15_9
 * @see Programmer
 * @see SalariedProgrammer
 * @see HourlyProgrammer
 * @see CommissionProgrammer
 * @see BasePlusCommissionProgrammer
 * @see Invoice
 * @see Payme
 */
public class PaymeInterfaceTest  {
/**
 * This is the entry point for this program
 * instantiated 6 objects and passed values
 * for testing the interface Payme to process 
 * the method from Programmer and invoice polymorphically
 * @param args passing arguments that is given
 */
public static void main(String[] args) {
	
 //TO DO: IN THIS PORTION OF THE CODE, SEVERAL CHANGES SHOULD BE MADE:
// CREATE SIX-ELEMENTS Payme array HERE 
	
 //START CODE 
	/*
	 * instantiated objects from all the classes that implements interface Payme
	 * and passed the value that is requested
	 */
	Payme objInvoice1 = new Invoice("22776","brakes", 3, 300.00);
	Payme objInvoice2 = new Invoice("33442","gear",5,90.99);
	Payme objSalariedProgrammer = 
			new SalariedProgrammer("Chioma", "Chidimma","345-67-0001",320.00);
	Payme objHourlyProgrammer = 
			new HourlyProgrammer("Amara","Chukwu","234-56-7770",18.95,40.00);
	Payme objCommissionProgrammer = 
			new CommissionProgrammer("Peter","Goodman","123-45-6999", 16500.00, 0.44);
	Payme objBasePlusCommissionProgrammer = 
			new BasePlusCommissionProgrammer("Yalin","Su", "102-34-5888", 1200.00, 0.04, 720.00);
	/*
	 * creates a 6 elements array for the objects that just instantiated above
	 */
	Payme[] paymeObjects = {objInvoice1, objInvoice2, objSalariedProgrammer, objHourlyProgrammer
							, objCommissionProgrammer, objBasePlusCommissionProgrammer};

//END CODE
 

// TO DO: POPULATE THE ARRAY YOU CREATED WITH OBJECTS THAT IMPLEMENT Payable
//CHECK THE OUTPUT FILE AND REUSE EXACTLY THE DETAILS PROVIDED SUCH AS FIRST NAME
// LAST NAME, SOCIAL INSURANCE NUMBER, ETC.

 // START CODE
	
// END CODE


 System.out.println(
    "Payment for Invoices and Programmers are processed polymorphically:\n"); 

 // generically process each element in array paymeObjects
 
 for (Payme currentPayme : paymeObjects) {
    // output currentPayme and its appropriate payment amount
	 /*
	  * added a formatted payment due statement to show the payment due amount for each objects 
	  */
    System.out.printf("%n%s %npayment due: $%,.2f%n", currentPayme.toString(), currentPayme.getPaymentAmount()); 
       
    // instanceof: if the current item that looping is the BasePlusCommissionProgrammer type object
    // 			 , then run this code 
    if (currentPayme instanceof BasePlusCommissionProgrammer) {
       // downcast Payme reference to 
       // BasePlusCommissioProgrammer reference
    	BasePlusCommissionProgrammer programmer = (BasePlusCommissionProgrammer) currentPayme;
    	
       //get the value of base salary from the BasePlusCommissionProgrammer class 
       double oldBaseSalary = programmer.getBaseSalary();
       // get the value of the new base salary after the 10% increase
       programmer.setBaseSalary(1.10 * oldBaseSalary); 
       //formatted the print out statement with the new new base salary 
       System.out.printf("new base salary with 10%% increase is: $%,.2f%n",
          programmer.getBaseSalary());
       /*
        * added a formatted new payment due amount for the base salary after the 10% increase
        * for the base-plus commission programmer
        */
       System.out.printf("payment due: $%.2f%n",currentPayme.getPaymentAmount());
    } 

// TO DO: INSERT YOUR PRINT STATEMENT HERE: ENSURE THAT YOUR 
// OUTPUT FOLLOWS THE OUTPUT SAMPLE PROVIDED

// START CODE 
// END CODE

 }
}
}


