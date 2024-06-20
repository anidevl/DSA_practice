import java.util.*;
public class sorting {
    public static void printarr(int[] arr){
        for(int i =0 ;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int[] array= {7,8,3,1,2};
       /*
        //Bubble Sort
        for(int i=0;i<array.length-1;i++){
             for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    //swapping bara wala value with chota wala value
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]= temp;
                }       
            }
        }
        printarr(array);
        */   
        /*
        // Selection Sort
        for(int i=0;i<array.length-1;i++){
             int smallest= i;
             for(int j=i+1; j<array.length;j++){
                if(array[j]<array[smallest]){
                    //making 'smallest' index as 'j'
                    smallest = j;

                }
                
             }
             int temp = array[smallest];
             array[smallest]=array[i];
             array[i]=temp;
        }
        printarr(array);
        */
      // Insertion Sort
      for(int i = 1 ;i<array.length;i++){
        int current=array[i];
        int j= i-1;
        //traversing sorted part
        while( j>=0 && current<array[j] ){
            //making space for our comparision element
            array[j+1]= array[j];
            j--;

        }
        //placing our element in its proper place in sorted part
        array[j+1]=current;
    
    }
    printarr(array);
    }
   
    
}
