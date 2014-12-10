public class DoubleDice extends Dice
{
	int x;

	public DoubleDice() {

	}
	
	public int GetValue() {
		x = 1 + (int) (Math.random() * 12);
		return x;
	}
}
