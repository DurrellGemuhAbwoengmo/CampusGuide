package com.example.campusguide;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);

        TextView account = findViewById(R.id.account);
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
                Intent gotoAccount = new Intent(getApplicationContext(), Account.class);
                startActivity(gotoAccount);
            }
        });


        //goto language page
        TextView language = findViewById(R.id.language);
        language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
                Intent gotoLanguage = new Intent(getApplicationContext(), Language.class);
                startActivity(gotoLanguage);
            }
        });

        //goto contact page
        TextView contact = findViewById(R.id.contact);
        contact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
                Intent gotoContact = new Intent(getApplicationContext(), Contact.class);
                startActivity(gotoContact);
            }
        });

        //goto help
        TextView help_setting = findViewById(R.id.help_setting);
        help_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
                Intent gotoHelp = new Intent(getApplicationContext(), FabHelp.class);
                startActivity(gotoHelp);
            }
        });

        //goto policy
        TextView policy = findViewById(R.id.policy);
        policy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
                Intent gotoPolicy = new Intent(getApplicationContext(), Policy.class);
                startActivity(gotoPolicy);
            }
        });

        //goto policy
        TextView about = findViewById(R.id.about);
        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Toast.makeText(getApplicationContext(), "Message sent, will be in touch", Toast.LENGTH_LONG).show();
                Intent gotoAbout = new Intent(getApplicationContext(), About.class);
                startActivity(gotoAbout);
            }
        });



    }
}