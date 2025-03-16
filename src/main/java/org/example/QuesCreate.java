package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QuesCreate {

    public List<Question> createQuestions() {
        List<Question> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите вопрос (или 'exit' для выхода): ");
            String questionText = scanner.nextLine();
            if (questionText.equalsIgnoreCase("exit")) break;

            List<String> options = new ArrayList<>();
            while (true) {
                System.out.print("Введите вариант ответа (или 'Stop' для завершения): ");
                String option = scanner.nextLine();
                if (option.equalsIgnoreCase("Stop")) break;
                options.add(option);
            }

            System.out.print("Введите номер правильного ответа (1-" + options.size() + "): ");
            int answerIndex = Integer.parseInt(scanner.nextLine()) - 1;

            questions.add(new Question(questionText, options.toArray(new String[0]), answerIndex));
        }
        return questions;
    }
}
