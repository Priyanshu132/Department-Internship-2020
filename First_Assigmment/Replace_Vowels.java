package replace_vowels;

import java.util.Scanner;

public class Replace_Vowels {
 
    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
           String str_1=s.nextLine();
           str_1.toLowerCase();
           int flag=0;
           for(int i=0;i<str_1.length();i++){
               if(str_1.charAt(i)=='a' || str_1.charAt(i)=='e' || str_1.charAt(i)=='i' || str_1.charAt(i)=='o' || str_1.charAt(i)=='u'){
                   str_1 = str_1.replace(str_1.charAt(i), 'z');
                   flag=1;
               }
           }
           if(flag==0){
               System.out.println(str_1+": No Vowels Present");
           }
           else{
               System.out.println(str_1);
           }
           
    }
    
}
