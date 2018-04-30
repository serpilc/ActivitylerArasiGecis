package com.example.serpil.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    EditText username, password, mail;
    RadioGroup rdg;
    Button button1;
    String uname, upass, umail, gender;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tanımla();
        tıklagec();

    }


    public void tanımla() {
        username = (EditText)findViewById(R.id.usernameedit);
        password = (EditText)findViewById(R.id.passwordedit);
        mail = (EditText)findViewById(R.id.mailedit);
        rdg = (RadioGroup)findViewById(R.id.rdgedit);
        button1 = (Button)findViewById(R.id.button);
    }

    public void degerAl() {
        uname = username.getText().toString();
        upass = password.getText().toString();
        umail = mail.getText().toString();
        gender = ((RadioButton) findViewById(rdg.getCheckedRadioButtonId())).getText().toString();
    }

    public void tıklagec() {
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                degerAl();
                Log.i("Result"," "+uname+" "+upass+" " +umail+ " "+gender);
                Intent intent= new Intent(getApplicationContext(), Main3Activity.class);
                intent.putExtra("uname", uname);
                intent.putExtra("upass", upass);
                intent.putExtra("umail",umail);
                intent.putExtra("gender",gender);
                startActivity(intent);
            }
        });
    }
}
