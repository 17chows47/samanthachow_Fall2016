import java.util.Arrays;

public class Split
{

	public static void main(String[] args) 
	{
		String phrase = "The best cookies in the world are cookies made in the oven";
		String find = "cookies";
		System.out.println(Arrays.toString(phrase.split(find)));
		System.out.println(Arrays.toString("I like apples!".split(" ")));
		System.out.println(Arrays.toString("I really like really red apples".split("really")));
		System.out.println(Arrays.toString("I reallyreally like apples!".split("really")));
		
		//String.split();
		//It's a method that acts on a string, <StringName>.split(<String sp>);
		//Where sp is the string where the string splits
		//And it returns an array
		// Example: "I like apples!".split(" "); 
		//		it will split at spaces and return an array of ["I","like","apples!"]
		// Example 2: "I really like really red apples"split("really")
		//		it will split at the word "really" and return an array of ["I "," like "," apples!"]
		
		//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?
		
		
		//Your task:
		/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
		 * use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
		 * What if it's a fancy sandwich with multiple pieces of bread?
		*/
		
		// dont use split if bread doesnt appear more than once. find keyword bread
		// before bread? after bread?
		/* -x bread NOT  ; 1 bread 0 bread
		 * -bread NOT
		 * -x NOT
		 * -bread x NOT
		 * -x bread y NOT
		 * -bread bread x NOT ; nothing in between
		 * -bread bread NOT
		 * -bread x bread = X
		 * - x bread y bread =  Y
		 * 
		 * x bread y bread z = Y
		 * bread x bread y = X
		 * 
		 
		 * if test more than one bread
		 *  else if true test if anything inside bread 
		 *  else test whats inside
		 */
		
		insideSandwich("bread");
		insideSandwich("breadmeat");
		insideSandwich("breadbread");
		insideSandwich("breadbreadmeat");
		insideSandwich("saucebread");
		insideSandwich("meat");
		insideSandwich("bananabreadonemeatbread");
		insideSandwich("breadtwomeatbread");
		insideSandwich("bananabreadthreemeatbreadend");
		insideSandwich("breadfourmeatbreadend");
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
	
		
		//Your task pt 2:
		/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
		 * use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
		 * Again, what if it's a fancy sandwich with multiple pieces of bread?
		*/

		



