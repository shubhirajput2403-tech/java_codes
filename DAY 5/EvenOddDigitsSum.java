import java.io.*;
import java.util.*;
class UserMainCode{
    public int EvenOddDigitsSum(int input1,String input2){
    int sum=0;
    if(input2.equals("even")){
    while (input1 > 0) {
        int digit=input1%10;
        if(digit%2==0){
            sum += digit;
        }
        input1 = input1/10;
     }
   }
   else{
        while (input1 > 0) {
        int digit=input1%10;
        if(digit%2!=0){
            sum += digit;
        }
        input1 = input1/10;
    }
  }
    return sum;
  }
}
