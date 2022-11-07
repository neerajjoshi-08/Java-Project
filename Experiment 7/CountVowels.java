import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader; 

public class CountVowels { 
    public static void main(String[] args) throws IOException {
        File file = new File("Words.txt");
        FileInputStream fin = new FileInputStream(file); 
        InputStreamReader input = new InputStreamReader(fin); 
        BufferedReader reader = new BufferedReader(input); 
        String line; 
        int c = 0; 
        int i; 
        
        do { 
            i = fin.read(); 
            line = reader.readLine(); 
            if (i != -1) {       
                String[] words = line.split("\\s+"); 
                for (int k = 0; k < words.length; k++) { 
                    for (int j = 0; j < words[k].length(); j++) { 
                        char ch = words[k].toLowerCase().charAt(j); 
                        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') { 
                            c++; 
                        }
                    }
                }
            }
        } while (i != -1); 
        
        System.out.println("Number of Vowels: " + c);   
    } 
}