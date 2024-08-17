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
    /*
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
    */
    // Q3. Find the occurrence of the first and last occurrence of an element using recursion.
    public static int firstOccur = -1 ;
    public static int lastOccur = -1 ;
    public static void occurCounter(String strArr,char e,int n){
        //Base case
        if(n==strArr.length()){
            System.out.println(firstOccur);
            System.out.println(lastOccur);
            return;
        }


        // work
        char currChar=strArr.charAt(n);
        if(currChar==e){
            if(firstOccur==-1){
                firstOccur=n;
            }else{
                lastOccur=n;
            }
            
        }
        occurCounter(strArr,e,n+1);

        
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the string array: ");
        String strArr= sc.nextLine();
        System.out.println("Enter the element whose first and last ocuurence you want to find: ");
        char e = sc.next().charAt(0);
        int n=0;
        occurCounter(strArr,e,n);
    }
}
