package com.felight.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import static com.felight.myapp2.PassDataActivity.NEWS_TYPE;

public class WindowActivity extends AppCompatActivity {

    public void LaunchActivity(View view){

        switch (view.getId()) {
            case R.id.btngooglenews:
                Intent intentGoogleNews = new Intent(this, NewsActivity.class);
                intentGoogleNews.putExtra(NEWS_TYPE,"Google News");
                startActivity(intentGoogleNews);
                break;

            case R.id.btnfelightnews:
                Intent intentFelightNews = new Intent(this, NewsActivity.class);
                intentFelightNews.putExtra(NEWS_TYPE,"Felight News");
                startActivity(intentFelightNews);
                break;


            case R.id.btnsportsnews:
                Intent intentSportsNews = new Intent(this, NewsActivity.class);
                intentSportsNews.putExtra(NEWS_TYPE,"Sports News");
                startActivity(intentSportsNews);
                break;

            case R.id.btnbollywoodnews:
                Intent intentBollywoodNews = new Intent(this, NewsActivity.class);
                intentBollywoodNews.putExtra(NEWS_TYPE,"Bollywood News");
                startActivity(intentBollywoodNews);
                break;

            case R.id.btnwheathernews:
                Intent intentWheatherNews = new Intent(this, NewsActivity.class);
                intentWheatherNews.putExtra(NEWS_TYPE,"Weather News");
                startActivity(intentWheatherNews);
                break;

            case R.id.btnpoliticalnews:
                Intent intentPoliticalNews = new Intent(this, NewsActivity.class);
                intentPoliticalNews.putExtra(NEWS_TYPE,"Political News");
                startActivity(intentPoliticalNews);
                break;

            case R.id.btnbusinessnews:
                Intent intentbusinessnews = new Intent(this, NewsActivity.class);
                intentbusinessnews.putExtra(NEWS_TYPE,"Business News");
                startActivity(intentbusinessnews);
                break;

            case R.id.btntechnicalnews:
                Intent intentTechnicalnews = new Intent(this, NewsActivity.class);
                intentTechnicalnews.putExtra(NEWS_TYPE,"Technical News");
                startActivity(intentTechnicalnews);
                break;

        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_window);
    }
}

