import java.io.*;
import java.util.*;
class UserMainCode{
    public int digitSum(int input1){
    
    boolean isNegative = input1 < 0;                   // Check if number is negative
 
    input1 = Math.abs(input1);                         // Work with absolute value

    // Repeat until single digit
    while (input1 > 9) {
        int sum = 0;

        while (input1 > 0) {
            sum += input1 % 10;
            input1 /= 10;
        }

        input1 = sum;
    }

    return isNegative ? -(int) input1 : (int) input1;    // Restore sign if negative
}