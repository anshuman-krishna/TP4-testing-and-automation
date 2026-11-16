package com.example;

public class FizzBuzz {
    public String convert(int number){
        StringBuilder result = new StringBuilder();
        if(number % 3 == 0) result.append("Fizz");
        if(number % 5 == 0) result.append("Buzz");
        if(!result.isEmpty())return result.toString();
        return Integer.toString(number);
    }
}
