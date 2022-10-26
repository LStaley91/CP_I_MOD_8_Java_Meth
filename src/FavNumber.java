import java.util.Scanner;

public class FavNumber
{
    public static void main(String[]args)
    {
        Scanner in = new Scanner(System.in);
        int favInt = 0;
        double favDouble = 0;

        favInt = SafeInput.getInt(in, "Enter Your fav int");
        favDouble = SafeInput.getDouble(in, "Enter Your fav Double");
        System.out.println("\nYour Favorite int is: " + favInt + " and Your Favorite double is: " + favDouble);

    }
}
