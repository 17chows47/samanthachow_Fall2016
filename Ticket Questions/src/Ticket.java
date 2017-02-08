public abstract class Ticket {
	private int number = 0;
	private static int getNextNum(number){
		this.number = number + 1;
	}
	public Ticket (int number){
		this.number = getNextNum(number);
	}
	public double getPrice();
	public String toString(){
		return "Number: " + number + ", Price: " + getPrice();
	}
}
