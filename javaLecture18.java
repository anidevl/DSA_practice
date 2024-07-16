import java.util.*;
public class javaLecture18 {
    /*
    // Q1. Tower of Hanoi - Transfer n disks from source to destination over 3 towers or more than that.
    // just do a recursion leap of faith and you will soemhow understand Tower of Hanoi 🥲
    public static void towerOfHanoi(int n,String src , String hlpr, String dest){
        // base case
        if(n==1){
            System.out.println("Moved disc "+n+" from "+src+" to "+dest);
            return;
        }

        // kaam
        towerOfHanoi(n-1,src,dest,hlpr); //moving rest of the n-1 discs to helper rod so that particular 'n' disc will be moved directly to destination without any obstructions
        System.out.println(" Moved disc "+n+" from "+src+" to "+dest); //justifying on which rod that 'n' disk went
        towerOfHanoi(n-1,hlpr,src,dest); //moving rest of that 'n-1' disc to destination

        // remember that 'n-1' discs will again be treated recursively until we reach base case i.e n==1


    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number of discs in your tower:");
        int n = sc.nextInt();
        towerOfHanoi(n,"Source","Helper","Destination");

    }
    */

    // Q2. Print a string in reverse using recursion.
    public static void stringReverse(int n,String s){
        // base case
        if(n==0){
            return;
        }

        // kaam
        System.out.print(s.charAt(n-1));
        stringReverse(n-1,s);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();
        int n= str.length();
        stringReverse(n,str);

       

    }
}
