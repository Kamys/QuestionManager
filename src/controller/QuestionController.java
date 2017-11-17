package controller;


import com.QuestionManager.model.Question;
import com.QuestionManager.view.QuestionView;

public class QuestionController {
    private Question question;

    public QuestionController(Question question) {
        this.question = question;
    }

    public void Show(){
        QuestionView questionView = new QuestionView();
        questionView.getQuestion().setText(question.getQuestionText());
        questionView.showFrame();
    }
}
