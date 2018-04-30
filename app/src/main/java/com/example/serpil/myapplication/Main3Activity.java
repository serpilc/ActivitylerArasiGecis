package com.example.serpil.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    String uname,upass,umail,gender;
    TextView tusernem,tpassword,tmail,tgender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        tanımla();
        al();
    }
    public void al(){
        Bundle intent=getIntent().getExtras();
        uname=intent.getString("uname");
        upass=intent.getString("upass");
        umail=intent.getString("umail");
        gender=intent.getString("gender");
        Log.i("Result2", uname+ " "+upass+ " " +umail+ " " +gender);


        tusernem.setText(tusernem.getText()+ " " +uname);
        tpassword.setText(tpassword.getText()+" "+upass);
        tmail.setText(tmail.getText()+" "+umail);
        tgender.setText(tgender.getText()+ " " + gender);

    }

    public void tanımla(){
        tusernem=(TextView)findViewById(R.id.txtuname);
        tpassword=(TextView)findViewById(R.id.txtupass);
        tmail=(TextView)findViewById(R.id.txtumail);
        tgender=(TextView)findViewById(R.id.txtgender);
    }
}
