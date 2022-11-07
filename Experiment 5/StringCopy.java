import java.util.Scanner;

class StringCopy {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int j = 1;
        String str, str_cpy = "";
        System.out.print("Enter string: ");
        str = sc.nextLine();

        while(j <= str.length()) {
            str_cpy += String.valueOf(str.charAt(0)) + String.valueOf(str.charAt(1));
            j++;
        }
        System.out.println("I/P: " + str);
        System.out.println("O/P: " + str_cpy);
    }
}