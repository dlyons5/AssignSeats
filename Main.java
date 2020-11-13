 import java.util.Scanner;
//this above is for the scanner (step 4)
class Main {
 
  public static void main(String[] args) {
//15 students and 15 seats (step 1):  
   int[] seatNumbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };

   for (int i = 0; i<= 15; i++){
      System.out.println(seatNumbers[i]);
   {
//this is the string array of 15 elements (step 2):  
  String[] classmates = new String[15];

   for (i = 0; i < 15; i++){
      System.out.println(classmates[i]);   
//this is the for loop: (step 3):
   for ( i = 0; i < classmates.length; i++)
     {
         System.out.println( classmates[i] );     
     }
//scanner is going to ask the name of the student (step 4):
   Scanner scan = new Scanner(System.in);
   
    System.out.println("What is your name?");
    
    String name = scan.next();
//this is going to place the student in a seat (step 5):  
for (int count = 2; count <= 15; count++)
     {
        System.out.println(count);
   
    }
   }
   }
    }
  }
}