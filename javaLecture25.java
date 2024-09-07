import java.util.*;
public class javaLecture25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Solve all questions of arrays using only arraylist
        /*
        //1. Take an array of names as input from the user and print them on the screen.
        ArrayList<String> names = new ArrayList<>();
        
        while(true){
            System.out.println("Enter 0 to continue and 1 to stop adding names: ");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice==0){
               System.out.println("Enter the Name: ");
               String name = sc.nextLine();
               names.add(name); 
            }
            else if(choice==1){
                break;
            }
            else{
                System.out.println("Enter a Valid Number");
            }

        }
        System.out.println(names);
        */

        /*
        // 2. Find the maximum & minimum number in an ArrayList of integers.
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(20,40,22,32,80,120,100,-2));
        int max = nums.get(0);
        int min = nums.get(0);
        for(int i=0 ; i<nums.size() ; i++){
            if(nums.get(i)>max){
                max = nums.get(i);
            }
            if(nums.get(i)<min){
                min = nums.get(i);
            }
            
        }
        System.out.println("Max is : "+ max +" and min is : " + min );
        */
        /*
        // More optimised way to solve the above code
        // Find the maximum and minimum values
        int max = Collections.max(nums);
        int min = Collections.min(nums);

        // Print the results
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
       */
      
        
    }
}
