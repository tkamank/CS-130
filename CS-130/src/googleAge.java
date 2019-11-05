import java.util.Scanner;

public class googleAge {
    public static void main(String[] args){
        final int GOOGLE_AGE = 21;
        int age;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String fn = input.nextLine();
        System.out.println("Enter your last name: ");
        String ln = input.nextLine();
        System.out.println("Enter your age: ");
        age = input.nextInt();
            if(age > GOOGLE_AGE){
              System.out.println(ln + "," + fn + " is older than Google.");
            }else if(age < GOOGLE_AGE){
                System.out.println(ln + "," + fn + " is younger than Google.");
            }else if(age == GOOGLE_AGE){
                System.out.println(ln + "," + fn + " is the same age as Google.");
            } else {
                System.out.println("Wrong input.");
            }
        }
}
