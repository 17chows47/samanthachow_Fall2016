package textExcel;

public class EmptyCell implements Cell {
	String empty;
	
	public EmptyCell(){
		empty = "";
	}
	
	@Override
	public String abbreviatedCellText() {
		// TODO implement abbreviatedCellText in EmptyCell
		return "          ";
	}

	@Override
	public String fullCellText() {
		// TODO implement fullCellText in EmptyCell
		return "";
	}
	

}
