package org.example;

import org.code.Day01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
            Day01.day1();
        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
