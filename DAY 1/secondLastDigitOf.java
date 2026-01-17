import java.io*;
import java.util.*;
class UserMainCode{
    public int secondLastDigitOf(int input1){
        if(input1<0){
	input1=-1*input1;
	}
        if(input1<10){
            return -1;
        }
        else{
            return (input1/10)%10;
        }
    }
}