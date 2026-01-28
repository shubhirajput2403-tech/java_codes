import java.io.*;
import java.util.*;
class UserMainCode{
	public int isPalinNum(int input1){
		int rev=0,original=input1;
		while(input1>0){
                    int digit=input1%10;
                    rev=(rev*10)+digit;
                    input1/=10;
                }
                if(original == rev){
                    return 2;
                }
                else{
                    return 1;
                }
	}
}