import java.util.*;
public class lecture15{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
     //practicing Bit Mask and Bit manipulation methods
     /*
      1.get bit ----> particular position par check karega ki 1 hai ki nahi
    
      procedure:-
      step 1: bitmask = 1<<i
              where 'i' is the particular position where you want to find '1' in bits.
      step 2: perform 'Bitwise AND Operation' with bitmask & original number(in binary form)
      step 3: if the final value after operation == 0 then bit was '0' else it was '1' at that 'i' position       
      */
      System.out.println("Enter the value in decimal which will be further converted to binary:");
      int value=sc.nextInt();
      System.out.println("Enter the bit Position for which you want to find whether it is 0 or 1:");
      int pos = sc.nextInt();
      int bitmask = 1 << pos;
      if((bitmask & value)==0){
        System.out.println("bit was '0' ");
      }
      else
      System.out.println("bit was '1' ");
    }
    
}
