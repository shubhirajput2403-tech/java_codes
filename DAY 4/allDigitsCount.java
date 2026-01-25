import java.io.*;
import java.util.*;
class UserClassMain{
        public int allDigitsCount(int input1){
            int length=0;
            while(input1>0){
                input1=input1/10;
                length++;
            }
            return length;
        }
}