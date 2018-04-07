import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

// 600851475143

public class Euler3 {
   public static void main(String[] args){
   		for(Long item: isFactor(600851475143L)){
   			System.out.println(item);
   		}
   }

   public static List<Long> isFactor(long num){
   	  ArrayList<Long> factors = new ArrayList<Long>();
   	  for(long i=2;i<=num;i++){
   	  	while(num%i==0){
   	  		factors.add(i);
   	  		num = num/i;
   	  	}
   	  }
   	  return factors;
   }

}
