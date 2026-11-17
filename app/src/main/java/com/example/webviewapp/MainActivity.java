package com.example.webviewapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        
        // اینجا به جای سایت گوگل، فایل محلی خودمان را باز می‌کنیم
        webView.loadUrl("file:///android_asset/index.html"); 
        
        setContentView(webView);
    }
}
