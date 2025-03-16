class Question {
    private String question;
    private String[] options;
    private int correctAnswerIndex;

    public Question(String question, String[] options, int correctAnswerIndex) {
        this.question = question;
        this.options = options;
        this.correctAnswerIndex = correctAnswerIndex;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public boolean isAnswerCorrect(int userAnswerIndex) {
        return userAnswerIndex == correctAnswerIndex;
    }

    public  int getCorrectAnswerIndex() {

        return 0;
    }

}

