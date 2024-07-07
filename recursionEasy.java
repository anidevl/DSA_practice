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
    /*
    // 4. Print factorial of a number n
    public static void factorial(int n,int fact){
        if(n==1 || n==0){
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
    */
    
    // Q5. Print the fibonacci sequence till nth term.
    /*
    public static void printfibo(int a,int b,int n){
        //Base condition
        if(n<0){
           return;
        }
        System.out.print(" "+b+" ");
        int c=a+b;
        printfibo(b,c,n-1);




    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for nth term:");
        int n=sc.nextInt();
        int a=0,b=1;
        if(n<=0){
            System.out.println("Please Enter any Natural Number");
        }
        else if(n==1){
            System.out.println("0");
        }
        else if(n==2){
            System.out.println("0 1");
        }
        else{
            System.out.print("0 ");
            printfibo(a,b,n);

        }
         
    }
    */
    /*
    // More optimised version of the above Fibo code
    public static void printFibo(int a ,int b,int n){
        if(n==0){
            return;
        }
        int c= a+b;
        System.out.print(c+" ");
        printFibo(b,c,n-1);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter nth value term:");
        int n= sc.nextInt();
        int a=0,b=1;
        if(n<=0){
            System.out.println("Please Enter a valid Natural Number:");
        }
        else if(n==1){
            System.out.println("0");
        }
        else if(n==2){
            System.out.println("0 1");
        }
        else{
        System.out.print(a+" ");
        System.out.print(b+" ");
        printFibo(a,b,n-2);
    }
  }
  */
  /*
   //Q6. Print x^n (with stack height = n)
    public static int calcPower(int x,int n){
        if(n==0) //base case 1
        {
            return 1;
        }
        if(x==0) //base case 2
        {
            return 0;
        }
        //kaam
        int xpown= x*calcPower(x,n-1);
        return xpown;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x:");
        int x = sc.nextInt();
        System.out.println("Enter the value for n:");
        int n = sc.nextInt();
        System.out.println(calcPower(x,n)); 

    }
    */
    // Q7. Print x^n (with stack height = logn) ------> More optimised version of above question no. 6
    public static int calcPower(int x,int n){
        if(n==0) //base case 1
        {
            return 1;
        }
        if(x==0) //base case 2
        {
            return 0;
        }
        //kaam
        if(n%2==0) //if given value of n in x^n is even
        {
            return calcPower(x,n/2) * calcPower(x,n/2);
        }
        else //if given n value is odd
        {
            return calcPower(x,n/2) * calcPower(x,n/2) * x;
        }
        
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value for x:");
        int x = sc.nextInt();
        System.out.println("Enter the value for n:");
        int n = sc.nextInt();
        System.out.println(calcPower(x,n)); 

    }

}