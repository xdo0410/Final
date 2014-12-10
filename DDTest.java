import java.util.Scanner;


public class DDTest {
	public static void main(String[] args)
	{
	Scanner inp = new Scanner( System.in );
	int n_throw = 0;
	int sum = 0;
	
	System.out.print("How many dices you want to play:");
	n_throw = inp.nextInt();
	
	if (n_throw == 1)
	{
		DoubleDice dd= new DoubleDice();
		sum = dd.GetValue();
		System.out.print("Value:"+ sum);
	}
	
	else if(n_throw == 2)
	{
		DoubleDice dd1= new DoubleDice();
		DoubleDice dd2= new DoubleDice();
		sum = dd1.GetValue() + dd2.GetValue();
		System.out.print("Value:"+ sum);
	}
	
	else if(n_throw == 3)
	{
		DoubleDice dd1= new DoubleDice();
		DoubleDice dd2= new DoubleDice();
		DoubleDice dd3= new DoubleDice();
		sum = dd1.GetValue() + dd2.GetValue() + dd3.GetValue();
		System.out.print("Value:"+ sum);
	}
}
}
