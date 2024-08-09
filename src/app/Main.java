package app;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Enter numbers");
        String result = "";
        try {
            Scanner scanner = new Scanner(System.in);
            result = scanner.next();
            for (int n = 0; n < 7; n++)
            {
                StringBuilder retVal = new StringBuilder();
                for (int i=0; i < result.length(); i++)
                {
                    int num = Integer.parseInt(result.charAt(i) + "");
                    retVal.append(PrintNum(num)[n]).append(" ");
                }
                System.out.println(retVal);
            }
        }
        catch (InputMismatchException | NumberFormatException ex)
        {
            System.out.println("Entered value contains not only numbers. Please re-enter");
        }


        System.out.println(result);
    }

    private static String[] PrintNum(int num)
    {
        return switch (num) {
            case 1 -> PrintOne();
            case 2 -> PrintTwo();
            case 3 -> PrintThree();
            case 4 -> PrintFour();
            case 5 -> PrintFive();
            case 6 -> PrintSix();
            case 7 -> PrintSeven();
            case 8 -> PrintEight();
            case 9-> PrintNine();
            case 0 -> PrintZero();
            default -> PrintOne();
        };
    }

    private static String[]  PrintOne()
    {
        String[]  arr = new String[7];
        arr[0] = "   X   ";
        arr[1] = "  XX   ";
        arr[2] = " X X   ";
        arr[3] = "   X   ";
        arr[4] = "   X   ";
        arr[5] = "   X   ";
        arr[6] = "XXXXXXX";
        return arr;
    }
    private static String[]  PrintTwo()
    {
        String[]  arr = new String[7];
        arr[0] = " XXXXX ";
        arr[1] = "X     X";
        arr[2] = "      X";
        arr[3] = " XXXXX ";
        arr[4] = "X      ";
        arr[5] = "X      ";
        arr[6] = "XXXXXXX";
        return arr;
    }
    private static String[]  PrintFour()
    {
        String[]  arr = new String[7];
        arr[0] = "X      ";
        arr[1] = "X     X";
        arr[2] = "X     X";
        arr[3] = "X     X";
        arr[4] = "XXXXXXX";
        arr[5] = "      X";
        arr[6] = "      X";
        return arr;
    }
    private static String[]  PrintThree()
    {
        String[]  arr = new String[7];
        arr[0] = " XXXXX ";
        arr[1] = "      X";
        arr[2] = "      X";
        arr[3] = " XXXXX ";
        arr[4] = "      X";
        arr[5] = "      X";
        arr[6] = "XXXXXX ";
        return arr;
    }
    private static String[]  PrintFive()
    {
        String[]  arr = new String[7];
        arr[0] = "XXXXXXX";
        arr[1] = "X      ";
        arr[2] = "X      ";
        arr[3] = " XXXXX ";
        arr[4] = "      X";
        arr[5] = "X     X";
        arr[6] = " XXXXX ";
        return arr;
    }

    private static String[]  PrintSix()
    {
        String[]  arr = new String[7];
        arr[0] = " XXXXX";
        arr[1] = "X     X";
        arr[2] = "X      ";
        arr[3] = "XXXXXX ";
        arr[4] = "X     X";
        arr[5] = "X     X";
        arr[6] = " XXXXX ";
        return arr;
    }

    private static String[]  PrintSeven()
    {
        String[]  arr = new String[7];
        arr[0] = "XXXXXXX";
        arr[1] = "X    X ";
        arr[2] = "    X  ";
        arr[3] = "  X    ";
        arr[4] = "  X    ";
        arr[5] = "  X    ";
        arr[6] = "  X    ";
        return arr;
    }
    private static String[]  PrintEight()
    {
        String[]  arr = new String[7];
        arr[0] = " XXXXX ";
        arr[1] = "X     X";
        arr[2] = "X     X";
        arr[3] = " XXXXX ";
        arr[4] = "X     X";
        arr[5] = "X     X";
        arr[6] = "XXXXXX ";
        return arr;
    }
    private static String[]  PrintNine()
    {
        String[]  arr = new String[7];
        arr[0] = " XXXXX ";
        arr[1] = "X     X";
        arr[2] = "X     X";
        arr[3] = " XXXXX ";
        arr[4] = "      X";
        arr[5] = "X     X";
        arr[6] = "XXXXXX ";
        return arr;
    }
    private static String[]  PrintZero()
    {
        String[]  arr = new String[7];
        arr[0] = " XXXXX ";
        arr[1] = "X     X";
        arr[2] = "X     X";
        arr[3] = "X     X";
        arr[4] = "X     X";
        arr[5] = "X     X";
        arr[6] = " XXXXX ";
        return arr;
    }
}
