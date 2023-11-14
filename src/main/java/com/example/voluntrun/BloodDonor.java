package com.example.voluntrun;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class BloodDonor extends AppCompatActivity {
    EditText edtname, edtgender, edtyear, edtblood, edtmobile;
    Spinner spinnerdept;
    Button btndone;
    DatabaseReference blooddonorDbRef;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_donor);
        edtname=(EditText)findViewById(R.id.edtname);
        edtyear=(EditText)findViewById(R.id.edtyear);
        edtgender=(EditText)findViewById(R.id.edtgender);
        edtblood=(EditText)findViewById(R.id.edtblood);
        edtmobile=(EditText)findViewById(R.id.edtmobile);
        spinnerdept=findViewById(R.id.spinnerdept);
        btndone=(Button)findViewById(R.id.btndone);

        blooddonorDbRef= FirebaseDatabase.getInstance().getReference().child("BloodDonors");
        btndone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                insertblooddonordata();
            }
        });
    }
    private void insertblooddonordata(){
        String name=edtname.getText().toString();
        String year=edtyear.getText().toString();
        String dept=spinnerdept.getSelectedItem().toString();
        String gender=edtgender.getText().toString();
        String blood=edtblood.getText().toString();
        String mobile=edtmobile.getText().toString();

        BloodDonors bd=new BloodDonors(name,year,dept,gender,blood,mobile);
        blooddonorDbRef.push().setValue(bd);
        Toast.makeText(getApplicationContext(),"Data inserted!" , Toast.LENGTH_LONG).show();


    }
}