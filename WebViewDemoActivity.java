package com.felight.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class WebViewDemoActivity extends AppCompatActivity {
            private WebView wvResult;
            private ProgressBar pbWeb;
            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_web_view_demo);
                wvResult = (WebView) findViewById(R.id.wvResult);
                pbWeb = (ProgressBar) findViewById(R.id.pbWeb);
            }
            @Override
            protected void onStart() {
                super.onStart();
                wvResult.setWebViewClient(new WebViewClient(){
                    @Override
                    public void onPageFinished(WebView view, String url) {
                        super.onPageFinished(view, url);
                        pbWeb.setVisibility(View.INVISIBLE);
                    }
                });
                WebSettings webSettings = wvResult.getSettings();
                webSettings.setJavaScriptEnabled(true);
                wvResult.loadUrl("http://www.gmail.com");
    }
}
