import java.util.Scanner;
public class GetUserName
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        String firstName = "";
        String lastName = "";
        firstName = SafeInput.getnonZeroLengthString(in, "Enter your first name");
        lastName = SafeInput.getnonZeroLengthString(in, "Enter your last name");
            System.out.println("\nYour full name is: " + firstName + " " + lastName);
    }
}