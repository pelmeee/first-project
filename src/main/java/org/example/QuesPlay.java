package org.example;

import java.util.List;
import java.util.Scanner;

public class QuesPlay {
    public void playQuiz(List<Question> questions) {
        Scanner scanner = new Scanner(System.in);
        for (Question question : questions) {
            System.out.println(question.getQuestion());
            for (int i = 0; i < question.getOptions().length; i++) {
                System.out.println((i + 1) + ". " + question.getOptions()[i]);
            }

            System.out.print("Ваш ответ (номер): ");
            int userAnswer = Integer.parseInt(scanner.nextLine()) - 1;

            if (question.isAnswerCorrect(userAnswer)) {
                System.out.println("Правильно!");
            } else {
                System.out.print("Неправильно.");
            }
        }
    }
}

