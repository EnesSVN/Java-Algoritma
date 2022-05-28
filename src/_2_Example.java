import javax.swing.*;

public class _2_Example {
    public static void main(String[] args) {
        int chosenNumber = 0;
        int x = Integer.parseInt(JOptionPane.showInputDialog("Enter the value of x"));

        int numberOne = (int) Math.round(Math.sqrt(Math.pow(Math.round(Math.abs(x)),2)));
        int numberTwo = Math.round(numberOne/5);

        if (numberOne < numberTwo) {
            chosenNumber = numberOne;
        }else {
            chosenNumber = numberTwo;
        }

        if (chosenNumber % 2 == 0) {
            chosenNumber =+ 5;
        }else {
            chosenNumber =+ 3;
        }

        System.out.println(Math.pow(chosenNumber,chosenNumber));

    }

}
