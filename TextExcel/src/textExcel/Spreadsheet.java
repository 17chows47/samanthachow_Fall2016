package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{

	private Cell[][] data;
	private String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

	public Spreadsheet() {
		data = new Cell[20][12];
		for (int i = 0; i < data.length; i ++){
			for (int j = 0; j < data[i].length; j++){
				data[i][j] = new EmptyCell();
			}
		}
	}

	@Override
	public String processCommand(String command){
		if (command.length() == 0){
			return "";
		}
		String [] userInput = command.split(" " , 3);

		if (userInput[0].toLowerCase().equals("clear")){
			if(userInput.length > 1){ // clear A1
				SpreadsheetLocation location = new SpreadsheetLocation(userInput[1].toUpperCase());
				int rowNum = location.getRow();
				int columnNum = location.getCol();
				data[rowNum][columnNum] = new EmptyCell();
				return getGridText();
			}else{ // clear whole sheet
				clearCells();
				return getGridText();
			}
		}else if(userInput.length > 2){ // cell assignment
			SpreadsheetLocation location = new SpreadsheetLocation(userInput[0].toUpperCase());
			int rowNum = location.getRow();
			int columnNum = location.getCol();
			String text = userInput[2].substring(1, userInput[2].length() - 1);
			data[rowNum][columnNum] = new TextCell(text);
			return getGridText();
		}else{ // cell inspection 
			SpreadsheetLocation location = new SpreadsheetLocation(userInput[0].toUpperCase());
			return getCell(location).fullCellText();
		}
	}
	
	public void clearCells(){
		for (int i = 0; i < 20; i++){
			for (int j = 0; j < 12; j++){
				data[i][j] = new EmptyCell();
			}
		}
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
				middle += "|" + data[j][k].abbreviatedCellText();
			}
			middle += ("|");
			middle += ("\n");
		}
		return topRow + middle;
	}

}
