public class Main {
	public static void main(String[] args) {

		String originalStr = "i love programming";

		String words[] = originalStr.split("\\s");
		String reversedString = "";

		// Reverse each word's position
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String rev = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				rev = rev + word.charAt(j);
			}

			reversedString = " " + rev + reversedString;
		}

		// Displaying the string after reverse
		System.out.print("Reversed string : " + reversedString);
	}
}