 import java.util.Scanner;
//this "import" is for the scanner 
class Main {
 
  public static void main(String[] args) {
   
   int[] seatNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
//15 students and 15 seats 
   for (int i = 0; i<= 15; i++){
      System.out.println(seatNumbers[i]);
   {
   
  String[] classmates = new String[15];
  
   for (i = 0; i < 15; i++){
      System.out.println(classmates[i]);   

   for ( i = 0; i < classmates.length; i++)
     {
         System.out.println( classmates[i] );     
     }
    
   Scanner scan = new Scanner(System.in);
//scanner is going to ask the name of the student    
    System.out.println("What is your name?");
    
    String name = scan.next();

for (int count = 1; count <= 15; count++)
     {
        System.out.println(count);
   
    }
   }
   }
    }
  }
}