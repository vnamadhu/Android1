package com.felight.myapp2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;

public class HtmlActivity extends AppCompatActivity {
    private WebView wvResult;
    private ProgressBar pbWeb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_htmlwebview);
        wvResult = (WebView) findViewById(R.id.wvResult1);
        pbWeb = (ProgressBar) findViewById(R.id.pbWeb1);
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
        WebView view = new WebView(this);
        view.getSettings().setJavaScriptEnabled(true);
        view.loadUrl("file:///android_asset/sample.html");
        setContentView(view);
    }
}
