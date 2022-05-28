import javax.swing.*;

public class _4_Example {
    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("enter value of x"));

        int numbers = 0, sum=0, evenNumber = 0, oldNumber=0;

        for (int i = 0; i < x; i++) {
            numbers++;
            if (numbers % 2 == 0) {
                evenNumber++;
            }
            else {
                oldNumber++;
            }
            sum += i;


        }

    }

}
