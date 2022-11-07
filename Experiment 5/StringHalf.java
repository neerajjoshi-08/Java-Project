import java.util.Scanner;

class StringHalf {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String str, str_half = "";
        System.out.print("Enter string: ");
        str = sc.nextLine();

        if(str.length() % 2 != 0) {
            str_half = null;
        }

        else {
            for(int i = 0; i < str.length()/2; ++i) {
                    str_half += str.charAt(i);
            }
        }
        System.out.println("I/P: " + str);
        System.out.println("O/P: " + str_half);
    }
}