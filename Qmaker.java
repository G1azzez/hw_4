package ru.otus;

public class Qmaker {
         static  Question[] getQuestionPool(Question[] questionPool) {
                Question q1;
                q1 = new Question();
                q1.setQuestion("Сколько лап у собаки");
                q1.setOptions(new String[]{"1. Одна", "2. Две", "3. Три", "4. Четыре"});
                q1.setRightAnsw(4);
                Question q2 = new Question("Сколько всего океанов на нашей планете Земля?", new String[]{"1. 4", "2. 6", "3. 5", "4. 3"}, 3);
                Question q3 = new Question("Какаой сейчас год?", new String[]{"1. 1911", "2. 2022", "3. 1147", "4. 2021"}, 2);
                Question q4 = new Question("Раньше этот город назывался Кёнигсберг, а теперь?", new String[]{"1. Калининград", "2. Норисльск", "3. Тула"}, 1);
                Question q5 = new Question("Сколько цифр используется в двоичной системе счисления ?", new String[]{"1. Одна", "2 .Две"}, 2);
                questionPool = new Question[]{q1, q2, q3, q4, q5};
                return questionPool;
        }
        }




