package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.myapplication1.R.layout.activity_myaplication21;

public class Myaplication21 extends AppCompatActivity {
    EditText editText;
   String  userAnswer;
   String adminAnswer = "Winter";
    private Object MainActivity2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_myaplication21);
        intViews();
        intAtion();
        checkAnswer();
        Button forward = (Button) findViewById(R.id.answer_btn);

    }
   
    private void intAtion(){

        userAnswer = editText.getText().toString();

    }
    private void intViews(){
        editText = findViewById(R.id.answer_ed);

    }
    private void checkAnswer(){
        

        if(userAnswer==adminAnswer){
            Toast.makeText(this, "Правильно", Toast.LENGTH_SHORT).show();
           
        }else {
            Toast.makeText(this, "Не правильно", Toast.LENGTH_SHORT).show();
        }
    }

    public void goNewView(View mainActivity2) {
       ;
        switch (mainActivity2.getId()) {
            case R.id.answer_btn:
                Intent intent = new Intent(this, MainActivity2.class);
                intent.putExtra("name", userAnswer.toString());
                startActivity(intent);
                break;
            default:
                break;
        }
    }
}