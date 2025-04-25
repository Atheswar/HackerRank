import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int a1 = 0;
        int a2 = 0;
        int arr[] = new int[num];
        for(int i=0; i<=num-1; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<=num-1; i++)
        {
            if(arr[i]%2==0)
            {
                a1 = (a1+arr[i]);
            }
            else
            {
                a2 = (a2+arr[i]);
            }
        }
        System.out.println("The sum of the even numbers in the array is "+a1);
        System.out.println("The sum of the odd numbers in the array is "+a2);
    }
}
