import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     *
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */

    Scanner in = new Scanner(System.in);
    //System.out.println("Enter the number of integers to enter: ");
    int num = in.nextInt();
    int mode = 0;
    int modeNum = 0;
    ArrayList<Integer> data = new ArrayList<>();

    /*Enter Numbers*/
    for (int i = 0; i < num; i++) {
      //System.out.println("Enter a number: ");
      /*Add Number to List*/
      data.add(in.nextInt());
    }

    /*Find Mode of List*/
    for(int i = 0; i < num; i++)
    {
      int count = 0;
      for (int n = 0; n < num; n++)
      {
        if (data.get(i).equals(data.get(n)))
        {
          count++;
        }
      }

      //if count > mode, become new mode
      if (count > mode)
      {
        mode = count;
        modeNum = data.get(i);
      }
    }
    //System.out.println("The mode is: " + modeNum);
    System.out.println(modeNum);
  }
}
