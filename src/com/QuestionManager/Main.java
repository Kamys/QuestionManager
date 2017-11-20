package com.QuestionManager;

import com.QuestionManager.model.Question;
import com.QuestionManager.model.Test;
import com.QuestionManager.view.*;
import controller.QuestionController;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        List<Question> questions = new ArrayList<>();
        questions.add(new Question("5+1=", "6", 5));
        questions.add(new Question("5+2=", "7", 5));
        questions.add(new Question("5+3=", "8", 5));
        questions.add(new Question("5+4=", "8", 5));
        questions.add(new Question("5+5=", "10", 5));

        Test test = new Test("Test 1", 4, questions);

        QuestionController controller = new QuestionController(test);
        controller.Show();
    }
}
