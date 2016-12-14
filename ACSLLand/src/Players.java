import java.util.Scanner;

public class Players {
	private int position;
	
	public Players(){
		position = 0;
	}
	
	public void setPosition(int position){
		this.position = position;
	}
	public int getPosition(){
		return this.position;
	}
	

	public void main(){
		Scanner userInput = new Scanner(System.in);
	    System.out.println("Enter the lines of games played: ");
	    String input = userInput.nextLine();

		int gameBoard[] = new int[41];
		Players playerA = new Players();
		playerA.setPosition(0);
		Players playerB = new Players();
		playerB.setPosition(0);		
		
        String [] game = input.split(",");
        //I don't know how to put the split stuff into an int array...for loop?
        //help parse this part
        int [] rollsArray = new int[game.length];
        
        for (int i = 1; i <= 5; i++){
        	for(int j = 0; j < game.length; j++){
        		rollsArray[j] = game[j];
        	}
        }
        	
        for(k = 1; k <= rollsArray.length; k++){
        	movePlayer()
        }
      
	}
	
	public void movePlayer(Array gameNumber){
		while(rollsAray[i] != 0){
			if (rollsArray.index % 2 == 0){
				movePlayer(playerA);
			}else{
				movePlayer(playerB);
			}
			if(roll == 4 || roll == 6){
				givePenalty(roll);
			}else{
				position += roll;
				bumpPlayer;
			}
		}
	}
	
	public void givePenalty(int roll){
		if (roll == 4){
			//go back 4
			//if index negative go to index 0 
			bumpPlayer();
		}
		if (roll == 6){
			//go back 6
			//if index negative go to index 0
			bumpPlayer;
		}
	}
	
	public void bumpPlayer(){
		if(//value at the current space == 2)
		{
		}
	}
}