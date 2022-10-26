import java.util.Scanner;
public class BirthDateTime
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int birthYear = SafeInput.getRangedInt(in, "Enter Your Birth Year number",1950,2010);
        int birthMonth = SafeInput.getRangedInt(in, "Enter Your Birth month number",1,12);
        int birthDay = SafeInput.getRangedInt(in, "Enter Your Birth day ",1,31);
        int birthMinutes = SafeInput.getRangedInt(in, "Enter Your Birth hour ",0,24);
        int birthHour = SafeInput.getRangedInt(in, "Enter Your Birth minute",0,60);

        System.out.println("\nYou were born in the year " + birthYear + " you were born in the month number " + birthMonth + " you were born on the day " + birthDay + " you were born in the hour " + birthHour + " you were born in the minute. " + birthMinutes);

    }
}