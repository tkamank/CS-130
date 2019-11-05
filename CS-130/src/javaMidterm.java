import java.util.Scanner;

public class javaMidterm {
    public static void main(String[] args){
     Scanner input = new Scanner(System.in);
     System.out.println("Type side A");
     double sideA = input.nextInt();
     System.out.println("Type side B");
     double sideB = input.nextInt();
     double sqSideA = Math.pow(sideA,2);
     double sqSideB = Math.pow(sideB,2);
     double abSq =  sqSideA + sqSideB;
     double sideC = Math.sqrt(abSq);
     System.out.println("Output should be: " + sideC);



    }
}
