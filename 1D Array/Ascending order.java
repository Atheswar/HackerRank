import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int arr[] = new int[num];
        for(int i=0;i<=num-1;i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<=num-2;i++)
        {
            for(int j=i+1;j<=num-1;j++)
            {
                if(arr[i]>arr[j])
                {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
        System.out.println("The Sorted array is:");
        for(int i=0;i<=num-1;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
