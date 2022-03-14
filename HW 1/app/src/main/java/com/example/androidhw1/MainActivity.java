package com.example.androidhw1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Quizzes = findViewById(R.id.quizzes) ;
        EditText Homework = findViewById(R.id. hw) ;
        EditText MidTerms = findViewById(R.id.Mid) ;
        EditText Finals = findViewById(R.id.Fin) ;
        Button cal = findViewById(R.id.calculate) ;
        Button clear =findViewById(R.id. clear);
        TextView result = findViewById(R.id.total) ;
        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int quizzes = Integer.parseInt(Quizzes.getText().toString()) ;
                int hw = Integer.parseInt(Homework.getText().toString()) ;
                int Mid = Integer.parseInt(MidTerms.getText().toString()) ;
                int Fin = Integer.parseInt(Finals.getText().toString()) ;
                int total = quizzes + hw + Mid + Fin ;
                result.setText(total + "");
            }
        });

       clear.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Quizzes.setText(null);
               Homework.setText(null);
               MidTerms.setText(null);
               Finals.setText(null);
           }
       });
    }
}