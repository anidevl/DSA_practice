import java.util.*;
public class lecture11 {
    public static void main(String[] args) {
        int i,j;
        /*1.Print the spiral order matrix as output for a given matrix of numbers:
            1  5  7  9  10 11
            6  10 12 13 20 21
            9  25 29 30 32 41
            15 55 59 63 68 70
            40 70 79 81 95 105
            
            spiral order is given by:
            1 5 7 9 10 11 21 41 70 105 95 81 79 70 40 15 9 6 10 12 13 20 32 68 63 59 55 25 29 30 29.
        
        */
       /*
        //code if i want to take input from the user instead of already giving predefined value to the matrix
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The size for rows:");
        int row=sc.nextInt();
        System.out.println("Enter the size for columns:");
        int col=sc.nextInt();
        int[][] matrix= new int[row][col];
        //taking input from user
        for(i=0;i<row-1;i++){
            for(j=0;j<col-1;j++){
                matrix[i][j]=sc.nextInt();
            }

        }
        */
        //already given input from the question
        /*
        int[][] matrix={{1,5,7,9,10,11},
            {6,  10 ,12 ,13 ,20 ,21},
            {9 , 25 ,29 ,30 ,32, 41},
            {15,55 ,59 ,63 ,68, 70},
            {40 ,70 ,79, 81 ,95 ,105}};
        //printing matrix output
        System.out.println("So the give predefined matrix values are:");
        for(i=0;i<=5-1;i++){
            for(j=0;j<=6-1;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
        //printing output in spiral form
        int top=0,bottom=(5-1),left=0,right=(6-1);
        int dir=0;
        while(top<=bottom && left<=right){  //while condition telling me to stop when i reach centre
            //if my direction pointer is 0 i.e left to right(➡️)
            if(dir==0){
                for(i=left;i<=right;i++){ //moving from top left to right
                    System.out.print(matrix[top][i]+" ");
                }
                top+=1;
            }
            //if my direction pointer is 1 i.e top to down(⬇️)     
            else if(dir==1){
                for(i=top;i<=bottom;i++){ //moving from top right to bottom
                    System.out.print(matrix[i][right]+" ");
                }
                right-=1;
            }
            //if my direction pointer is 2 i.e right to left(⬅️)
            else if(dir==2){
                for(i=right;i>=left;i--){ //moving from extreme right to left
                    System.out.print(matrix[bottom][i]+" ");
                }
                bottom-=1;
            }
            //if my direction pointer is 3 i.e down to top(⬆️)
            else if(dir==3){
                for(i=bottom;i>=top;i--){  //moving from leftmost bottom to top
                    System.out.print(matrix[i][left] +" ");
                }
                left+=1;
            }
            else
            break;

            dir=(dir+1)%4;  //increasing dir value after each iteration until it reaches 4 (such that 4 divided by 4 will give remainder 0) hence we will restart with 0 until we reach center
        } 
        */ 
        /*2. For a given matrix of N x M, print its transpose. */
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter number of rows(n):");
        int row=sc.nextInt();
        System.out.println("Enter number of columns(m):");
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        //taking input from the user
        for(i=0;i<=row-1;i++){
            for(j=0;j<=col-1;j++){
                matrix[i][j]=sc.nextInt();

            }

        }
        //printing the given matrix
        for(i=0;i<=row-1;i++){
            for(j=0;j<=col-1;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
        //printing transpose of the matrix
        for(j=0;j<=col-1;j++){
            for(i=0;i<=row-1;i++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }


    }
}
