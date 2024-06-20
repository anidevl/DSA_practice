import java.util.*;
public class revstr {

   public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter your string to reverse it:");
    String str=sc.nextLine();
    for(int i=str.length()-1;i>=0;i--){
      System.out.print(str.charAt(i)+"");

    }
   } 
    
}
