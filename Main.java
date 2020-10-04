import java.util.Scanner;

/**
 * Will show you the numbers of the FizzBuzz game up until the user number
 * @author Cole Girling
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // scanner for user input
    Scanner input = new Scanner(System.in);

    //ask the user for a positive integer 
    System.out.println("Please enter a positive integer to see the FizzBuzz numbers");
    int userNumber = input.nextInt();

    //create a variable to keep track of the number
    int count = 0;


    do{
      //increases counts value by 1
      count = count + 1;
      //Checks if it should display FizzBuzz
      if(count % 3 == 0 && count % 5 == 0){
        System.out.println("FizzBuzz");
      //Checks if it should display Fizz
      }else if(count % 3 == 0){
        System.out.println("Fizz");
      //Checks if it should display Buzz
      }else if(count % 5 == 0){
        System.out.println("Buzz");
      //Displays the count
      }else{
        System.out.println(count);
      }
    //will end the loop once the user number is reached
    }while(count <= userNumber - 1);
    
  }
}
