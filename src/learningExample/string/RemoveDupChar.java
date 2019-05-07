package learningExample.string;

import java.util.HashMap;

public class RemoveDupChar {

	public static void main(String[] args) {
		HashMap hs= new HashMap();
		String st = "Hello friend how are you";
		int i = 0;
		char arr[] = st.toCharArray();
		int len = st.length();
		
		for(char ch : arr){
			if(ch != ' '){
				if(!hs.containsKey(ch)){
					hs.put(ch, 1);
				} else  {
					st = getSubString(st, i, len);
					System.out.println(st);
				}
			}
			i++;
		}
		System.out.println(st);
	}
	static String getSubString(String str, int i, int len){
		
		return str.substring(0, i-1) + str.substring(i, str.length()) ;
	}

}
