package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid
{

	private EmptyCell data[][];
	
	public Spreadsheet() {
		data = new EmptyCell[12][20];
	}

	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRows(){
		return data.length;
	}

	@Override
	public int getCols(){
		return data[0].length;
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
