import java.util.Scanner;

public class Multiplication{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int x = sc.nextInt();

        System.out.println("Table of "+ x);
        for(int i = 1;i<=10;i++){
            int mul = x*i;
            System.out.println(x +" * " + i +" = "+ mul); 
        }

    }
}