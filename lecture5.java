import java.util.*;
public class lecture5{
    public static void main(String[] args){

        int i,j;
        Scanner sc= new Scanner(System.in);
        /*
       
       
       1. Program to print pattern:
         ********
         ********
         ********
         ********
         
         
         
         */
        /*for (i=1;i<=4;i++){
            for(j=1;j<=8;j++){
                System.out.print("*");
            
            }
            System.out.println();
        }*/
        /*
        
        2.Program to print pattern:
         *****
         *   *
         *   *
         ***** 
         
         
         
         
        */
        /*for(i=1;i<=4;i++){
            for(j=1;j<=5;j++){
                if(i==1 || i==4){
                    System.out.print("*");
                }
                else if(i==2 || i==3){
                    if(j==1 || j==5){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("");
                }
            }
            System.out.println();
        }*/
        /* 
        
        
        
        3.Program to print Pattern where number of rows is given by the user:
         *
         **
         ***
         **** 
         
         
         
         */
        
       /* System.out.println("Enter the nth value for row :");
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }*/
        /* 
        
        
        
        Program to print Pattern where number of rows is given by the user:
        
        ****
        ***
        **
        *         
       
       
       
         */
       /*System.out.println("Enter the nth value which is number of rows:");
        int n= sc.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } */
        /*Program to print pattern where number of rows is given by the user: 
          
                 *
                **
               ***
              ****         
        
        
        
        
        
        */
       /*System.out.println("Enter the nth value which is the number of rows:");
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } */
        /*
        
        
        Program to print pattern where user gives value for nth rows:
        1
        12
        123
        1234
        12345



        */
        /*
        System.out.println("Enter the nth value which is the number of rows:");
        int n = sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(j);
            }
            for(j=1;j<=n-i;j++){
                System.out.print(" ");
            }
          System.out.println();  
        }*/
        /*Program to print pattern:
         
        
        
        12345
        1234
        123
        12
        1







        */
        /*for(i=0;i<n;i++){
            for(j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
       */

       /*Program to print pattern:
        1
        2 3
        4 5 6
        7 8 9 10
        11 12 13 14 15 

        */
        /*System.out.println("Enter the nth value which is the number of rows:");
        int n = sc.nextInt();
        int number=1;
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print(number+ " ");
                number++;
            }
            System.out.println();
        }*/
        /*Program to print pattern:
           
        1
        0 1
        1 0 1
        0 1 0 1
        1 0 1 0 1
        

       */
      /*System.out.println("Enter the nth value which is the number of rows:");
      int n = sc.nextInt();
      for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            if((i+j)% 2 == 0){
                System.out.print("1"+" ");
            }
            else{
                System.out.print("0"+" ");
            }
            
        }
        System.out.println();
      }*/
/*Program to print solid rhombus pattern:
         * * * * *
        * * * * *
       * * * * *
      * * * * *
     * * * * *  
 */
     /*System.out.println("Enter the nth value which is the number of rows:");
       int n = sc.nextInt();
       for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=n;j++){
            System.out.print("*");
        }
        System.out.println();
       }*/
       /*Program to print pattern where nth value of row is taken from the user:
                 
             
                
                 1
                2 2
               3 3 3
              4 4 4 4
             5 5 5 5 5  
        
        
        
        
        
      */
      /*
      int number= 1;
      System.out.println("Enter the nth value which is the number of rows:");
      int n = sc.nextInt();
      for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print(number+" ");
            
        }
        number++;
        System.out.println();
      }
     */
    /*
     Print palindromic number pyramid pattern :
               1
              212
             32123
            4321234
           543212345
     */
      System.out.println("Enter the nth value which is the number of rows:");
      int num = sc.nextInt();
      int n = num/2;
      for(i=1;i<=n;i++){
        for(j=(n-i);j>=1;j--){
                System.out.print(" ");
        }
        for(j=i;j>=1;j--){
            System.out.print(j);
        }
        for(j=2;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
      }
    }

}