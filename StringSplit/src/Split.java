/* Samantha Chow
 * 10/30/16
 * APCS Period 1
 * Split String
 * 
 * This Program takes in a string without spaces and with spaces, the contents of a sandwich
 * and returns the items inside the pieces of bread, but not anything outside the bread.
 * Returns "not a sandwich if it's not a sandwich
 */

import java.util.Arrays;

public class Split
{

	public static void main(String[] args) 
	{
		//Playing around with Split method
		String phrase = "The best cookies in the world are cookies made in the oven";
		String find = "cookies";
		System.out.println(Arrays.toString(phrase.split(find)));
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		System.out.println(Arrays.toString("I reallyreally like apples!".split("really")));
		
		
		// bread = NOT
		insideSandwich("bread");
		// bread x = NOT
		insideSandwich("breadmeat");
		 //bread bread = NOT
		insideSandwich("breadbread");
		 // bread bread x = NOT
		insideSandwich("breadbreadmeat");
		// x bread = NOT
		insideSandwich("saucebread");
		// x = NOT
		insideSandwich("meat");
		// x bread y = NOT
		insideSandwich("sauce bread meat");
		// x bread y bread = Y
		insideSandwich("bananabreadonemeatbread");
		 //bread x bread = X
		insideSandwich("breadtwomeatbread");
		 // bread x bread y bread = XY
		insideSandwich("breadcheesebreadlettucebread");
		 //x bread y bread z = Y
		insideSandwich("bananabreadthreemeatbreadsauce");
		 // bread x bread y = X
		insideSandwich("breadfourmeatbreadsauce");
		// sandwich with spaces 
		splitSandwichSpaces("sauce bread five meat with spaces bread");
		
	}
		
		public static void insideSandwich(String sandwich){	
			// no bread = not a sandwich
			if(sandwich.indexOf("bread") < 0){
				System.out.println("Not a Sandwich");
			}
			// one bread = not a sandwich 
			String substringAfterFirstBread = sandwich.substring(sandwich.indexOf("bread")+5); 
			//location of potential second bread
			if(substringAfterFirstBread.indexOf("bread") <= 0){
				System.out.println("Not a Sandwich");
			}else{
				String stuffNotBread [] = sandwich.split("bread");
				// x bread y bread = X 
				if((sandwich.indexOf("bread") > 0 ) && (substringAfterFirstBread.indexOf("bread") > 0)){
					for(int i = 1 ; i < stuffNotBread.length; i++){
						System.out.print(stuffNotBread[i]);
					}
				// normal sandwich (bread x bread) = sandwich
				}else if(substringAfterFirstBread.indexOf("bread") > 0 ){
					for(int i = 0; i < stuffNotBread.length; i++){
						System.out.print(stuffNotBread[i]);
					}
				// x bread y bread z = Y
				}else if(sandwich.indexOf("bread") > 0){
					for(int i = 1; i < stuffNotBread.length-1; i++){
						System.out.print(stuffNotBread[i]);
					}
				// bread x bread y = X
				}else{
					for (int i = 0; i < stuffNotBread.length-1; i++){
						System.out.print(stuffNotBread[i]);
					}
				}
				System.out.println(" ");
			}
		}	
		
		public static void splitSandwichSpaces(String sandwich){
			//sandwich with spaces
			String [] sandwichNoSpace= sandwich.split(", ");
			//find inside sandwich
			insideSandwich(Arrays.toString(sandwichNoSpace));
		}
}
