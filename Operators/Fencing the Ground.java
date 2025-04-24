import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int bre = sc.nextInt();
        int Area = len*bre;
        int Perimeter = 2*(len+bre);
        System.out.println("The required length is "+Perimeter+" m");
        System.out.println("The required area of carpet is "+Area+" sqm");
    }
}
