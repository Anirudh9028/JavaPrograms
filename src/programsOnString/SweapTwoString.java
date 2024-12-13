package programsOnString;

public class SweapTwoString {

	public static void main(String[] args) {
		
		
		String str1 = "Hell";
        String str2 = "Wo";

        System.out.println("Before swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);

        // Swapping without using a temporary variable
        str1 = str1 + str2; // str1 becomes "HelloWorld"
        str2 = str1.substring(0, str1.length() - str2.length()); // str2 becomes "Hello"
        str1 = str1.substring(str2.length()); // str1 becomes "World"

        System.out.println("After swap:");
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
		
		
		
	}

}
