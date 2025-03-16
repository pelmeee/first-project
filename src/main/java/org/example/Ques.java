package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        QuesCreate quesCreate = new QuesCreate();
        QuesPlay quesPlay = new QuesPlay();
        List<Question> questions = null;
        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать викторину");
            System.out.println("2. Начать викторину");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:

                    List<Question> existingQuestions = quesCreate.createQuestions();
                    quesPlay.playQuiz(existingQuestions);
                    break;
                case 2:
                    if (questions == null) {
                        System.out.println("Сначало создайте викторину");
                    } else {
                        quesPlay.playQuiz(questions);
                    }

                    break;

            }
        }
    }
}
