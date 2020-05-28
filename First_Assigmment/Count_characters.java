
package count_characters;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;


public class Count_characters {

   
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
           String str_1=s.nextLine();
           char[] arr=str_1.toCharArray();
           
           Map<Character,Integer> hash=new HashMap<Character, Integer>();
            
           
           for(char a:arr){
               
               if(hash.containsKey(a)){
                   hash.put(a,hash.get(a)+1);
                   
               }
               else{
                   hash.put(a,1);
               }
           }
           hash.remove(' ');
           System.out.println(hash);
           
           
           
    }
    
}
