import java.util.Scanner;

public class lecture3{
    public static void main(String[] args){
        /* Ask the user to enter the number of the month & print the name of the month. for eg - for '1' print 'january','2'print 'february' & so on*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the Month which you need to print in English:");
        int num = sc.nextInt();
        switch(num){
            case 1: System.out.println("January");
            break;
            case 2: System.out.println("February");
            break;
            case 3: System.out.println("March");
            break;
            case 4: System.out.println("April");
            break;
            case 5: System.out.println("May");
            break;
            case 6: System.out.println("June");
            break;
            case 7: System.out.println("July");
            break;
            case 8: System.out.println("August");
            break;
            case 9 : System.out.println("September");
            break;
            case 10: System.out.println("October");
            break;
            case 11: System.out.println("November");
            break;
            case 12: System.out.println("Decemeber");
            break;
            default :
            System.out.println("Invalid Number");

        }

    }
}