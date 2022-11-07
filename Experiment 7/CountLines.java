import java.io.*;

public class CountLines {
    public static void main(String[] args) throws IOException {
        File file = new File("Words.txt");
        FileInputStream fin = new FileInputStream(file);
        InputStreamReader input = new InputStreamReader(fin);
        BufferedReader reader = new BufferedReader(input);
        int linecount=0;
        String s;
        
        while((s=reader.readLine())!=null) {
            linecount++; 
        }
        fin.close();
        System.out.println("Number of lines in the Files: " + linecount);
    }
}