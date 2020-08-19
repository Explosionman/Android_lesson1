package com.example.myapplication1;

public class Question {
    private int textId;
    private boolean answer;

    public Question(int textId, boolean answer) {
        this.textId = textId;
        this.answer = answer;
    }

    public int getTextId() {
        return textId;
    }

    public void setTextId(int textId) {
        this.textId = textId;
    }

    public boolean isAnswer() {
        return answer;
    }

    public void setAnswer(boolean answer) {
        this.answer = answer;
    }
}
