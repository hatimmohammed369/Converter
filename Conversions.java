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
public class Conversions {
    public static String decimalToBinary(String decimal){
        if(decimal.equals(""))
            return "";
        if(decimal.charAt(0) == '-' && decimal.length() > 1)
            return Long.toBinaryString(Long.parseLong(decimal));
        for(int i = 0; i < decimal.length();i++)
            if(!Utilities.isDecimalDigit( decimal.charAt(i) ))
                return "Error!";
        switch(decimal){
            case "0":
                return "0";
            case "1":
                return "1";
            default:
                long value = Long.parseLong(decimal);
                String result = "";
                while(value > 0){
                    result += (value % 2);
                    value /= 2;
                }
                return Utilities.reverse(result);
        }
    }
    
    public static String decimalToOctal(String decimal){
        if(decimal.equals(""))
            return "";
        if(decimal.charAt(0) == '-' && decimal.length() > 1)
            return Long.toOctalString(Long.parseLong(decimal));
        for(int i = 0; i < decimal.length();i++)
            if(!Utilities.isDecimalDigit( decimal.charAt(i) ))
                return "Error!";
        switch(decimal){
            case "0":
                return "0";
            case "1":
                return "1";
            case "2":
                return "2";
            case "3":
                return "3";
            case "4":
                return "4";
            case "5":
                return "5";
            case "6":
                return "6";
            case "7":
                return "7";
            default:
                long value = Long.parseLong(decimal);
                String result = "";
                while(value > 0){
                    result += (value % 8);
                    value /= 8;
                }
                return Utilities.reverse(result);
        }
    }
    
    public static String decimalToHexadecimal(String decimal){
        if(decimal.equals(""))
            return "";
        if(decimal.charAt(0) == '-' && decimal.length() > 1)
            return Long.toHexString(Long.parseLong(decimal));
        for(int i = 0; i < decimal.length();i++)
            if(!Utilities.isDecimalDigit( decimal.charAt(i) ))
                return "Error!";
        switch(decimal){
            case "0":
                return "0";
            case "1":
                return "1";
            case "2":
                return "2";
            case "3":
                return "3";
            case "4":
                return "4";
            case "5":
                return "5";
            case "6":
                return "6";
            case "7":
                return "7";
            default:
                long value = Long.parseLong(decimal);
                String result = "";
                while(value > 0){
                    result += Character.toUpperCase( Character.forDigit( (int)(value % 16) , 16) );
                    value /= 16;
                }
                return Utilities.reverse(result);
        }
    }
    
    public static String binaryToDecimal(String binary){
        if(binary.equals(""))
            return "";
        for(int i = 0; i < binary.length();i++)
            if(!Utilities.isBinaryDigit( binary.charAt(i) ))
                return "Error!";
        switch(binary){
            case "0":
                return "0";
            case "1":
                return "1";
            default:
                binary = Utilities.reverse(binary);
                long result = 0;
                for(int i = 0;i < binary.length();i++)
                    if(binary.charAt(i) != '0')
                        result += (long) Math.pow(2, i);
                return String.valueOf(result);
        }
    }
    
    public static String binaryToOctal(String binary){
        return decimalToOctal( binaryToDecimal(binary) );
    }
    
    public static String binaryToHexadecimal(String binary){
        return decimalToHexadecimal( binaryToDecimal(binary) );
    }
    
    public static String octalToDecimal(String octal){
        if(octal.equals(""))
            return "";
        for(int i = 0; i < octal.length();i++)
            if(!Utilities.isOctalDigit( octal.charAt(i) ))
                return "Error!";
        switch(octal){
            case "0":
                return "0";
            case "1":
                return "1";
            case "2":
                return "2";
            case "3":
                return "3";
            case "4":
                return "4";
            case "5":
                return "5";
            case "6":
                return "6";
            case "7":
                return "7";
            default:
                octal = Utilities.reverse(octal);
                long result = 0;
                for(int i = 0;i < octal.length();i++)
                    result += (long) Math.pow(8, i) * Character.digit(octal.charAt(i), 10);
                return String.valueOf(result);
        }
    }
    
    public static String octalToBinary(String octal){
        return decimalToBinary( octalToDecimal(octal) );
    }
    
    public static String octalToHexadecimal(String octal){
        return decimalToHexadecimal( octalToDecimal(octal) );
    }
    
    public static String hexadecimalToDecimal(String hex){
        if(hex.equals(""))
            return "";
        for(int i = 0; i < hex.length();i++)
            if(!Utilities.isHexadecimalDigit( hex.charAt(i) ))
                return "Error!";
        switch(hex){
            case "0":
                return "0";
            case "1":
                return "1";
            case "2":
                return "2";
            case "3":
                return "3";
            case "4":
                return "4";
            case "5":
                return "5";
            case "6":
                return "6";
            case "7":
                return "7";
            case "8":
                return "8";
            case "9":
                return "9";
            case "A":
            case "a":
                return "10";
            case "B":
            case "b":
                return "11";
            case "C":
            case "c":
                return "12";
            case "D":
            case "d":
                return "13";
            case "E":
            case "e":
                return "14";
            case "F":
            case "f":
                return "15";
            default:
                hex = Utilities.reverse(hex);
                long result = 0;
                for(int i = 0;i < hex.length();i++)
                    result += (long) Math.pow(16, i) * Utilities.toDecimalValue( hex.charAt(i) );
                return String.valueOf(result);
        }
    }
    
    public static String hexadecimalToBinary(String hex){
        return decimalToBinary( hexadecimalToDecimal(hex) );
    }
    
    public static String hexadecimalToOctal(String hex){
        return decimalToOctal( hexadecimalToDecimal(hex) );
    }
    
    public static void main(String[] args){
        System.out.println(binaryToOctal("1"));
    }
}
