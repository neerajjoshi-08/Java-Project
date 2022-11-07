import java.io.*;
public class CopyFile {
    public static void main(String[] args) throws IOException {
        File infile = new File("Words.txt");
        File outfile = new File("NewWord.txt");
        FileInputStream fin = new FileInputStream(infile);
        InputStreamReader input = new InputStreamReader(fin);
        BufferedReader reader = new BufferedReader(input);
        FileReader fr=new FileReader(infile);
        FileWriter fw=new FileWriter(outfile);
        int ch=fr.read();
        
        while(ch!=-1) {
            fw.write(ch);
            ch=fr.read();
        }
        fr.close();
        fw.close(); 
    }
}