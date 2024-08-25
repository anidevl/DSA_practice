public class javaLecture19{
    /*
    // Q1. Print all the permutations of a string.
    public static void printPermu(String str,String permu){
     //str --> existing String
     //permu --> new String with different permutations
     
     // base condition
     if(str.length()==0){
        System.out.println(permu);
        return;
     } 
     
     // kaam
     
     for(int i=0;i<str.length();i++){
        char currChar =str.charAt(i);
        String newStr= str.substring(0,i)+str.substring(i+1);
        printPermu(newStr,permu+currChar);
        
     }
    
  
   }
    public static void main(String[] args) {
        String str="abc";
        printPermu(str,"");
    }
    */
    /*
    
    // Q2. CountPathMaze
    public static int pathInMaze(int sr,int sc, int fr,int fc){
        // sr --> starting row 
        // sc --> starting column
        // fr --> final row
        // fc --> final column

        // base condition 1 when our counter reaches out of the given matrix
        if(sr==fr || sc==fc){
            return 0;
        }
        // base condition 2 when our counter finds the path
        if(sr==fr-1 && sc==fc-1){
            return 1;
        }

        // kaam
        int downPath=pathInMaze(sr+1,sc,fr,fc);
        int rightPath = pathInMaze(sr,sc+1,fr,fc);
        return downPath+rightPath;
    }
    public static void main(String[] args) {
        int finalRow=3;
        int finalColumn=3;
        System.out.println(pathInMaze(0,0,finalRow,finalColumn));
    }
    */
    /*
    // Q3. Place Tiles of size 1 x m in a floor of size n x m
    // let n = 4, m = 2
    public static int placeTiles(int n,int m){
        //if tile went outside the area we will ignore it
        if(n==m){
           return 2;
        }

        if(n<m){
            return 1;
        }

        // kaam
        // vertical tile
        int vT= placeTiles(n-m,m);
        // horizontal tile
        int hT= placeTiles(n-1,m);
        return vT+hT;
        
        
    }
    public static void main(String[] args) {
        int n=4,m=2;
        placeTiles(n,m);
    }
    */
    // Q4. Find the number of ways in which you can invite n people to your party,single or in pairs
    public static int inviteParty(int n){
        // base codnition
        if(n<=1){
            return 1;
        }

        // kaam
        int ways1 =inviteParty(n-1);
        int ways2=(n-1)*inviteParty(n-2);
        return ways1 + ways2 ; 
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(inviteParty(n));
    }





}  