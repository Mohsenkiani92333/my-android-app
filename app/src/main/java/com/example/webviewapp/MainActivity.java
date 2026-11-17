package com.example.webviewapp;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebChromeClient;
import android.app.Activity;
import android.webkit.CookieManager;
import android.webkit.WebSettings;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        WebView webView = new WebView(this);
        webView.setWebViewClient(new WebViewClient());
        webView.setWebChromeClient(new WebChromeClient());
        
        // اجبار سخت‌افزار به استفاده از پردازنده گرافیکی برای رندر بازی
        webView.setLayerType(WebView.LAYER_TYPE_HARDWARE, null);
        
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setDomStorageEnabled(true);
        webSettings.setMixedContentMode(WebSettings.MIXED_CONTENT_ALWAYS_ALLOW);
        
        CookieManager.getInstance().setAcceptCookie(true);
        
        webView.loadUrl("file:///android_asset/index.html"); 
        
        setContentView(webView);
    }
}
