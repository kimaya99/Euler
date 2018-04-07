import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Euler2 {
   public static void main(String[] args){
    
    int first = 1;
    int second = 2;
    ArrayList<Integer> fibo = new ArrayList<Integer>();
    fibo.add(1);
    int finsum = 0;
    
    while(second<=4000000){
      fibo.add(second);
      int temp = first;
      first = second;
      second = temp + second;
    }

    for(int iterator:fibo){
    	System.out.println(iterator);
    	if (iterator%2==0)
    		finsum += iterator;
    }

    System.out.println(finsum);
	}
}
