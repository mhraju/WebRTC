package com.mhraju.webrtc;

import android.content.ComponentName;
import android.net.Uri;
import android.support.customtabs.CustomTabsClient;
import android.support.customtabs.CustomTabsIntent;
import android.support.customtabs.CustomTabsServiceConnection;
import android.support.customtabs.CustomTabsSession;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {

    private WebView mWebView;
    private AdView mBannerAd;
    final String CUSTOM_TAB_PACKAGE_NAME = "com.android.chrome";
    final String websiteURL = "http://viralandroid.com/";
    final String googleURL = "http://google.com/";

    CustomTabsClient mCustomTabsClient;
    CustomTabsSession mCustomTabsSession;
    CustomTabsServiceConnection mCustomTabsServiceConnection;
    CustomTabsIntent mCustomTabsIntent;

    // website to be visited
    static final String SITE_URL = "http://androidcss.com/";

    // Define variables for custom tabs and its builder
    CustomTabsIntent customTabsIntent;
    CustomTabsIntent.Builder intentBuilder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mWebView = (WebView) findViewById(R.id.activity_main_webview);

        mBannerAd = (AdView) findViewById(R.id.banner_AdView);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        mWebView.loadUrl("https://appear.in/");

       showBannerAd();

    }



    private void showBannerAd() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("ca-app-pub-6008099628983320~8146629099")
                .build();
        mBannerAd.loadAd(adRequest);
    }



}