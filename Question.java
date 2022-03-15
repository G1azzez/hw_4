package ru.otus;

public class Question {
    private String question;
    private String[] options;
    private int rightAnsw;

    public Question() {
    }

    public Question(String question, String[] options, int rightAnsw) {
        this.question = question;
        this.options = options;
        this.rightAnsw = rightAnsw;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String[] getOptions() {
        return options;
    }

    public void setOptions(String[] options) {
        this.options = options;
    }

    public int getRightAnsw() {
        return rightAnsw;
    }

    public void setRightAnsw(int rightAnsw) {
        this.rightAnsw = rightAnsw;
    }


}