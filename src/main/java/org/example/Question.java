package org.example;

import java.util.ArrayList;

public class Question {
    private int quantity;
    private String text;

    private ArrayList<String> answers;

    public Question(int quantity, String text, ArrayList<String> answers) {
        this.quantity = quantity;
        this.text = text;
        this.answers = answers;
    }
}
