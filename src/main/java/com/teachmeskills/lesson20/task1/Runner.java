package com.teachmeskills.lesson20.task1;

import org.apache.commons.lang3.StringUtils;

/**
 * The Runner class calls the commons-lang3 library.
 * The StringUtils class is imported. The main method calls various methods of this class
 */
public class Runner
{
    public static void main( String[] args ){

            String value = "     2345";
            String value1 = "stfh5";
            String value2 = "Stfh5";

            //The method replaces spaces with "0"
            System.out.println(StringUtils.leftPad(value.trim(), value.length(), "0"));

            //Method to remove spaces at the beginning and end of a line
            System.out.println(StringUtils.stripStart(value, StringUtils.SPACE));

            //The method searches for a given character
            System.out.println(StringUtils.containsAny(value, '3'));

            //The method removes all leads and concatenates the string
            System.out.println(StringUtils.deleteWhitespace("   hj  c  "));

            //The method checks whether the string ends with the specified characters
            System.out.println(StringUtils.endsWith(value, "ef"));

            //The method compares strings
            System.out.println(StringUtils.equals(value,value1));

            //The method compares strings ignoring case
            System.out.println(StringUtils.equalsIgnoreCase(value1,value2));

            //The method compares multiple strings
            System.out.println(StringUtils.equalsAny("grfgf", "fdfef", "fdfef"));

        }
    }

