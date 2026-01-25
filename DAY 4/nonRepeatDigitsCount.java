import java.io.*;
import java.util.*;
class UserClassMain{
        public int nonRepeatDigitsCount(int input1){
        int[] a = new int[10];
        int c=0;
        while(input1>0){
            int d=input1%10;
	    a[d]++;
            input1=input1/10;
        }
        for(int i=0;i<10;i++){
            if(a[i]==1)
                c++;
            }
            
        }
        return c;
    }
}