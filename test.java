import java.util.Scanner;

public class test {
    public static void main(String[] args){

        //accept input from the user
        Scanner scanner = new Scanner(System.in);

        //what is expected to be printed
        System.out.println("Enter the value of any number");
        int anyNumber = scanner.nextInt();
        //nested if statement
        if (anyNumber % 5 == 0 ) {
            System.out.println("Fizz ");
        }
        else if (anyNumber % 3 == 0){
            System.out.println("Buzz");
        }
        else if (anyNumber%5==0 && anyNumber%3==0){
            System.out.println("FizzBuzz");
        }
        else{
            System.out.println(anyNumber);
        }

    }
}
