import java.util.*;
public class lecture6 {
    public static void main(String[] args){
        int i,j;
        /*Print the butterfly pattern by taking n as input from the user
          
          *      *
          **    **
          ***  ***
          ********
          ********
          ***  ***
          **    **
          *      *
         

         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter nth value of rows:");
       /*int num = sc.nextInt();
        int n = (num/2);
        for(i=1;i<=n;i++){
            for(j=1;j<=2*n;j++){
                if(i==1){
                    if(j==1 || j==(2*n)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if( i==2){
                    if(j==1 || j==2 || j==(2*n) || j==((2*n)-(i-1)) ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i==3){
                    if(j==1 || j==2 || j==3 || j==(2*n) || j==((2*n)-(i-1)) || j==((2*n)-(i-1)+1) ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");

                }
            }
            System.out.println();

        }
        for(i=n;i>=1;i--){
            for(j=1;j<=2*n;j++){
                if(i==1){
                    if(j==1 || j==(2*n)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if( i==2){
                    if(j==1 || j==2 || j==(2*n) || j==((2*n)-(i-1)) ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else if(i==3){
                    if(j==1 || j==2 || j==3 || j==(2*n) || j==((2*n)-(i-1)) || j==((2*n)-(i-1)+1) ){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                else{
                    System.out.print("*");

                }
            }
            System.out.println();

        }*/
        /*The above code has two major flaw and that is 
        1.that it can't take nth value above 8
        2.it is not efficient at all  */
        /*Following below code will print the same butterfly pattern as above but more efficiently and without above code's flaws */
        /*int num = sc.nextInt();
        int n = (num/2);
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            for(j=1;j<=(2*(n-i));j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        } */

        /*int num =sc.nextInt();
        int n = num/2;
        //part 1
        for(i=1;i<=n;i++){
            //part 1a
            for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            //part 1b
            for(j=1;j<=(i-1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //part 2
        for(i=n;i>=1;i--){
             //part 2a
             for(j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(j=1;j<=i;j++){
                System.out.print("*");
            }
            //part 2b
            for(j=1;j<=(i-1);j++){
                System.out.print("*");
            }
            System.out.println();


        }

    */
    /*Print the pattern of hollow butterfly :





      *        *
      **      **
      * *    * *
      *  *  *  *
      *   **   *
      *   **   *
      *  *  *  *
      * *    * *
      **      **
      *        *
     
     
     
     
     
     
     
    */
    /*
    int num =sc.nextInt();
    int n = (num/2);
    //part 1
    for(i=1;i<=n;i++){
     //part 1a
      if(i<3){
        for(j=1;j<=i;j++){
            System.out.print("*");
        }
      }
      //creating inward spaces for part 1a
      else{
        for(j=1;j<=1;j++){
            System.out.print("*");
        }
        for(j=1;j<=(i-2);j++){   //inward spaces of part 1a --> spaces= i-2    [if and only if i>=3]
              System.out.print(" ");
        }
        for(j=1;j<=1;j++){
            System.out.print("*");
        }
      }
      //outward spaces
      for(j=1;j<=((n*2)-(i*2));j++){   //outward spaces ---> spaces =(n*2)-(i*2)
           System.out.print(" ");
      }
      //part 1b 
        if(i<3){
            for(j=1;j<=i;j++){ 
            System.out.print("*");
            }
        }  
        //creating inward spaces for part 1b
        else{
            for(j=1;j<=1;j++){
                System.out.print("*");
            }
            for(j=1;j<=(i-2);j++){   //inward spaces of part 1b --> spaces= i-2    [if and only if i>=3]
                System.out.print(" ");
            }
            for(j=1;j<=1;j++){
                System.out.print("*");
            }
        }
        System.out.println();
      }
      //part 2
    for(i=n;i>=1;i--){
        //part 2a
         if(i<3){
           for(j=1;j<=i;j++){
               System.out.print("*");
           }
         }
         //creating inward spaces for part 2a
         else{
           for(j=1;j<=1;j++){
               System.out.print("*");
           }
           for(j=1;j<=(i-2);j++){   //inward spaces of part 2a --> spaces= i-2    [if and only if i>=3]
                 System.out.print(" ");
           }
           for(j=1;j<=1;j++){
               System.out.print("*");
           }
         }
         //outward spaces
         for(j=1;j<=((n*2)-(i*2));j++){   //outward spaces ---> spaces =(n*2)-(i*2)
              System.out.print(" ");
         }
         //part 2b 
           if(i<3){
               for(j=1;j<=i;j++){ 
               System.out.print("*");
               }
           }  
           //creating inward spaces for part 2b
           else{
               for(j=1;j<=1;j++){
                   System.out.print("*");
               }
               for(j=1;j<=(i-2);j++){   //inward spaces of part 1b --> spaces= i-2    [if and only if i>=3]
                   System.out.print(" ");
               }
               for(j=1;j<=1;j++){
                   System.out.print("*");
               }
           }
           System.out.println();
         } */
        /*Program to print pattern of hollow rhombus:
        
        
        
        
        
                    *****
                   *   *
                  *   *
                 *   *
                ***** 
        
        
        */

        /*
        int n= sc.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=(n-i);j++){
                  System.out.print(" ");
            }
            for(j=1;j<=n;j++){
                if(i==1 || i==n){
                    System.out.print("*");
                }
                else{
                    if(j==1 || j==n){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        } */

        /*Program to print pattern of pascal's traingle:
                  1
                 1 1
                1 2 1
               1 3 3 1
              1 4 6 4 1   
        
        
        
        
        
      */
      /*int n = sc.nextInt(); 
      for(i=0;i<=n;i++){
         for(j=1;j<=n-i;j++){
            System.out.print(" ");
         }
         int number=1;
         for(j=0;j<=i;j++){
            System.out.print(number+" ");
            //updating number
            number= number * (i-j)/(j+1);
         }
         System.out.println();

      } */
      /*Program to print pattern :
            1
           1 2
          1 2 3
         1 2 3 4
        1 2 3 4 5





       */
      /*
      int n =sc.nextInt();
      for(i=1;i<=n;i++){
        for(j=1;j<=n-i;j++){
            System.out.print(" ");
        }
        for(j=1;j<=i;j++){
            System.out.print(j+" ");
        }
        System.out.println();
      } */
      
      /*Print inverted half pyramid:
         
      
      
         1111
         222
         33
         4




       */
      int n= sc.nextInt();
      int number=1;
      for(i=n;i>=1;i--){
        for(j=1;j<=i;j++){
            System.out.print(number);
        }
        number++;
        System.out.println();
      }

    }
}
