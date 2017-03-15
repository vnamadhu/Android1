package com.felight.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class QuizActivity extends AppCompatActivity {

    private ListView lvQuiz;
    private List quizlist;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        lvQuiz=(ListView)findViewById(R.id.lvQuiz);
        initialize();
    }

    @Override
    protected void onStart() {
        super.onStart();
        QuizListAdapter adapter = new QuizListAdapter(this, quizlist);
        lvQuiz.setAdapter(adapter);
    }

    public void initialize(){
        quizlist=new ArrayList();
        quizlist.add(new Quiz(1,"What is the capital of karnataka?","A.Bangalore","B.Maysore","C.Mangalore","D.Shimoga"));
        quizlist.add(new Quiz(2,"What is the capital of India?","A.Delhi","B.Mumbai","C.Bangalore","D.Gandhinagar"));
        quizlist.add(new Quiz(3,"What is the capital of Gujarat?","A.Ahemdabad","B.Gandhinagar","C.Surat","D.Jamnagar"));
        quizlist.add(new Quiz(4,"Who is the Current PM of INDIA?","A.Narendra Modi","B.Soniya Gandhi","C.Rahul Gandhi","D.Manmohan singh"));
        quizlist.add(new Quiz(5,"Who is the Current caption of indian criket team?","A.Virat Kohali","B.Ms Dhoni","C.Suresh Raina","D.Hardik Pandya"));

    }
}
