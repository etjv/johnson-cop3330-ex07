/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solutions
 *  Copyright 2021 Edmund Johnson V
 */

/*
What is the length of the room in feet? 15
What is the width of the room in feet? 20
You entered dimensions of 15 feet by 20 feet.
The area is
300 square feet
27.871 square meters

The formula for this conversion is m2 = f2 × 0.09290304

Constraints
Keep the calculations separate from the output.
Use a constant to hold the conversion factor.
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] arg){
        int length = getLength();
        int width = getWidth();
        System.out.println(confirmation(length, width));
        System.out.println("The area is");
        System.out.println(getAreaF(length, width));
        System.out.println(getAreaM(length, width));
    }

    private static Integer getLength(){
        System.out.println("What is the length of the room in feet?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static Integer getWidth(){
        System.out.println("What is the width of the room in feet?");
        String x = in.nextLine();
        return Integer.parseInt(x.replace(" ", ""));
    }

    private static String confirmation(int l, int w){
        return "You entered dimensions of " + l + " feet by " + w + " feet.";
    }

    private static String getAreaF(int l, int w){
        return  (l * w) + " square feet";
    }

    private static String getAreaM(int l, int w){
        DecimalFormat df = new DecimalFormat("#.###");
        return  df.format(((l * w) * 0.09290304)) + " square meters";
    }
}
