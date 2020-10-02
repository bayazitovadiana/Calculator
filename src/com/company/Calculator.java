package com.company;

import java.util.*;

public class Calculator {
    String operator; //глобальная переменная класса - оператор выражения,
    // чтобы можно было ее использовать для вычисления выражения
    int firstNumber; //
    int secondNumber;
    String str1;
    String str2;
    int result;
    Map<String, Integer> romeNumbers = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("II", 2);
            put("III", 3);
            put("IV", 4);
            put("V", 5);
            put("VI", 6);
            put("VII", 7);
            put("VIII", 8);
            put("IX", 9);
            put("X", 10);
        }
    };


    public void count() throws Exception { // метод для чтения строки ввода и разбивку его на числа и операторы
        //разбить строку на три по пробелам
        // строка 1 -  int firstNumber, строка 2 - орператор, строка 3 -  int SecondNuvber;
        Scanner in = new Scanner(System.in);
        String input = in.nextLine();
        String[] words = input.split("\\s+");
       str1 = words[0];
       str2 = words[2];
        operator = words[1];
        //проверяем, чтобы в выражениии были только арабские или только римские цифры
        try {
            if ((str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") ||
                    str1.equals("8") || str1.equals("9") || str1.equals("10")) && (str2.equals("1") || str2.equals("2") || str2.equals("3") || str2.equals("4") ||
                    str2.equals("5") || str2.equals("6") || str2.equals("7") || str2.equals("8") || str2.equals("9") || str2.equals("10"))) {
                firstNumber = Integer.parseInt(str1); //если это циферь
                secondNumber = Integer.parseInt(str2);
            } else {
                firstNumber = romeNumbers.get(str1); //что хочу я - чтобы сразу проверялось соответствие и бралось значение
                secondNumber = romeNumbers.get(str2);
            }
        } catch (Exception ex) { //идем искать в хешмеп
            System.out.print("Error");
        }
        //производим вычисление между int firstNumber, int SecondNuvber и выводим результат
        if (operator.equals("*")) {
            result = firstNumber * secondNumber;
        }
        else if (operator.equals("+")) {
            result = firstNumber + secondNumber;
        }
         else if (operator.equals("-")) {
            result = firstNumber - secondNumber;
        }
        else if (operator.equals("/")) {
            result = firstNumber / secondNumber;
        }
        System.out.println(result);

    }
}

