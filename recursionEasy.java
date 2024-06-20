import java.util.*;
public class recursionEasy{
    /*
    // 1.Print numbers from 5 to 1
    public static void main(String[] args) {
        
           int n=5;
           printNumber(n);
    }
    public static void printNumber(int n){
        //base condition
        if(n==0){
            return;
        }
        //printing n
        System.out.print(n+" ");
        //calling function again in order to do recursion
        printNumber(n-1);
    }
    */
    /*
    // 2.Print numbers from 1 to 5
    public static void printNumber(int n){
        if(n==6){
            return;
        }
        System.out.print(n+" ");
        printNumber(n+1);
    }
    public static void main(String[] args) {
        int n=1;
        printNumber(n);
    }
    */
    /*
    // 3.print sum of first n natural numbers
    public static void sumNatural(int n,int sum){
        if(n==0){
            System.out.println(sum);
            return;
        }
        sum+=n;
        sumNatural(n-1,sum);

     
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the nth natural number");
        int n = sc.nextInt();
        System.out.println("upto which number it will run");
        int num= sc.nextInt();
        sumNatural(n,num);
        
    }
    */
    // 4. Print factorial of a number n
    public static void factorial(int n,int fact){
        if(n==1){
            System.out.println(fact);
            return;
        }
        fact*=n;
        factorial(n-1,fact);
    }
    public static void main(String[] args) {
        int fact=1;
        Scanner sc=  new Scanner(System.in);
        System.out.println("Enter the number n to print its factorial:");
        int n = sc.nextInt();
        factorial(n,fact);
        
    }


}