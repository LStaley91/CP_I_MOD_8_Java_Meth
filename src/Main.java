import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        /*
        SayHello();
        SayHello(13);
        SayMsg("Dam Logan!", 35);
        int favNum = 7;
        int doubledInt = doubleIT(favNum);

        System.out.println("Doubled is: " + doubledInt);

        int favNum = SafeInput.getRangedInt(in, "Enter Your Favorite number",1,100);
       // System.out.println(" You said your favorite number is "+ getRangedInt(in,"Enter Your Favorite number",1,100) );
        */

    }

    // user define static methods go here - after the main
    public static void SayHello()
    {
        System.out.println("Hello!");
    }
    public static void SayHello(int times)
    {
        for (int i=0; i <=times; i++)
        {
            SayHello();
        }
    }
    public static void SayMsg(String msg,int times)
    {
        for (int i=0; i <=times; i++)
        {
            System.out.println(msg);
        }
    }

    public  static int doubleIT(int num)
    {
        int retVal = 0;
        retVal = num * 2;

        return  retVal;
    }
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
}