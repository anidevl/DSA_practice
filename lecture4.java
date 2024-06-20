import java.util.Scanner;
public class lecture4{
    public static void main(String[] args){
        /*Print all even numbers till n */
        Scanner sc = new Scanner(System.in);
      /*System.out.println("This program will print all even numbers till n");
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        System.out.println("Following are the even numbers");
        for(int i = 1;i<=n;i++){
            if((i%2)==0){
                System.out.println(i+"\n");
            }
            else{
                System.out.println(" ");
            }
        }
     */
       /*  for(; ;){
            System.out.println("Apna College");
         } */
      /*The program allows the user to enter two numbers: 1 or 0.

If the user enters 1, the program prompts the user to enter a student's marks (out of 100). The program then evaluates the marks and prints a message based on the following criteria:

Marks >= 90 -> print "This is Good"
89 >= Marks >= 60 -> print "This is also Good"
59 >= Marks >= 0 -> print "This is Good as well"
Because marks don't matter but our effort does.
If the user enters 0, the program stops. */
        do{
            System.out.println("Enter two numbers Either 1 or 0:");   
         int num= sc.nextInt();
         
           
         if(num==1){
            System.out.println("Enter Marks Out of 100:");
         int marks=sc.nextInt();
            if(marks>=90 && marks<=100){
                System.out.println("This is Good");
            }
            else if(marks<=89 && marks>=60){
                System.out.println("This is also Good");
            }
            else{
                System.out.println("This is good as well (Don't lose hope and cheer up Buddy I know you can do better 😉)");
            }
         }
         else if(num==0){
            break;
    }

        } while(true);
    }

}
