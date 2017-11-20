package com.QuestionManager;

import com.QuestionManager.model.Question;
import com.QuestionManager.model.Test;
import controller.TestController;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        questions.add(new Question("5+1=", "6", 5));
        questions.add(new Question("5+2=", "7", 5));
        questions.add(new Question("5+3=", "8", 5));
        questions.add(new Question("5+4=", "8", 5));
        questions.add(new Question("5+5=", "10", 5));

        Test test = new Test("Test 1", 20, questions);

        TestController controller = new TestController(test);
        controller.Show();
    }
}
