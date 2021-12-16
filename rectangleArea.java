import java.util.Scanner;

public class rectangleArea{
	public static void main(String[] args) {
		//Creatin a scanner object
		Scanner input = new Scanner(System.in);
		  System.out.println("The Area is shown here");
          //Prompts the user to enter breadth of the rectangle
		   System.out.println("Enter breadth of the rectangle: ");
		     double breadth = input.nextDouble();
		     //Prompts the user to enter lenght of the rectangle
		     System.out.println("Enter length of the rectangle: ");
		     double length = input.nextDouble();
		   //Creating an instance of objcect RecArea
		 Area area1 = new Area();
		area1.lengths = length;
	 area1.breadths = breadth;
  System.out.println("The Area of a the rectangle of length " + area1.lengths + " and breadth of " + area1.breadths + " is " + area1.returnArea());

	}
}