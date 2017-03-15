package com.felight.myapp2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class ActivityNavigator extends AppCompatActivity {
    public  static final String News_Type ="News_Type";
    public void LaunchActivity(View view){

        switch(view.getId()){
           /* case R.id.btnGreetUser:
                Intent intentGreetUser=new Intent(this,GreetUserActivity.class);
                startActivity(intentGreetUser);
                break;

            case R.id.btnCalculator:
                Intent intentCalculator=new Intent(this,SimpleCalculatorActivity.class);
                startActivity(intentCalculator);
                break;*/

            case R.id.btnGoogleNews:
                Intent intentGoogleNews = new Intent(this,NewsActivity.class);
                intentGoogleNews.putExtra(News_Type,"Google News");
                startActivity(intentGoogleNews);
                break;

            case R.id.btnFelightNews:
                Intent intentFelightNews = new Intent(this,NewsActivity.class);
                intentFelightNews.putExtra(News_Type,"Felight News");
                startActivity(intentFelightNews);
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigator);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=new MenuInflater(getBaseContext());
        menuInflater.inflate(R.menu.activity_navigator_menu,menu);

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.menu_settings:
                Intent intentSettings = new Intent(getBaseContext(),SettingsActivity.class);
                startActivity(intentSettings);
                break;

            case R.id.menu_help:
                Intent intentHelp = new Intent(getBaseContext(),HelpActivity.class);
                startActivity(intentHelp);
                break;

            case  R.id.menu_about:
                Intent intentAbout = new Intent(getBaseContext(), AboutActivity.class);
                startActivity(intentAbout);
                break;

            case R.id.menu_forums:
                Toast.makeText(getBaseContext(),
                        item.getTitle()+ "selected Forums", Toast.LENGTH_SHORT)
                        .show();
                break;
            case R.id.menu_online:
                Toast.makeText(getBaseContext(),
                        item.getTitle()+"Selected Online",Toast.LENGTH_SHORT)
                        .show();
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
