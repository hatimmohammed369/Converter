/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter;

/**
 *
 * @author Acer
 */
public class Utilities {
    public static String reverse(String str){
        String newStr = "";
        for(int i = str.length()-1;i >= 0;i--)
            newStr += str.charAt(i);
        return newStr;
    }
    
    public static boolean isDecimalDigit(char digit){
        return digit >= '0' && digit <= '9';
    }
    
    public static boolean isBinaryDigit(char digit){
        return digit == '0' || digit == '1';
    }
    
    public static boolean isOctalDigit(char digit){
        return digit >= '0' && digit <= '7';
    }
    
    public static boolean isHexadecimalDigit(char digit){
        return isDecimalDigit(digit) || ((digit >= 'a' && digit <= 'f') || (digit >= 'A' && digit <= 'F'));
    }
    
    public static int toDecimalValue(char hexDigit){
        if(isDecimalDigit(hexDigit))
            return Character.digit(hexDigit, 10);
        if(Character.isUpperCase(hexDigit))
            return (int) (hexDigit - 55);
        return (int) (hexDigit - 87);
    }
}
