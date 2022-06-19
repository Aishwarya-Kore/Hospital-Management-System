
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Project;
import java.util.*;
/**
 *
 * @author Aishwarya
 */
public class PasswordHash {
    
    public static String ConvertPassword(String pass){
        
        int length = pass.length();
        int ascii[]=new int[100];
        char[] ch =new char[length];        
        for(int i=0;i<length;i++){
            ch[i]=pass.charAt(i);
        }
        for(int i=0;i<length;i++){
            ascii[i]=pass.charAt(i);
        }
        String b=new String();
        for(int i=0;i<length;i++){
            System.out.println(ascii[i]);
            b=b+ascii[i];
        }                
        
        byte[] ch1=b.getBytes();
        byte[] result = new byte[ch1.length];
        for(int i=0;i<ch1.length;i++){
            result[i]=ch1[ch1.length-i-1];
        }
        String str = new String(result);
        return str;       
    }
    public static void main(String[] args){
        
        System.out.println("Please enter your password: ");
        Scanner scan = new Scanner(System.in);
        String pass = scan.nextLine();
        System.out.println(new String(ConvertPassword(pass)));
        //[I@7cca494b
        
    }
}
