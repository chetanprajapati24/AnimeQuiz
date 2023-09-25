package com.jay.animequiz.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.os.Looper;
import android.widget.Button;

import com.jay.animequiz.R;
import com.jay.animequiz.databinding.ActivityQuizBinding;
import com.jay.animequiz.model.QuestionModel;
import com.jay.animequiz.model.common.Constants;
import com.jay.animequiz.model.common.Util;
import com.jay.animequiz.viewModel.QuestionViewModel;

import java.util.HashSet;
import java.util.Random;

import dagger.hilt.android.AndroidEntryPoint;

@AndroidEntryPoint
public class QuizActivity extends AppCompatActivity {
    private ActivityQuizBinding bind;
    private Button[] arrayButtons =null;
    private CountDownTimer timer;
    private QuestionViewModel questionViewModel;
    private HashSet<Integer> randomSet;
    private int correctAnswer=0, numOfQuestion=1, totalPoints=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bind=ActivityQuizBinding.inflate(getLayoutInflater());
        Util.loadUrl(R.drawable.question_background,bind.ivBackgroundQuestion,this);
        setContentView(bind.getRoot());
        randomSet=generateRandomArray();


        arrayButtons= new Button[]{bind.btnAnswer1, bind.btnAnswer2,bind.btnAnswer3};
        setUpViewModel();
        initTimer();
    }

    private void setUpViewModel() {
        questionViewModel= new ViewModelProvider(this).get(QuestionViewModel.class);
        questionViewModel.getQuestionRandom(randomSet).observe(this, this::populateQuestionView);
    }
    private void populateQuestionView(QuestionModel question){
        bind.tvQuestion.setText(question.getQuestion());
        Util.loadUrl(question.getUrl(), bind.ivQuestion, this);
        bind.btnAnswer1.setText(question.getAnswer1());
        bind.btnAnswer2.setText(question.getAnswer2());
        bind.btnAnswer3.setText(question.getAnswer3());
        correctAnswer=question.getCorrectAnswer();
    }
    private void initTimer() {
        timer = new CountDownTimer(31000,1000) {
            @Override
            public void onTick(long millis) {
                long seconds = millis /1000;
                bind.pbTimer.setProgress(((int)seconds * 100) / 30);
                switch((int) seconds){
                    case 20:
                        bind.pbTimer.setIndicatorColor(ContextCompat.getColor(QuizActivity.this,R.color.green));
                        break;
                    case 15:
                        bind.pbTimer.setIndicatorColor(ContextCompat.getColor(QuizActivity.this,R.color.yellow));
                        break;
                    case 8:
                        bind.pbTimer.setIndicatorColor(ContextCompat.getColor(QuizActivity.this,R.color.red));
                        break;
                    default:
                        break;
                }
                bind.tvTimer.setText(String.valueOf(seconds));
            }

            @Override
            public void onFinish() {
                timer.cancel();
                arrayButtons[correctAnswer -1].setBackgroundColor(ContextCompat.getColor(QuizActivity.this,R.color.green));
                enableButtons(false);
            }
        };
        setUpButtonListeners();
        timer.start();
    }

    private void setUpButtonListeners() {
        for(Button btn : arrayButtons){
            btn.setOnClickListener(v->{
                timer.cancel();
                if(Integer.parseInt(btn.getTag().toString())==correctAnswer){
                    //We change the color of the button if the answer is correct
                    btn.setBackgroundColor(ContextCompat.getColor(QuizActivity.this,R.color.green));
                    totalPoints += Integer.parseInt(bind.tvTimer.getText().toString());
                }
                else{
                    //red color to the button if the answer is wrong
                    btn.setBackgroundColor(ContextCompat.getColor(QuizActivity.this,R.color.red));
                    //We mark the button with the correct answer with the color green
                    arrayButtons[correctAnswer -1].setBackgroundColor(ContextCompat.getColor(QuizActivity.this,R.color.green));

                }
                enableButtons(false);
                nextQuestion();
            })
            ;
        }
    }
    private void nextQuestion(){
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            if(numOfQuestion==10){
               startActivity(new Intent(QuizActivity.this, ScoreActivity.class).putExtra(Constants.POINTS_EXTRAS,totalPoints));
            }
            else{
                questionViewModel.getQuestionRandom(randomSet);
                //we put the initial color back to the buttons
                for(Button btn :arrayButtons){
                    btn.setBackgroundColor(ContextCompat.getColor(QuizActivity.this,android.R.color.transparent));
                }
                //we reset the color of the progress indicator of the timer
                bind.pbTimer.setIndicatorColor(ContextCompat.getColor(this,R.color.white));
                enableButtons(true);
                initTimer();
                numOfQuestion++;
            }
        },1000);
    }
    private void enableButtons(boolean state) {
        bind.btnAnswer1.setEnabled(state);
        bind.btnAnswer2.setEnabled(state);
        bind.btnAnswer3.setEnabled(state);
    }
    private HashSet<Integer> generateRandomArray(){
        int size=10;
        Random random= new Random();
        HashSet<Integer> s= new HashSet<>(size);
        while(s.size() < size){
            s.add(random.nextInt(27));
        }
        return s;
    }
}