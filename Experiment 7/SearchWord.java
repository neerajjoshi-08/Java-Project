import java.io.* ;
import java.util.Scanner;

public class SearchWord {
    public static int searchCount(File fileA, String fileWord) throws FileNotFoundException {
        int count = 0;
        fileWord = fileWord.trim();
        Scanner sc = new Scanner(fileA);
        while (sc.hasNext()) {
            String nextWord = sc.next().trim();
            if (nextWord.equals(fileWord)) {
                ++count;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        File file = new File("Words.txt");
        Scanner sc = new Scanner(System.in) ;
        String str;

        System.out.print("Enter string to be searched: ");
        str = sc.nextLine();
        
        try {
            int count = searchCount(file,str) ;
            if(count==0)
                System.out.println("Word Not Found.") ;
            else
                System.out.println("Word Found.") ;
        } 
        catch (FileNotFoundException e) {
            System.out.println("Exception encountered!");        }
    }
}

