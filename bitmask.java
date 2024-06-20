import java.util.Scanner;

public class bitmask {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
   
    //practicing Bit Mask and Bit manipulation methods
     /*
      1.get bit ----> particular position par check karega ki 1 hai ki nahi
    
      procedure:-
      step 1: bitmask = 1<<i
              where 'i' is the particular position where you want to find '1' in bits.
      step 2: perform 'Bitwise AND (&) Operation' on bitmask & original number(in binary form)
      step 3: if the final value after operation == 0 then bit was '0' else it was '1' at that 'i' position       
      */
      /*
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
      */
      /*2.set bit ----> particular position par '1' set kar dega it doesn't matter whether it was '0' or '1' at that position
      procedure:- 
      step 1: bitmask = 1<<i
              where 'i' is the particular position where you want to set '1' in bits.
      step 2: Perform 'bitwise OR (|) Operation' on original value and bitmask.    

      */
     /*
      int value = sc.nextInt();
      int pos= sc.nextInt();
      int bitmask= 1<<pos;
      System.out.println(bitmask | value);
      */
      /*
       3.clear ----> particular bit position par '0' laga dengai
       procedure:-
       step 1: bitmask = 1<<i
               where 'i' is the particular position where you want to set '0' in bits.
       step 2: create negation of bitmask i.e ~bitmask
       step 3: perform 'bitwise AND (&) Operation' on original value and ~bitmask(negation of bitmask)

       */
        /*int value = sc.nextInt();
        int pos =sc.nextInt();
        int bitmask=1<<pos;
        int negbitmask = ~bitmask;
        System.out.println(value & negbitmask);
        */
        /*
        
        4.Update ----> particular bit position par '0' or '1' laga dengai accordingly.
         we don't need to do anything extra we will use already made above functions
        (i).  for '1' we will use set
        (ii). for '0' we will use clear
         
        */
        int value = sc.nextInt();
        int pos = sc.nextInt();
        int bitmask = 1<<pos;
        System.out.println("Do you want '1' or '0' at particular position (please enter either 0 or 1 ):" );
        int num = sc.nextInt();
        if(num==0){
              System.out.print(value & (~bitmask));
        }
        else if(num==1){
                System.out.print(value | bitmask);
        }
        else
        System.out.println("Invalid Input please enter either 0 or 1");
    }
}
