
/*
 * Write a program that displays the result of 
 * 
 * 7.5 x 6.5 - 4.5 x 3
 * --------------------
 *   47.5 - 5.5
 * 
 * */
public class Main {
	public static void main(String []args) {
		double result;
		
		result = ( (7.5 * 6.5) - (4.5 * 3.0) ) / ( 47.5 - 5.5) ;
		System.out.println("The result of this expression is:\n");
		
		System.out.print("    7.5 x 6.5 - 4.5 x 3 "
				       + "\n ------------------------ =" + result 
				        +" \n         47.5 - 5.5");
	}
}
