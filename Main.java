import java.util.Scanner;

public class Main 
{
	public static void main(String[] args)
	{
		
		Scanner inp = new Scanner( System.in );
		int n_throw = 0;
		int sum = 0;
		
		System.out.print("How many dices you want to play:");
		n_throw = inp.nextInt();
		
		if (n_throw == 1)
		{
			Dice d= new Dice();
			sum = d.Throw();
			System.out.print("Value:"+ sum);
			
		}
		else{
			if(n_throw == 2){
				Dice d1=new Dice();
				Dice d2= new Dice();
				sum = d1.Throw() + d2.Throw();
				System.out.print("Value:"+ sum);
				
			}
			else {
				if(n_throw == 3){
					Dice d1=new Dice();
					Dice d2= new Dice();
					Dice d3= new Dice();
					sum = d1.Throw() + d2.Throw() + d3.Throw();
					System.out.print("Value:"+ sum);
					
				}
				
			}
		}
		
	}
	
	
	
}
