import static java.lang.System.*;

public class Arithmetic {
    public static void main(String[] args) {
        int firstNumber = 50;
        int secondNumber = 100;
        int thirdNumber = firstNumber;
        firstNumber = 65;

        out.println(firstNumber + " " + secondNumber + " " + thirdNumber);

        // + - * / % operator
        out.println("firstNumber + secondNumber = " + (firstNumber + secondNumber));
        out.println("firstNumber - secondNumber = " + (firstNumber - secondNumber));
        out.println("firstNumber * secondNumber = " + (firstNumber * secondNumber));
        out.println("firstNumber / secondNumber = " + ((double)firstNumber / secondNumber));
        out.println("firstNumber % secondNumber = " + (firstNumber % secondNumber));

        // ++, --
        out.println("firstNumber + 1 = " + firstNumber++);
        out.println("firstNumber + 1 = " + ++firstNumber);
        out.println("firstNumber - 1 = " + firstNumber--);
        out.println("firstNumber - 1 = " + --firstNumber);

        // -=, +=, *=, /=
        firstNumber += 10;
        out.println("firstNumber + 10 = " + firstNumber);
        firstNumber -= 10;
        out.println("firstNumber - 10 = " + firstNumber);
        firstNumber *= 10;
        out.println("firstNumber * 10 = " + firstNumber);
        firstNumber /= 10;
        out.println("firstNumber / 10 = " + firstNumber);
    }
}
