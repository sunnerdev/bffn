package com.semicolstudio.android.bffn;

import android.app.ActionBar;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //ActionBar actionBar = getActionBar();
        //actionBar.setNavigationMode(ActionBar.NAVIGATION_MODE_TABS);



        setContentView(R.layout.activity_main);

        final WebView myWebView = (WebView) findViewById(R.id.webview);

        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setUseWideViewPort(true);
        webSettings.setLoadWithOverviewMode(true);
        webSettings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.SINGLE_COLUMN);
        webSettings.setDefaultFontSize(15);
        webSettings.setDomStorageEnabled(true);
        webSettings.setDatabaseEnabled(true);
        webSettings.setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        webSettings.setAppCacheEnabled(true);
        webSettings.setAllowFileAccess(true);
       // webSettings.setAppCachePath(AppConfig.WEB_CACHE_PATH);
        myWebView.loadUrl("https://v2.zopim.com/widget/livechat.html?api_calls=%5B%5D&hostname=www.bafobet.com&key=4FyyxaWZMLsHZ1GxHLsCHRHYtIcsVG5d&lang=th&");


    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    protected void onStart() {
        super.onStart();

        //Toast.makeText(this, "onStart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        //Toast.makeText(this, "onResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        //Toast.makeText(this, "onRestart", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        //Toast.makeText(this, "onPause", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        //Toast.makeText(this, "onStop", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //Toast.makeText(this, "onDestroy", Toast.LENGTH_SHORT).show();
    }


    public void menuDep(View view) {
        Intent intent = new Intent(MainActivity.this, DepositActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Button1 Clicked!", Toast.LENGTH_SHORT).show();
    }

    public void menuTrans(View view) {
        Intent intent = new Intent(MainActivity.this, TransActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Button1 Clicked!", Toast.LENGTH_SHORT).show();
    }

    public void menuWi(View view) {
        Intent intent = new Intent(MainActivity.this, WithActivity.class);
        //startActivity(intent);
        Toast.makeText(this, "Button1 Clicked!", Toast.LENGTH_SHORT).show();
        startActivityFromChild(this,intent,1);
    }

    public void menuNew(View view) {
        Intent intent = new Intent(MainActivity.this, NewidActivity.class);
        startActivity(intent);
        Toast.makeText(this, "Button1 Clicked!", Toast.LENGTH_SHORT).show();
    }
}
