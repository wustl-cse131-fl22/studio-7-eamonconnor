package studio7;

public class Die {
	
	private int sides;
	
	public Die(int n) {
		sides = n;
	}
	
	public int Roll() {
		return 1 + (int) (Math.random()* sides);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Die die = new Die(6);
		for (int i = 0; i < 20; i++) {
			System.out.println(die.Roll());
		}

	}

}
