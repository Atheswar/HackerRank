import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) 
    {
        int x1 = 3;
        int y1 = 4;
        Scanner sc = new Scanner(System.in);
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();
        int diff1 = x2-x1;
        int diff2 = y2-y1;
        int p = (diff1*diff1) + (diff2*diff2);
        double pro = Math.sqrt(p);
        System.out.println((int)Math.floor(pro));
    }
}
