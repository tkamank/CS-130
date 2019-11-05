import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String s = input.nextLine();
        //s = s.toLowerCase();
        //s = s.trim();
        int low = 0;
        int high = s.length() - 1;
        boolean isPalindrome = true;
        while(low < high){
            if(s.toLowerCase().charAt(low) != s.toLowerCase().charAt(high)){
                isPalindrome = false;
            }
            low++;
            high--;
        }
        if(isPalindrome){
            System.out.println(s + " is a palindrome.");
        } else {
           System.out.println(s + " is not a palindrome.");
        }
    }
}
