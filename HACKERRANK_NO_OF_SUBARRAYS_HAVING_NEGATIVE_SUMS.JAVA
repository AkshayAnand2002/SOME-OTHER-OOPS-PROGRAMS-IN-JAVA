//https://www.hackerrank.com/challenges/java-negative-subarray/problem?isFullScreen=true
import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int negative = 0;
        int A[] = new int [n];
        // taking array input
        for (int i = 0; i < A.length; i++) {
            A[i] = scan.nextInt();
        }
        
        // finding result
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum+=A[j];
                if(sum <0){
                    negative++;
                }
            }
        }
        System.out.println(negative);
    }
}
