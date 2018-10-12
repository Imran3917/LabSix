
import java.util.Scanner;
import java.util.Random; 
public class Lab6 {
	
	public static void main(String arg[]){
		Scanner scnr = new Scanner(System.in);
		System.out.println("Welcome to the Grand Circus Casino!\n\n");
		int roll = 0;
		char ch;
		do{
			System.out.print("How many sides should each die have? ");
			int num = scnr.nextInt();
			
			System.out.println("\n\nRoll : "+(++roll));
			
			rollDice();
			
			System.out.print("Roll again?(y/n):");
			ch = scnr.next().charAt(0);
			
			System.out.print("\n\n");
			
		}while(ch == 'y');
	}
	
	static void rollDice(){
		Random random = new Random();
		int dice1 = random.nextInt(6) + 1;
		int dice2 = random.nextInt(6) + 1;
		
		System.out.println(dice1);
		System.out.println(dice2);
		
		
		

	}
	
	
	


}


