package studio7;

public class Die {
	// instance variables
	private int sides; 
	
	public Die(int sides) {
		this.sides = sides;	
		}
		
	public int roll() {
		int integerValue = 0;
		int roll = (int) (Math.random()*(this.sides - 1));
		
		for (int i = 0; i < roll; i++) { 
			int integerVals = roll * (int) (Math.random()*(this.sides - 1));
			integerValue = integerVals + integerValue;
		}
		System.out.println("Rolled a " + sides + "-sided die: " + integerValue);
		return integerValue;
	}
		
	
	public void meow() {
		System.out.println("This die has " + this.sides + " sides" +  " sides, and the roll value is " + roll());
	}
	
	public static void main(String[]args) {
		Die dieSofia = new Die (6);
		Die dieHolly = new Die (12);
		
		dieSofia.meow();
		dieHolly.meow();
				
	}
	
	}
