import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler1 {
   public static void main(String[] args){
    int sum = 0;
    for(int i=0;i<1000;i++){
        if (i%3==0 || i%5==0)
            sum+=i;
    }
    System.out.println(sum);
   }
}

