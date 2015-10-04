package com.clubafricain.clubafricainadmin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.parse.Parse;

public class AccueilAdmin extends AppCompatActivity {
Button Act,res,cal,eff,pal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accueil_admin);
        Parse.initialize(this, "7AJAbIeLeKDOasdYSgdjFuG8BSYMkGK4hqnWdTW4", "fdjelUa1lfxNF1wMbo1bpr5tXVLHk7rMHNbU9iTQ");
        Act=(Button)findViewById(R.id.act);
        res=(Button)findViewById(R.id.res);
        cal=(Button)findViewById(R.id.cal);
        eff=(Button)findViewById(R.id.eff);
        pal=(Button)findViewById(R.id.pal);

        Act.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Actualite.class));


            }
        });
        res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        eff.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });
        pal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


            }
        });




    }
}
