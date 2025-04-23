import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = sc.nextInt();
        int t = num/n;
        int s = num%n;
        System.out.println("The number of friends in each team is "+t+" and left out is "+s);
    }
}
