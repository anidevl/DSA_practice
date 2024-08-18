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
    /*
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
    */
    /*
    // Q4. Check if an array is sorted (strictly increasing).
    // example: {1,2,3,4,5} ---> true
    // example: {1,2,2,3,4} ---> false
    // example: {1,6,3,4,5} ---> false
    public static void checkSort(int[] arr,int idx){
        boolean flag=true;
        // base condition
        if(idx==arr.length-1 && flag==true){
           System.out.println("Array is sorted strictly in increasing order"); 
           return;
        }

        // kaam
        if(arr[idx]>=arr[idx+1]){
           flag=false;
           System.out.println("Array is not sorted strictly in increasing order");
           return;
        }else{
            flag=true;
            
        }
        checkSort(arr,idx+1);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the size for your array: ");
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter the elements of array at index "+ i + ": ");
            arr[i]= sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
        int index=0;
        checkSort(arr,index);
    }
    */

    // Q5. Move all ‘x’ to the end of the string.

    public static String addX(int count){
     String newStr2= "x" ;
     for(int i=1;i<count;i++){
        newStr2+="x";
     }
     return newStr2;
    }
    public static String removeX(String str,int idx){
       return str.substring(0,idx)+str.substring(idx+1);
    }
    public static String modifyStr(String str,int idx,int count){
        
       
        //base condition
        if(idx==str.length()){
            return str +addX(count);
        }
        
        //work
        if(str.charAt(idx)=='x'){
            count+=1;
            str=removeX(str,idx);
            return modifyStr(str,idx,count);
        }
        return modifyStr(str,idx+1,count);



    }
    public static void main(String[] args) {
        String str="abcdxxxxfxghij";
        int count=0;
        System.out.println(modifyStr(str,0,0));
    }

}
