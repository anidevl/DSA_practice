import java.util.*;
public class lecture7{
     /* 1. Make a function to check if a number is prime or not. */
    /*public static void checkPrime(int n){
        if(n==2 || n==3 || n==5){
            System.out.println( n+" is a Prime number");
        }
        else if(n==1){
            System.out.println(n+" is not a prime number:");
        }
        else if(n<=0){
            System.out.println(n+" is neither Prime nor Composite");
        }
        else{
            if((n%1==0) && (n%n==0) && ((n%2==0) || (n%3==0) || (n%5==0))  ){
                System.out.println(n+" is not a prime number");

            }
            else if((n%1==0) && (n%n==0)){
                System.out.println(n+ " is a prime number");
            }
        }
    }*/
    /* 2. Make a function to check if a given number n is even or not.
       public static void checkEven(int n){
        if(n%2==0){
            System.out.println(n +" number is even");

        }
        else 
        System.out.println(n+ " number is odd");
     }*/
    /*3. Make a function to print the table of a given number n. */
    public static void printTable(int n,int m){
        for(int i=1;i<=m;i++){
            System.out.println(n+"*"+i+"="+ n*i);
        }
    }
    /*4. Read about Recursion.
     
      => Recursion is basically calling a function in itself recurively
     
     */
    
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        //System.out.println("Enter the number and it will check if it is prime or not:");
        //System.out.println("Enter the number and it will check if it is even or not:");
        System.out.println("Enter the number:");
        int n = sc.nextInt();
        System.out.println("Enter the number upto where you want to print that number's table:");
        int m = sc.nextInt();
        //checkPrime(n);
        //checkEven(n);
        printTable(n,m);
        sc.close();
    }
}

   