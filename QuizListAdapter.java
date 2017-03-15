package com.felight.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class QuizListAdapter extends BaseAdapter {

    private Activity activity;
    private List quizlist;
    private LayoutInflater inflater;


    public QuizListAdapter(Activity activity, List quizlist) {
        this.quizlist = quizlist;
        this.activity = activity;
        inflater = activity.getLayoutInflater();
    }

    @Override
    public int getCount() {
        return quizlist.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override

    public View getView(int i, View view, ViewGroup viewGroup) {
        Quiz quiz = (Quiz)quizlist.get(i);
        view = inflater.inflate(R.layout.activity_quiz_list_adapter,viewGroup, false);
        TextView tvQuestion = (TextView) view.findViewById(R.id.tVQuestion);
        RadioButton rb1=(RadioButton)view.findViewById(R.id.rb1);
        RadioButton rb2=(RadioButton)view.findViewById(R.id.rb2);
        RadioButton rb3=(RadioButton)view.findViewById(R.id.rb3);
        RadioButton rb4=(RadioButton)view.findViewById(R.id.rb4);
        tvQuestion.setText(quiz.getQuestion());
        rb1.setText(""+quiz.getOptionA());
        rb2.setText(""+quiz.getOptionB());
        rb3.setText(""+quiz.getOptionC());
        rb4.setText(""+quiz.getOptionD());
        return view;

    }


}
