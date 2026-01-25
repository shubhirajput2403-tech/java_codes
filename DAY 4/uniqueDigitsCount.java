import java.io.*;
import java.util.*;
class UserClassMain{
        public int uniqueDigitsCount(int input1){
        int[] a = new int[10];
        int c=0;
        while(input1>0){
            int d=input1%10;
            if(a[d]==0){
                a[d]=1;
                c++;
            }
            input1=input1/10;
        }
        return c;
	}
}