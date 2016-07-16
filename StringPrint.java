/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringprint;

import java.util.Scanner;

/**
 *
 * @author StarHP
 */
public class StringPrint {
    
   public static void main(String[] args) {
        Scanner s5=new Scanner(System.in);
      String s1=s5.nextLine();
        String s2=s5.nextLine();  
                for(int i=0;i<s1.length()-1;i++){
             for(int j=0;j<s2.length()-1;j++){
        if(s1.charAt(i)==s2.charAt(j)){
            if(s1.charAt(i+1)==s2.charAt(j+1)){
                System.out.println(""+s1.charAt(i)+s1.charAt(i+1)+"   match to    "+s2.charAt(j)+s2.charAt(j+1));
                
                  }
                }
             }
             
         }
               
        
          
// System.out.println("Flase");}
}
   
}