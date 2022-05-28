import javax.swing.*;

public class _5_Example {
    public static void main(String[] args) {

        String password = JOptionPane.showInputDialog("Enter Your password");
        String rePassword = JOptionPane.showInputDialog("Enter Your password again");

        while (true){
            if (password == rePassword) {
                System.out.println("Password is correct");
                break;
            }
            else {
                System.out.println("Password is incorrect");
            }
        }
    }

}
