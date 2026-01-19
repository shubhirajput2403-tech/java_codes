import java.io.*;
import java.util.*;

class UserMainCode {
    public int NthPrime(int input1) {

        int count = 0;

        for (int num = 2; ; num++) {   // infinite loop until nth prime is found
            int i;
            for (i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    break;
                }
            }

            if (i * i > num) {   // prime condition
                count++;
                if (count == input1) {
                    return num;
                }
            }
        }
    }
}
