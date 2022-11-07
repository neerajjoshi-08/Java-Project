import java.applet.Applet;
import java.awt.Graphics;

import javafx.scene.control.TextField;

public class CheckPalindrome extends Applet {

    private static final long serialVersionUID = 1L;
    
    public int isPalindrome(String s) {
        String newstr = "", str = s.toLowerCase();
        for (int i = 0; i < str.length(); ++i) {
            newstr = str.charAt(i) + newstr;            
        }
        if(str.equals(newstr))
            return 1;
        else return 0;
    }

    public void paint(Graphics g) {
        TextField t1, t2;
        t1 = new TextField();
        t2 = new TextField();

        String s1 = getParameter("P1"), s2 = getParameter("P2");

        if (isPalindrome(s1) == 1) {
            t1.setText("Name is Palindrome");
            g.drawString(s1 + " is Palindrome.", 50, 50);
        }

        else {
            t1.setText("Name is not Palindrome");
            g.drawString(s1 + " is not Palindrome.", 50, 100);
        }

        if (isPalindrome(s2) == 1) {
            t2.setText("Name is not Palindrome");
            g.drawString(s2 + " is Palindrome.", 50, 50);
        }
        else {
            t2.setText("Name is not Palindrome");
            g.drawString(s2 + " is not Palindrome.", 50, 100);
        }
    }
}