package testinjava;

import javax.swing.JOptionPane;


public class JavaTest {
	
	
	//Global Variables
	
	public static int array[][];
	public static int row = 0;
	
	//Method to calculate the factorial of a number
	public static long factorial(long n){
		
		long fact = 1;
		for(int i = 1; i <= n; i++){
			fact *= i;
		}
		
		return fact;
		
	}
	//creates the empty triangle
	private static void createEmptyTriangle(int row) {

		//sets the size of the triangle to the value "row"
		array = new int [row][];
				
			for(int i = 0; i < row; i++){
				array[i] = new int[i+1];
			
			
			}
		
	}

	
	//calculates the value of the triangle at row n and position k with the nCk formula
	//Pascal's formula: (n , k) = n!/(k!(n-k)!)
	private static int nCk(int n, int k) {

		
		long numerator = factorial(n);
		long denominator = factorial(k) * factorial(n - k);
		int result = (int) (numerator / denominator);
		
		return result;
	}
	
	private static void calcArray() {


		
		int n; //Row #
		int k; //Term #
		

		int z;//| Temporary Values for calculating the # in the triangle
		
		//fills in the values for the triangle at position n , k
		for(n = 0; n < array.length; n++){  
	        for(k = 0; k <= n; k++){  
	        	
	        	z = nCk(n , k);

	        	array[n][k] = (z);

	        }
	       // System.out.print("\n");
	    }		
	}
	


	//prints out the triangle 
	public static void printarray(){
		
		int i;
		int j;
		String display = "";//string is used to print the triangle in an JOptionPane at the end
		
		System.out.println("Triangle content: ");
		display = display + "Triangle Content: " + "\n";
		
		
		for(i = 0; i < array.length; i++){
			for(int w = array.length - i; w > 0; w--){
				System.out.print("  ");
				display = display + "  ";
			}
			for(j = 0; j <= i; j++){
				
				//JOptionPane.showMessageDialog(null, array[i][j]);
				
				 System.out.print(" " + array[i][j] + "  ");	
				 display = display + " " + array[i][j] + "  ";
				 try{
					 Thread.sleep(20);
				 }
				 catch(InterruptedException ignore){
					 
				 }
			}
			System.out.print("\n");
			display = display + "\n";
			
		}
		JOptionPane.showMessageDialog(null, display);
	}


	public static void main(String[] args){
	
		 
		String rowString ="";
		
		rowString = JOptionPane.showInputDialog("Enter the row number upto which Pascal's triangle has to be printed: " );
		
		row = Integer.parseInt(rowString);

		//checks if the number is in the boundaries ( not negative && and not beyond the "long" limit for calculations
		if(row > 0 && row < 21)
		{
		createEmptyTriangle(row);
		printarray();
		calcArray();
		printarray();
		}
		else
		{
			JOptionPane.showMessageDialog(null, "Your Number has to be between 1 and 20!");
		}
		
	}


}
