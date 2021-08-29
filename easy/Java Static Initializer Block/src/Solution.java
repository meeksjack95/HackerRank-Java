import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    //Write your code here


    private static Scanner scan;
    private static int B;
    private static int H;
    private static boolean flag;

    static{
        scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();

        flag = B > 0 && H > 0;

        if(!flag){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }//end of main

}//end of class

