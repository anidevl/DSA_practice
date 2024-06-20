import java.util.*;
public class lecture13 {
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    /*
    System.out.println("Enter size for array of strings:");
    int size=sc.nextInt();
    int totlength=0;
    sc.nextLine();
    StringBuilder[] sbarr = new StringBuilder[size];
    
    for(int i=0;i<sbarr.length;i++){
        // taking array input from the user
        System.out.print("Enter string for index "+i+":");
        // since sc.nextLine() only takes string therefore we converted it into StringBuilder
        sbarr[i]= new StringBuilder(sc.nextLine());
        totlength+=sbarr[i].length();

    }
    for(int i=0;i<sbarr.length;i++){
        System.out.print(sbarr[i]+" ");

    }
    System.out.println();
    System.out.println(totlength);
    */
    System.out.println("Enter your string (although it will be stored as stringBuilder(😉)):");
    StringBuilder result = new StringBuilder(sc.nextLine());
    for(int i =0;i<result.length();i++){
        if(result.charAt(i)=='e'){
           result.setCharAt(i,'i');
        }
    }
    System.out.println(result);


 }
    
    
}


