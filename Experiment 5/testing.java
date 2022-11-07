import java.util.Scanner;

class StringPalindrome {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        StringBuffer str, str_rev;
        System.out.print("Enter string: ");
        str = sc.nextLine();

        for(int i = 0; i < str.length(); ++i) {
            str_rev = str.charAt(i) + str_rev;
        }

        if(str.equals(str_rev)) 
            System.out.println(str + " is Palindrome.");
        else
        System.out.println(str + " is not Palindrome.");
    }
}