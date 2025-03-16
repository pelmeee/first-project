package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuesCreate quesCreate = new QuesCreate();
        QuesPlay quesPlay = new QuesPlay();
        System.out.println("Выберите действие:");
        System.out.println("1. Создать викторину");
        System.out.println("2. Начать викторину");
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                List<Question> questions = quesCreate.createQuestions();
                System.out.println("Вы сделали викторину");
                break;
            case 2:



        }
    }
}
