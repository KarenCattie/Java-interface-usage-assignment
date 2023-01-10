/*
* File name: [Payme.java ]
* Author: [ Yalin Su, ID#040791845]
* Course: CST8132 – OOP
* Assignment: [Lab06]
* Date: [Nov 19, 2022]
* Professor: [Daniel]
* Purpose: [this is the interface class that contain getPaymentAmount method for concrete subclasses to implement]
*/
/**
 * this is the interface class that contain getPaymentAmount method for concrete subclasses to implement
 * @author Yalin Su
 *
 */
public interface Payme {
	/**
	 * This is the getPaymentAmount method for concrete subclasses to implement
	 * @return the payment amount of the subclasses that implements this method
	 */
	double getPaymentAmount();
}
