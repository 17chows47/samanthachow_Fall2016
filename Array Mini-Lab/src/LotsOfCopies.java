import java.util.Arrays;

public class LotsOfCopies {
	public static void main (String [] args){
		int num = 7;
		String strMain = "APCS";
		int [] arrMain = {1, 2, 3, 4, 5};
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
		changeMe(num, strMain, arrMain);
		System.out.println(num);
		System.out.println(strMain);
		System.out.println(Arrays.toString(arrMain));
	}
	
	public static void changeMe(int x, String str, int [] arr){
		int num = 12;
		String strMain = "New String";
		int [] arrMain = {2, 4, 6, 8, 10};
	}
}