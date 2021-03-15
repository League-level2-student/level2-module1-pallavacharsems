package _00_intro_to_array_lists;
import java.util.ArrayList;
public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> sports = new ArrayList<String>();
		//   Don't forget to import the ArrayList (java.util) class
		

		//2. Add five Strings to your list
	sports.add("basketball");
	sports.add("football");
	sports.add("soccer");
	sports.add("baseball");
	sports.add("hockey");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < sports.size(); i++) {
			String p = sports.get(i);
			System.out.println(p);
		}
		//4. Print all the Strings using a for-each loop
		System.out.println("\n");
		for(String he : sports) {
			System.out.println(he);
		}
		System.out.println("\n");
		//5. Print only the even numbered elements in the list.
		for (int i = 0; i < sports.size(); i++) {
			if(i % 2 == 0) {
				String h = sports.get(i);
				System.out.println(h);
			}
		}
		System.out.println("\n");
		//6. Print all the Strings in reverse order.
		for(int i = sports.size() - 1; i >= 0; i--){
			String z = sports.get(i);
			System.out.println(z);	  
			}
		System.out.println("\n");
		
		for (int i = 0; i < sports.size(); i++) {
			String j = sports.get(i);
			if(j.contains("e")) {
				System.out.println(j);
			}
		}
		}
		//7. Print only the Strings that have the letter 'e' in them.
	
} 

