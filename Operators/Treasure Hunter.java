import java.io.*;
import java.util.*;

public class Solution
{

    public static void main(String[] args)
    { 
             Scanner input = new Scanner(System.in); 
             int totalCoins = input.nextInt(); 
             int bensPercentage = input.nextInt(); 
             int blackbeardPercentage = input.nextInt();
             int bensShare = (totalCoins * bensPercentage) / 100;
             int leftOver = totalCoins - bensShare;
             int blackbeardShare = (leftOver * blackbeardPercentage) / 100;
             int remainingAmount = totalCoins - (bensShare + blackbeardShare);
             int piratesShare = remainingAmount / 3;
             System.out.println(bensShare);
             System.out.println(blackbeardShare);
             System.out.println(piratesShare);
    }
}
