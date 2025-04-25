import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while(num>=10)
        {
            int sum = 0;
            while(num!=0)
            {
                sum+=num%10;
                num = num/10;
            }
            num = sum;
        }
        System.out.print(num);
    }
}
