package com.example.covid;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.os.Bundle;
import android.widget.Spinner;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class DonorForm extends AppCompatActivity {
    EditText txtname , txtage,txtphone, txtheight ;
    Button  btnsave ;
    Spinner spinnerGenre;
    DatabaseReference reff;
    Member member;
    long maxid = 0 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donor_form);
        txtname = (EditText) findViewById(R.id.txtname );
        txtage=(EditText) findViewById(R.id.txtage );
        txtphone=(EditText) findViewById(R.id.txtphone );
        txtheight=(EditText) findViewById(R.id.txtheight );
       // spinnerGenre = (Spinner) findViewById(R.id.spinnerGenres);
        btnsave= (Button) findViewById(R.id.btnsave);
        member= new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");

        btnsave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                int agea= Integer.parseInt(txtage.getText().toString().trim());
//                Float hit= Float.parseFloat(txtheight.getText().toString().trim());
//                Long phn= Long.parseLong(txtphone.getText().toString().trim());
//                member.setName(txtname.getText().toString().trim());
//                member.setAge(agea);
//                member.setHt(hit);
//                member.setPh(phn);
//                reff.push().setValue(member);
//                Toast.makeText(DonorForm.this,"Inserted Successfully",Toast.LENGTH_LONG).show();




            }

        });





    }
}
