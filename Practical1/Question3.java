import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter a number: ");
    int num = in.nextInt();
    int res = num*num;
    //System.out.println("Result: " + res);
    System.out.println(res);
    
  }
}