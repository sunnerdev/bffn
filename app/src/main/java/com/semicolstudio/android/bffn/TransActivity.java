package com.semicolstudio.android.bffn;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import android.widget.Toolbar;

public class TransActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        getActionBar().getDisplayOptions();
        //setDisplayHomeAsUpEnabled(true); // In `OnCreate();`
        // setContentView(R.layout.activity_trans);
    }

    private void setActionBar() {
    }




    @Override
    public boolean onNavigateUp(){
        finishActivity(1);
        return true;
    }
}
