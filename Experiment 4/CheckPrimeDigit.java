import java.applet.*;
import java.awt.*;

 public class CheckPrimeDigit extends Applet {
    private static final long serialVersionUID = 1L;

    TextField t1, t2;
    Label l1, l2;

    public void init() {
        t1 = new TextField(5);
        t2 = new TextField(5);
        l1 = new Label("Enter a number: ");
        l2 = new Label("Prime digits in the number are: ");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
    }
    public void paint(Graphics g) {
        int num = Integer.parseInt(t1.getText());
        int prime = PrimeDigit(num);
        t2.setText(String.valueOf(prime));
    }

    public int PrimeDigit(int num) {
        int rem, flag;
        String str = "";

        while(num > 0) {
            rem = num % 10;
            flag = 1;
            for(int i = 2; i <= rem/i; ++i) {
                if(rem % i == 0) {
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
                str = String.valueOf(rem) + str;

            num /= 10;
        }
        return Integer.parseInt(str);
    }
}