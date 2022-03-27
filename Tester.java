package ru.otus;
import java.util.Scanner;
public class Tester {
    static int qetAnswer(Question question, int answer) {
        char ch;
        int tempChoice = 0;
        String input;
        Scanner sc = new Scanner(System.in);
        while (tempChoice == 0) {
            input = sc.next();
            ch = input.charAt(0);
            if (input.length() == 1 && Character.isDigit(ch) && (Integer.parseInt(input) > 0 && Integer.parseInt(input) <= question.getOptions().length)) {
                System.out.println("Ваш выбор - ответ №: " + input);
                tempChoice = Integer.parseInt(input);
            } else {
                System.out.println("Ошибка ввода");
            }
            answer=tempChoice;
        }
        return answer;
    }
}



