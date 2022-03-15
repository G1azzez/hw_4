package ru.otus;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String input;
        char ch;
        int tempChoice;
        int goals = 0;
        Question q1 = new Question();
        q1.setQuestion("Сколько лап у собаки");
        q1.setOptions(new String[]{"1. Одна", "2. Две", "3. Три", "4. Четыре"});
        q1.setRightAnsw(4);
        Question q2 = new Question("Сколько всего океанов на нашей планете Земля?", new String[]{"1. 4", "2. 6", "3. 5", "4. 3"}, 3);
        Question q3 = new Question("Какаой сейчас год?", new String[]{"1. 1911", "2. 2022", "3. 1147", "4. 2021"}, 2);
        Question q4 = new Question("Раньше этот город назывался Кёнигсберг, а теперь?", new String[]{"1. Калининград", "2. Норисльск", "3. Тула"}, 1);
        Question q5 = new Question("Сколько цифр используется в двоичной системе счисления ?", new String[]{"1. Одна", "2 .Две"}, 2);
        Question[] questionPool = new Question[]{q1, q2, q3, q4, q5};
        System.out.println("Вам будет предложено несколько вопросов.");
        System.out.println("Введите на клавиатуре номер правитльного ответа.");

        for (int k = 0; k < questionPool.length; k++){
            tempChoice=0;
            System.out.println(questionPool[k].getQuestion());
            for (int i = 0; i < questionPool[k].getOptions().length; i++) {
                System.out.println(questionPool[k].getOptions()[i]);
            }
                Scanner sc = new Scanner(System.in);
                while (tempChoice == 0) {
                    input = sc.next();
                    ch = input.charAt(0);
                    if (input.length() == 1 && Character.isDigit(ch) && (Integer.parseInt(input) > 0 && Integer.parseInt(input) <= questionPool[k].getOptions().length)) {
                        System.out.println("Ваш выбор - ответ №: " + input);
                        tempChoice = Integer.parseInt(input);
                    } else {
                        System.out.println("Ошибка ввода");
                    }
                    if (tempChoice == (questionPool[k].getRightAnsw())) {
                        goals++;
                    }

                }
            }
        System.out.println("Колличество правильных отетов "+ goals);
        }
    }
