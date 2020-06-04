package com.example.footballquiz;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    Map<String, String> questions = new HashMap<String, String>();
    int questionNo = 1;
    TextView outcome;
    TextView answer1;
    TextView answer2;
    TextView answer3;
    TextView question;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        question = findViewById(R.id.Question);
        answer1 = findViewById(R.id.Answer1);
        answer2 = findViewById(R.id.Answer2);
        answer3 = findViewById(R.id.Answer3);
        outcome = findViewById(R.id.Outcome);

        questions.put("Question1", "Distance of the penalty box from the touch line");
        questions.put("Right1", "18 yards");
        questions.put("WrongA1", "21 yards");
        questions.put("WrongB1", "24 yards");

        questions.put("Question2", "Usual half time interval");
        questions.put("Right2", "15 minutes");
        questions.put("WrongA2", "10 minutes");
        questions.put("WrongB2", "25 minutes");

        questions.put("Question3", "Who's the GOAT?");
        questions.put("Right3", "Cristiano 'The Beast' Ronaldo");
        questions.put("WrongA3", "Lionel 'Midget' Messi");
        questions.put("WrongB3", "Seriously?");

        questions.put("Question4", "Another term for a winger");
        questions.put("Right4", "Flanker");
        questions.put("WrongA4", "Fly Half");
        questions.put("WrongB4", "Flapper");

        questions.put("Question5", "Style of play conceptualised by Klopp");
        questions.put("Right5", "Gegenpress");
        questions.put("WrongA5", "Tiki Taka");
        questions.put("WrongB5", "Aggressive Counterattacking");

        setQuestion();
    }

    private void setQuestion(){
        /*
        question.setText(questions.get("Question" + questionNo).toString());
        answer1.setText(questions.get("Right" + questionNo).toString());
        answer1.setTag("Correct");
        answer2.setText(questions.get("WrongA" + questionNo).toString());
        answer3.setText(questions.get("WrongB" + questionNo).toString());
        */

        List currentAnswers = new ArrayList(3);
        currentAnswers.add(questions.get("Right" + questionNo).toString());
        currentAnswers.add(questions.get("WrongA" + questionNo).toString());
        currentAnswers.add(questions.get("WrongB" + questionNo).toString());
        Collections.shuffle(currentAnswers);

        question.setText(questions.get("Question" + questionNo).toString());
        answer1.setText(currentAnswers.get(0).toString());
        answer2.setText(currentAnswers.get(1).toString());
        answer3.setText(currentAnswers.get(2).toString());

        if(answer1.getText() == questions.get("Right"+ questionNo).toString()){
            answer1.setTag("Correct");
        }
        else{
            answer1.setTag("Incorrect");
        }

        if(answer2.getText() == questions.get("Right"+ questionNo).toString()){
            answer2.setTag("Correct");
        }
        else{
            answer2.setTag("Incorrect");
        }

        if(answer3.getText() == questions.get("Right"+ questionNo).toString()){
            answer3.setTag("Correct");
        }
        else{
            answer3.setTag("Incorrect");
        }

    }

    public void onAnswer1Click(View v){
        if(v.getTag() == "Correct"){
            questionNo++;
            if(questionNo*4 > questions.size()){
                outcome.setText("You win!");
            }
            else{
                outcome.setText("Well done!");
                setQuestion();
            }
        }
        else{
            outcome.setText("Lmao, Wrong! Try Again.");
        }
    }

    public void onAnswer2Click(View v){
        if(v.getTag() == "Correct"){
            questionNo++;
            if(questionNo*4 > questions.size()){
                outcome.setText("You win!");
            }
            else{
                outcome.setText("Well done!");
                setQuestion();
            }
        }
        else{
            outcome.setText("Lmao, Wrong! Try Again.");
        }
    }

    public void onAnswer3Click(View v){
        if(v.getTag() == "Correct"){
            questionNo++;
            if(questionNo*4 > questions.size()){
                outcome.setText("You win!");
            }
            else{
                outcome.setText("Well done!");
                setQuestion();
            }
        }
        else{
            outcome.setText("Lmao, Wrong! Try Again.");
        }
    }
}
