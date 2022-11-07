import java.io.*;
// import java.util.ArrayList;

public class Count {
    public static void main(String[] args) throws IOException {
        File file = new File("Words.txt");     
        FileInputStream fin = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fin);
        BufferedReader reader = new BufferedReader(input);
        String line ;
        int countWord = 0, characterCount = 0, i;
        
        do {
            i = fin.read();
            line = reader.readLine();
            if (i != -1) {
                characterCount += line.length();
                String words[] = line.split("\\s+");
                countWord += words.length;
            }
        } while (i != -1);
        
        System.out.println("Total word count = " + countWord);
        System.out.println("Total number of characters = " + (characterCount+1));
        reader.close();
    }
}   