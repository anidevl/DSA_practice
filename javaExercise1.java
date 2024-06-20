import java.util.*;
public class javaExercise1{

    /* 1. Enter 3 numbers from the user & make a function to print their average.*/
    /*public static void printAverage(float n1,float n2,float n3){
        float average= (n1+n2+n3)/3;
        System.out.println(average);
    }*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1:");
        float n1= sc.nextInt();
        System.out.println("Enter number 2:");
        float n2= sc.nextInt();
        System.out.println("Enter number 3:");
        float n3 =sc.nextInt();
        printAverage(n1,n2,n3);
        sc.close();
    }*/
    /* 2. Write a function to print the sum of all odd numbers from 1 to n.*/
    /*public static void sumOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if((i%2)!=0){
              sum+=i;
            }

        }
        System.out.println(sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n in order to print sum of odd numbers till n:");
        int n=sc.nextInt();
        sumOdd(n);
        sc.close();
    } */  
    /* 3. Write a function which takes in 2 numbers and returns the greater of those two. */ 
    /*public static void returnGreat(float n1, float n2){
        if(n1>n2){
            System.out.println(n1+" is greater than " +n2);
        }
        else
        System.out.println(n1+" is less than "+n2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float n1 = sc.nextFloat();
        System.out.println("Enter the second number:");
        float n2 = sc.nextFloat();
        returnGreat(n1,n2);
        sc.close();
    } */
    /* 4. Write a function that takes in the radius as input and returns the circumference of a circle.*/   
    /*public static void circumCircle(double r){
       double circum = 2* (3.14) *r;
       System.out.println(circum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius r to know it's circumference(we will consider pi=3.14):");
        double r= sc.nextDouble();
        circumCircle(r);
        sc.close();
    }*/
    /* 5. Write a function that takes in age as input and returns if that person is eligible to vote or not. A person of age > 18 is eligible to vote.*/
    /*public static void ageCalc(int age){
        if(age>18){
            System.out.println("You are elegible to vote ");
        }
        else
        System.out.println("You are not elegible to vote since you are "+age);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age:");
        int age= sc.nextInt();
        ageCalc(age);
        sc.close();
    }*/
    /* 6. Write an infinite loop using do while condition.*/
    /*public static void main(String[] args) {
        do{
            System.out.println("To Infinity........... and Beyond!");
        }while(true);
    }*/
    /* 7. Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.*/
    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count_pos=0;
        int count_neg=0;
        int count_zero=0;
        while(true){
        System.out.println("Enter 1 to continue or 2 to stop:");
        int stpCond= sc.nextInt();
        if(stpCond==1){
             System.out.println("Enter the number:");
             int num=sc.nextInt();
             if(num>0){
              count_pos+=1;
            }
             else if(num<0){
                count_neg+=1;
            }
            else{
            count_zero+=1;
            }

        }
        else if(stpCond==2){
        break;
       }
       else
       System.out.println("Invaid Number");

    }
    System.out.println("Number of positive integers entered are: " +count_pos);
    System.out.println("Number of negative integers entered are: " +count_neg);
    System.out.println("Number of zeroes entered are: " +count_zero);
    sc.close();
        
  }*/
  /* 8.Two numbers are entered by the user, x and n. Write a function to find the value of one number raised to the power of another i.e. 𝑥^n */
/*public static void power(int x,int n){
          int result=1;
          for(int i=1;i<=n;i++){
                result*=x;
          }
          System.out.println(result);
  }
  public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("Enter the value of x:");
    int x= sc.nextInt();
    System.out.println("Enter the value of n:");
    int n = sc.nextInt();
    power(x,n);
  }*/
  /*9. Write a function that calculates the Greatest Common Divisor of 2 numbers.*/
  /*public static void gcd(int n1,int n2){
    int gcd=1;
    for(int i=1; i<=n1 && i<=n2;i++){
        if(n1%i==0 && n2%i==0){
            gcd=i;
        }
    }
    System.out.println(gcd);

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number 1:");
        int n1= sc.nextInt();
        System.out.println("Enter number 2:");
        int n2=sc.nextInt();
        gcd(n1,n2);
        
    }*/
    /*10. Write a program to print Fibonacci series of n terms where n is input by user :
    0 1 1 2 3 5 8 13 21 .....
    In the Fibonacci series, a number is the sum of the previous 2 numbers that came before it. */
    public static void fibo(int n){
        int initialNum=0,nextNum=1,temp,result;
        if(n<0){
            System.out.println("Please enter a postive Integer");
        }
        else{
            if(n<1){
                System.out.print(initialNum+" ");
         }
         else{
            System.out.print(initialNum+" ");
        System.out.print(nextNum+" ");
        for(int i=1;i<=(n-2);i++){
            result=initialNum +nextNum;
            
            System.out.print(" "+result);
            initialNum=nextNum;
            nextNum=result;


        }
     }
        
     } 
 }
    public static void main(String[] args) {
        System.out.print("Enter the n number to print fibonacci series till n terms:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibo(n);
    }
}
