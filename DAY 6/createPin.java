import java.io.*;
import java.util.*;
class UserMainCode{
	public int createPin(int input1,int input2,int input3){
		int au=input1%10, at=(input1/10)%10, ah=input1/100;
        int bu=input2%10, bt=(input2/10)%10, bh=input2/100;
        int cu=input3%10, ct=(input3/10)%10, ch=input3/100;

        int u=au;
        if(bu<u) u=bu;
        if(cu<u) u=cu;

        int t=at;
        if(bt<t) t=bt;
        if(ct<t) t=ct;

        int h=ah;
        if(bh<h) h=bh;
        if(ch<h) h=ch;

        int m=au;
        if(at>m) m=at;
        if(ah>m) m=ah;
        if(bu>m) m=bu;
        if(bt>m) m=bt;
        if(bh>m) m=bh;
        if(cu>m) m=cu;
        if(ct>m) m=ct;
        if(ch>m) m=ch;

        int[] arr=new int[4];
        arr[0]=u;
        arr[1]=t;
        arr[2]=h;
        arr[3]=m;
        int c=0;
        for(int i=3;i>=0;i--){
            c=c*10+arr[i];
        }
        return c;
    }
}