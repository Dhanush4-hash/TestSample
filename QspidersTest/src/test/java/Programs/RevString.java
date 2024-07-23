package Programs;

public class RevString {

	public static void main(String[] args) {

		String str = "Dhanush";
		System.out.println("Original String is : "+str);
		char[] ca = str.toCharArray();
		int size = ca.length;
		String revString = " ";

		for (int i = size - 1; i >= 0; i--) {
			revString = revString + ca[i];

		}
		
		System.out.println("Reversed String is : "+revString);
	}

}