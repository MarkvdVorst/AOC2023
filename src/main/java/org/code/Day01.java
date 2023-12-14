package org.code;

import org.utils.FileUtils;

import java.io.File;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Day01 {
    public static void day1() throws Exception {
        ClassLoader classLoader = Thread.currentThread().getContextClassLoader();

        List<String> stringList = FileUtils.readFile(Paths.get("C:\\Users\\marcv\\OneDrive\\Bureaublad\\AOC2023\\src\\main\\resources\\day01.txt"));

        List<Integer> intList = new ArrayList<>();

        for (String text : stringList) {
            text = text.replaceAll("one", "one1one");
            text = text.replaceAll("two", "two2two");
            text = text.replaceAll("three", "three3three");
            text = text.replaceAll("four", "four4four");
            text = text.replaceAll("five", "five5five");
            text = text.replaceAll("six", "six6six");
            text = text.replaceAll("seven", "seven7seven");
            text = text.replaceAll("eight", "eight8eight");
            text = text.replaceAll("nine", "nine9nine");



            int firstDigit = 0;
            int secondDigit = 0;
            boolean digitFound = false;
            for (int i = 0; i < text.length(); i++) {
                char character = text.charAt(i);
                if(Character.isDigit(character)){
                    firstDigit = Integer.parseInt(String.valueOf(character)) * 10;
                    digitFound = true;
                    break;
                }
            }
            if(!digitFound){
                throw new Exception("No digit found");
            }
            digitFound = false;
            for (int i = text.length() - 1; i >= 0; i--) {
                char character = text.charAt(i);
                if(Character.isDigit(character)){
                    secondDigit = Integer.parseInt(String.valueOf(character));
                    digitFound = true;
                    break;
                }
            }
            if(!digitFound){
                throw new Exception("No digit found");
            }
            intList.add(firstDigit + secondDigit);
        }
        int answer = 0;
        for(int number : intList){
            System.out.println(number);
            answer += number;
        }
        System.out.println(answer);
    }
}
