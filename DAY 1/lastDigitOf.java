import java.io.*;
import java.util.*;
class UserMainCode{
    public int lastDigitOf(int input1){
        if(input1<0){
            return (-input1%10);
        }
        else{
            return (input1%10);
        }
    }
}