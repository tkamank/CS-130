import java.util.Scanner;


public class AdditionQuiz {
    public static void AdditionQuiz(String[] args){
        int number1 = (int)(System.currentTimeMillis() % 10);
        int number2 = (int)(System.currentTimeMillis() / 7 % 10);


        Scanner input = new Scanner(System.in);

        System.out.print("What is " + number1 + " + " + number2 + "? ");
        int answer = input.nextInt();
        while(answer != number1 + number2){
            System.out.print("Wrong answer. Try again. What is " +
            number1 + "+" + number2 + "?");
            answer = input.nextInt();
        }

        System.out.println(number1 + " + " + number2 + " = " + answer + " is " + (number1 + number2 == answer));

    }
}
