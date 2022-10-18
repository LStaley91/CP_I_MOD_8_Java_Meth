import java.util.Scanner;

public class SafeInput
{
    /**
     *  Return a user supplied int within the specified range
     * @param pipe the scanner instance to use for the console input
     * @param prompt A string that tell the user what to input
     * @param low the Lower for bound for the range of vaild values
     * @param high the Upper for bound for the range of vaild values
     * @return return a interger within range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high)
    {
        int retVal =0;
        boolean done = false;
        String trash = "";
        do {
            System.out.println(prompt +"["+low+ "-"+high+"]: ");
            if (pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); // c;ear the newline form buffer
                if (retVal >= low && retVal <= high)
                {
                    System.out.println("\nYou said your ret val is " + retVal);
                    done = true;
                }
                else
                {
                    System.out.println("\nYou said your ret val is " + retVal + "But that is out of the range["+ low + " " + high + "]");
                }
            }
            else  // dont have an int
            {
                trash = pipe.nextLine();
                System.out.println("Yo u must enter an integer not " + trash);
            }
            return retVal;
        }while (!done);
    }

    /**
     *
     *
     * @param pipe
     * @param promt
     * @return
     */
    public static int getInt(Scanner pipe, String promt)
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;
        do{
            // favorite number 1-10
            System.out.println(promt +": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); // clear the nextline from the buffer
                done = true;
            }else // dont have an int
            {
                trash=pipe.nextLine();
                System.out.println("you must enter  an integer not "+trash);
            }
        }while(!done);
        return retVal;
    }

    /**
     * returns a user supplied int of arbitary value
     *
     * @param pipe the scanner to use  for the input
     * @param promt the string promt tellling the user what to input
     * @return an arbitary double of any value
     */
    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;
        do{
            // favorite number 1-10
            System.out.println(prompt +": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the nextline from the buffer
                done = true;
            }else // dont have an double
            {
                trash=pipe.nextLine();
                System.out.println("you must enter  an Double not "+trash);
            }

        }while(!done);
        return retVal;
    }

    /**
     * get a double value with a specified inclusive range
     *
     * @param pipe Scanner to read the console
     * @param prompt The promprt to tell the user what an input
     * @param low the low value for the ranfe
     * @param high the high value for the range
     * @return a Double within range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high)
    {
        double retVal = 0;
        boolean done = false;
        String trash = "";
        do {
            System.out.println(prompt +"["+low+ "-"+high+"]: ");
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); // clear the newline form buffer
                if (retVal >= low && retVal <= high)
                {
                    done = true;
                }
                else
                {
                    System.out.println("\nYou said your ret val is " + retVal + "But that is out of the range["+ low + " " + high + "]");
                }
            }
            else  // dont have an double
            {
                trash = pipe.nextLine();
                System.out.println("Yo u must enter an Double not " + trash);
            }
            return retVal;
        }while (!done);
    }

    /**
     * gets a string with at least 1 Charactor
     *
     * @param pipe scanner to use for input
     * @param prompt string prompt to tell the user what to input
     * @return a non zero length string
     */
    public static String getnonZeroLengthString(Scanner pipe,String prompt)
    {
        String retVal = "";
        String trash = "";
        boolean done = false;
        do{
            // favorite number 1-10
            System.out.println(prompt +": ");
            retVal = pipe.nextLine();

            if(retVal.length() != 0)
            {
                done = true;
            }else // dont have a 0 length String
            {
                System.out.println("you must enter at least 1 charactor.");
            }

        }while(!done);
        return retVal;
    }
}
