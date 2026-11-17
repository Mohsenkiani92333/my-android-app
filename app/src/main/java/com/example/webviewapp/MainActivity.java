package com.example.webviewapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.app.Activity;
import android.webkit.CookieManager;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        webView.setWebViewClient(new WebViewClient());
        
        // فعال کردن جاوااسکریپت و کوکی‌ها برای کارکرد صحیح سایت
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setDomStorageEnabled(true);
        CookieManager.getInstance().setAcceptCookie(true);
        
        // اتصال به سایت شما
        webView.loadUrl("https://trendplasco.ir/"); 
        
        setContentView(webView);
    }
}
