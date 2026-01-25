import java.io.*;
import java.util.*;
class UserMainCode{
    public int countPrimesInRange(int input1, int input2){
        int count=0;
        for(int i=input1; i<=input2;i++){
            int fact=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    fact++;
                }
            }
            if(fact==2){
                count++;
            }
        }
        return count;
    }
}