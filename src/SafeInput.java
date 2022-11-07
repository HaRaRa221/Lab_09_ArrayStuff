import java.util.Scanner;

public class SafeInput {
    /**
     *
     * @param pipe The Scanner instance to use for the console input
     * @param prompt A string that tells the user what to input
     * @param low The lower bound for the range of the valid values
     * @param high The upper bound for the ranger of valid values
     * @return an integer within the range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal = low - 1;
        String trash = "";
        boolean done = false;

        do {

            System.out.println(prompt + "[" + low + " - " + high +"]: ");
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the newline form the buffer
                if (retVal >= low && retVal <= high) {
                    System.out.println("\nYou said your val is " + retVal);
                    done = true;
                } else {
                    System.out.println("You said your ret val is " + retVal + " but that is out of range [" + low + " - " + high +"]: ");
                }
            } else // don't have an int
            {
                trash = pipe.nextLine();
                System.out.println("You must enter an integer not " + trash);
            }
        } while (!done);

        return retVal;
    }
}
