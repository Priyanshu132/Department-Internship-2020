package reverse_string;

import java.util.Scanner;

public class Reverse_String {

    public static void main(String[] args) {
          Scanner s=new Scanner(System.in);
           String str_1=s.nextLine();
           StringBuilder rev = new StringBuilder(str_1); 
           System.out.println(rev.reverse());          // By inbuilt class 
           
           char[] arr=str_1.toCharArray();
           String f="";
           for(char l:arr){
              f=l+f;
           }
           System.out.println(f);    // By Own Method 
    }
    
}
