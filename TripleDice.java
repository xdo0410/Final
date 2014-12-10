public class TripleDice extends Dice
{
	private int Value;
	
	public TripleDice()
	{
		Value = Throw()+Throw()+Throw();
	}
}
