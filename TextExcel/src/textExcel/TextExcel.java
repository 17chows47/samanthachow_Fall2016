package textExcel;


import java.io.FileNotFoundException;

import java.util.Scanner;

// Update this file with your own code.

public class TextExcel
{

	public static void main(String[] args){
		Spreadsheet sheet = new Spreadsheet();
		Scanner input = new Scanner(System.in);
		String declaration = input.nextLine();
		while (!declaration.equals("quit")) {
			System.out.println(sheet.processCommand(declaration));
			
		}
			
	}
}
