import java.util.*;
public class decimaltobinary {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the decimal number:");
        int dec=sc.nextInt();
        int i=0,num=0,originaldec=dec;
        int[] binarr=new int[50];
        if(dec==0){
            System.out.println("Binary is : 0 0 0");
        }
        else{
            while(dec>0){
                binarr[i]=dec%2;
                dec=dec/2;
                i++;
                num++;

            }
        }
       
        for(i=num-1;i>=0;i--){
            System.out.print(binarr[i]+" ");
        }
        
           
        
    }
}
