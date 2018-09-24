import java.util.Scanner;

public class fizzBuzz {

  static void fizzBuzz(int input){
    for(int i = 1; i < input; i++){
      if(i % 3 == 0){
        System.out.println("Fizz");
      }
      else if(i % 5 == 0){
        System.out.println("Buzz");
      }
      else{
        System.out.println(i);
      }
    }
  }



  public static void main(String[] args) {
    
    System.out.println(String.format("What number would you like to run through FizzBuzz?"));

    Scanner input = new Scanner(System.in);

    int confirmation = Integer.parseInt(input.next());
    fizzBuzz(confirmation);
    

  }
}