package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{

	private Cell[][] data;
	private String letters = "ABCDEFJHIJKLMNOPQRSTUVWXYZ";
	
	public Spreadsheet() {
		data = new EmptyCell[20][12];
		for (int i = 0; i < data.length; i ++){
			for (int j = 0; j < data[i].length; j++){
				data[i][j] = new EmptyCell();
			}
		}
	}

	@Override
	public String processCommand(String command){
//		if (command.contains("clear")){
			if (command.contains(" ")){ // clear A1
				String letter = command.substring(command.indexOf(" ") + 1, command.indexOf(" ") + 2);
				int row = Integer.parseInt(letter);
				String number = command.substring(command.indexOf(" ") + 2);
				int column = Integer.parseInt(number);
				data[row][column] = new EmptyCell();
			}else{ // clear whole sheet
				for (int i = 0; i < data.length; i ++){
					for (int j = 0; j < data[i].length; j++){
						data[i][j] = new EmptyCell();
					}
				}
			}
//		}else if(command.contains("=")){ // assignment 
//			return(getCell(command));
//		}else{ // cell inspection 
			
		//if/else, order matters
		//inspect cells
		//assign string
		//clear all
		//clear cell
		return command;
	}

	public int getRows(){
		int rows = data.length;
		return rows;
	}

	public int getCols(){
		int columns = data[0].length;
		return columns;
	}

	@Override
	public Cell getCell(Location loc){
		int r = loc.getRow();
		int c = loc.getCol();
		return data[r][c];
	}

	@Override
	public String getGridText(){
		
		String topRow = "   ";
		String middle = "";
		
		for (int i = 0; i < 12; i++){
			topRow += ("|" + letters.charAt(i) + "         ");
		}	        
		
		topRow += ("| \n");
		
		for(int j = 0; j < 20 ; j++){
			if (j < 9){
				middle += ((j+1) + "  ");
			}else{
				middle += ((j+1) + " ");
			}
			for(int k = 0; k < 12 ; k++ ){	
				middle += "|" + data[j][k].abbreviatedCellText() ;
			}
			middle += ("|");
			middle += ("\n");
		}
	
		return topRow + middle;
	}

}
