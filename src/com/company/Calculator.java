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

        {put("I",1);
        put("II",2);
        put("III",3);
        put("IV",4);
        put("V",5);
        put("VI",6);
        put("VII",7);
        put("VIII",8);
        put("IX",9);
        put("X",10);
        }
    };
        Map<Integer, String> romeResult = new HashMap<Integer, String>() {
        {put(1 , "I");
        put(2 , "II");
        put(3,"III");
        put(4,"IV");
        put(5,"V");
        put(6,"VI");
        put(7,"VII");
        put(8,"VIII");
        put(9,"IX");
        put(10,"X");
        put(12,"XII");
        put(13,"XIII");
        put(14,"XIV");
        put(15,"XV");
        put(16,"XVI");
        put(17,"XVII");
        put(18,"XVIII");
        put(19,"XIX");
        put(20,"XX");
        put(21,"XXI");
        put(24,"XXIV");
        put(25,"XXV");
        put(27,"XXVII");
        put(28,"XXVIII");
        put(30,"XXX");
        put(32,"XXXII");
        put(35,"XXXV");
        put(36,"XXXVI");
        put(40,"XL");
        put(42,"XLII");
        put(45,"XLV");
        put(48,"XLVIII");
        put(49,"XLIX");
        put(50,"L");
        put(54,"LIV");
        put(56," LVI");
        put(60,"LX");
        put(63,"LXIII");
        put(64,"LXIV");
        put(70,"LXX");
        put(72,"LXXII");
        put(80,"LXXX");
        put(81,"LXXXI");
        put(90,"XC");
        put(100,"C");
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
if((str1.equals("I")||str1.equals("II") ||str1.equals("III")||str1.equals("IV")
    ||str1.equals("V")||str1.equals("VI")||str1.equals("VII")||str1.equals("VIII")||str1.equals("IX")
        ||str1.equals("X"))&&(str2.equals("I")||str2.equals("II") ||str2.equals("III")||str2.equals("IV")
        ||str2.equals("V")||str2.equals("VI")||str2.equals("VII")||str2.equals("VIII")||str2.equals("IX")
        ||str2.equals("X"))) {
    System.out.println( romeResult.get(result));
}
else {
    System.out.println(result);
}
    }
}

