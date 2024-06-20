import java.util.*;
public class lecture12 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    /*1. Take an array of Strings input from the user & find the cumulative (combined)
length of all those strings. */
    /*
    int totLength=0;
    System.out.println("Enter size of array of strings:");
    int size=sc.nextInt();
    String[] strarr= new String[size];
    for(int i=0;i<strarr.length;i++){
        System.out.print("Enter string for index"+i+":");
        strarr[i]=sc.next();
        totLength+=strarr[i].length();
        System.out.println();

    }

    System.out.println(totLength);
    */
    /*2. Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
    Example :
    original = “eabcdef’ ; result = “iabcdif”
    Original = “xyz” ; result = “xyz” */
    /*
    System.out.println("Enter the original String:");
    String original = sc.nextln();
    String result="";
    for(int i=0;i<original.length();i++){

        if(original.charAt(i)=='e'){
            result += 'i'; //adding 'i' instead of 'e' in our result string
        }
        else{
            result+=str.charAt(i);  //it will concatenate the characters of original string into a single character that will be added to result string

        }

    }
    System.out.println(result);
    */
    System.out.println("Enter your email:");
    String email= sc.nextLine();
    String username="";
    
    for(int i=0;i<email.length();i++){
        if(email.charAt(i)=='@'){
            break;
        }
        else
        username += email.charAt(i);

    }
    System.out.println(username);
}


  
    
}
