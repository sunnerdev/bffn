package com.semicolstudio.android.bffn;

import android.app.Activity;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.autofill.AutofillValue;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import android.widget.Toast;

public class WithActivity extends AppCompatActivity {

    private TableLayout frm;
    private TextView amount;
    private RadioGroup fromgame;
    private RadioButton fromgameb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_with);
        frm = (TableLayout) findViewById(R.id.frm_with);
        amount = findViewById(R.id.amount);
        fromgame = findViewById(R.id.fromgame);
        int selectedId = fromgame.getCheckedRadioButtonId();
        fromgameb = findViewById(selectedId);
        //int frmg = fromgame.getCheckedRadioButtonId();
        //String frmgam = (String) frmg;

        Button btnSubmit_wi = (Button) findViewById(R.id.btnSubmit_wi);
        btnSubmit_wi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String amountText = amount.getText().toString();
                String frmgam = fromgameb.getText().toString();


                Toast.makeText(getApplicationContext(),
                        "SM > "+amountText+" > "+frmgam, Toast.LENGTH_SHORT).show();
            }
        });

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){

            case android.R.id.home:
                onBackPressed();

                Toast.makeText(this, "With Cass Pass", Toast.LENGTH_SHORT).show();
                //finishFromChild(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    public void avtBack(View view) {
        onBackPressed();
        Toast.makeText(this, "Wi Close To Main", Toast.LENGTH_SHORT).show();
    }

    /*public void frmSubmit(View view) {

        TextView amount = (TextView) findViewById(R.id.amount);

        Toast.makeText(this, "Submit Clicked!"+amount, Toast.LENGTH_SHORT).show();
    }*/



}
