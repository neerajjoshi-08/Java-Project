import java.util.Scanner;

class StringCombine {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int len;
        String str1, str2, str, str_comb = "";
        System.out.print("Enter string 1: ");
        str1 = sc.nextLine();
        System.out.print("Enter string 2: ");
        str2 = sc.nextLine();

        if(str1.length() <= str2.length()) {
            len = str1.length();
            str = str2;
        }
        else {
            len = str2.length();
            str = str1;
        }

        for(int i = 0; i < len; ++i) {
            str_comb += String.valueOf(str1.charAt(i)) + String.valueOf(str2.charAt(i));
        }

        for(int i = len; i < str.length(); ++i) {
                str_comb += str.charAt(i);
        }

        System.out.println("I/P: " + str1 + ", " + str2);
        System.out.println("O/P: " + str_comb);
    }
}