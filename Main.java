package ru.otus;
public class Main {
    public static void main(String[] args) {
        final int pool = 5;
        int choice=0;
        int goals = 0;
        Question[] questionPool = new Question[pool];
        questionPool = Qmaker.getQuestionPool(questionPool);
        System.out.println("Вам будет предложено несколько вопросов.");
        System.out.println("Введите на клавиатуре номер правитльного ответа.");
        for (int i = 0; i < questionPool.length; i++) {
            System.out.println(questionPool[i].getQuestion());
            for (int j = 0; j < questionPool[i].getOptions().length; j++) {
                System.out.println(questionPool[i].getOptions()[j]);
            }
            choice = Tester.qetAnswer(questionPool[i],choice);
            if (choice==questionPool[i].getRightAnsw()){
                goals++;
            }
        }
        System.out.println("колличество правильных ответов " + goals);
    }
}