package com.example.voluntrun;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class DisplayBloodService extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_blood_service);
       // Bundle bundle = getIntent().getExtras();
        //if(bundle!=null){
          //  String bloodgroup = bundle.getString("BloodGroup");
            //String bloodgroup1 = bundle.getString("Location");
            //String bloodgroup2 = bundle.getString("Quantity");
            //TextView tvbloodgroup = findViewById(R.id.tvbloodgroup);
            //TextView tvbloodgroup1 = findViewById(R.id.tvbloodgroup1);
            //TextView tvbloodgroup2 = findViewById(R.id.tvbloodgroup2);
            //tvbloodgroup.setText(bloodgroup);
            //tvbloodgroup1.setText(bloodgroup1);
            //tvbloodgroup2.setText(bloodgroup2);
        String bloodgroup=getIntent().getStringExtra("bloodgroup");
        String bloodlocation=getIntent().getStringExtra("bloodlocation");
        String bloodquantity=getIntent().getStringExtra("bloodquantity");
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText et1=(EditText)findViewById(R.id.displaygroup);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText et2=(EditText)findViewById(R.id.displayblocation);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"})
        EditText et3=(EditText)findViewById(R.id.displaybquantity);
        et1.setText(bloodgroup);
        et2.setText(bloodlocation);
        et3.setText(bloodquantity);
        }
    }

