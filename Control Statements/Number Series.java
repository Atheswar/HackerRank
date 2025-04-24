import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int c = 0;
        int p = 0;
        for(int i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                p = (i*i)-2;
            }
            else
            {
                p = (i*i)-1;
            }
            System.out.print(p+" ");
        }
    }
}
