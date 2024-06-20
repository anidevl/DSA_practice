import java.util.*;
public class lecture10{
    public static void main(String[] args) {
        /*1. Take an array of names as input from the user and print them on the screen. */
        int i,j;
        Scanner sc =new Scanner(System.in);
       /*System.out.print("Enter the size of the array:");
        int size=sc.nextInt();
        String[] names= new String[size];
        for(i=0;i<size;i++){
            System.out.print("Enter the String for index "+i+":");
            names[i]=sc.next();

        }
        System.out.println("So your array of Strings are :");
        for(i=0;i<size;i++){
                  System.out.print(names[i]+" ");
        }
        */
        /* 2.Find the maximum & minimum number in an array of integers. */
        /*int[] array={2,8,4,10,1};
         //applying bubble sort in order to make the array in ascending order
         System.out.println("so our given array is: array={2,8,4,10,1}");
         for(i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
           if(array[j]>array[j+1]){
             int temp=array[j];
             array[j]=array[j+1];
             array[j+1]=temp;
            }

           }
        }
        System.out.println("The maximum value in our array is:"+array[array.length-1]);
        System.out.println("The minimum  value in our array is:"+array[0]);
        */
        /*Take an array of numbers as input and check if it is an array sorted in ascending order.
          Eg : { 1, 2, 4, 7 } is sorted in ascending order.
          {3, 4, 6, 2} is not sorted in ascending order. */
          System.out.println("Enter the size of the array:");
          int size = sc.nextInt();
          int[] array=new int[size];
          System.out.println("Enter the elments in the array");
          for(i=0;i<array.length;i++){
                System.out.println("Enter the element for index "+i+":");
                array[i]=sc.nextInt();

          }
          System.out.println("Your array is:");
          for(i=0;i<array.length;i++){
            System.out.println("element at index "+i+" is:"+array[i]);
          }
          for(i=0;i<array.length-1;i++){
             if(array[i]>array[i+1]){
                System.out.println("It is not sorted in ascending order");
                break;
             }
             else{
             System.out.println("It is sorted in ascending order");
             break;
            }
          }
    }
    
}