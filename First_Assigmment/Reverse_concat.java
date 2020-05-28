package reverse_concat;

import java.util.Scanner;

public class Reverse_concat {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       
           String str_1=s.nextLine();
           String str_2=s.nextLine();
           StringBuilder rev = new StringBuilder(str_2);
           
           String str_3=str_1+rev.reverse();
           System.out.println(str_3);
         
    }
    
}
