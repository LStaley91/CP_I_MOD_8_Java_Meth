import java.util.Scanner;
public class CheckOut {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        boolean looping = true;
        double sum = 0.0;
        while(looping)
        {
            double nextPrice = SafeInput.getRangedDouble(s, "Enter the price of your item: ", 0.50, 9.99);
            sum = sum + nextPrice;
            looping = SafeInput.getYNConfirm(s, "Add another item to your cart?");
        }
        System.out.println(String.format("Your total price is " + "%.2f", sum));

    }}