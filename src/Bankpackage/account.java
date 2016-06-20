package Bankpackage;
/**
 * 
 * @author <h2>Afshan Shakoor</h2>
 *  <font color=blue>
 * 
 *<b> This class saves the information about  Account</b>
 */


public abstract class account {
	int number;
	double bal;
	/**
	 * <font color=green>
	 * @return <i> This method returns number</i>
	 */
	public int getnumber()
	{
		return number;
	}
	/**
	 *  <font color=green>
	 * @return  <i> This method returns balance</i>
	 */
	public double getbal()
	{
		return bal;
	}
	/**
	 *  <font color=green>
	 * @return<i> this method return the reference of class Person</i>
	 */
	public person getowner()
	{
		person pp=new person();
		return pp;
	}
	/**
	 *  <font color=green>
	 * @param d <i> this method takes the value double</i> 
	 */
		
	
	public void deposit(double d)
	{
		
	}
	/**
	 * <font color=green>
	 * <i>this is an abstract method</i>
	 * 
	 * @param d it pass the value double d
	 * @return it returns the boolean
	 */

	abstract public boolean withdraw(double d);
}
