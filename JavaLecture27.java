import java.util.LinkedList;
import java.util.Arrays;
import java.util.Scanner;
public class JavaLecture27 {
    // function to remove nodes with value greater than 25
    public static void removeNodes(LinkedList<Integer> list){
         for(int i=list.size()-1 ;i>=0;i--){
            if(list.get(i)>25){
                list.remove(i);
            }
         }
         System.out.println(list);
    }
    public static void main(String[] args) {
    /*   
    
    // 1. Make a Linked List & add the following elements to it : (1, 5, 7, 3 , 8, 2, 3). 
    // Search for the number 7 & display its index.
    LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 5, 7, 3 , 8, 2, 3));
    for(int i=0 ;i< list.size();i++){
        if(list.get(i).equals(7)){ // use ".equals()" bcz we are using object "Integer" not
          //primitive "int" hence "==" will work only after certain caching limit
            System.out.println("At Index : "+i);
            break;
        }
    }

    */
    /*
    
    2. Take elements(numbers in the range of 1-50) of a Linked List as input
    from the user. Delete all nodes which have values greater than 25. 
    
    */
    Scanner sc = new Scanner(System.in);
    LinkedList<Integer> list = new LinkedList<>();
    while(true){
        System.out.println("Enter 0 to continue or 1 to quit : ");
        int choice = sc.nextInt();
        sc.nextLine();
        if(choice==0){
            System.out.println("Enter number to add to LL in the range of 1-50: ");
            int n = sc.nextInt();
            sc.nextLine();
            if(n>=1 && n<=50){
                list.add(n);
            }
            else{
                System.out.println("Enter the number in range of 1-50 😡");
            }
            
        }
        else if(choice==1){
            break;
        }
        else{
            System.out.println("Enter a valid number to continue or quit");
        }
        
    }
    removeNodes(list);
    
    
   
}
   
}
