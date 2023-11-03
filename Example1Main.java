import java.util.Scanner;

public class Example1Main {

	public static void main(String[] args) {
		
		//take in a mark
		
		//output the grade where
		
		//above 100 or below zero is not valid
		
		//A between 85 -100
		//B 70 - 85
		//C 55 - 69
		//D 40 - 54
		//fail
		
		double mark; 
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter the mark: ");
		mark = input.nextDouble();
		
		if (mark > 100 || mark < 0){
			System.out.println("Not valid range");
		} else if(mark >= 85 && mark <= 100){
			System.out.println("A");
		}else if(mark >= 70 && mark < 85){
			System.out.println("B");
		}else if(mark >= 55 && mark < 70){
			System.out.println("C");
		}else if(mark >= 40 && mark < 55){
			System.out.println("D");
		}else{
			System.out.println("Fail");
		}
	}

}
