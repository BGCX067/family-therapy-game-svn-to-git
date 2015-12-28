package family;

public class Dice {
	
	private int value;
	
	public Dice(){
		
		value=new Double(Math.random()*6).intValue()+1;
		
	}
	public int getValue(){
		return value;
	}
	public static void main(String []args){
		
		Dice d1,d2;
		d1=new Dice();
		d2=new Dice();
		
		System.out.println("Roll the dice...");
		System.out.println(d1.getValue());
		System.out.println(d2.getValue());
		//System.out.println(dice1+dice2);
		
		
	}
}
