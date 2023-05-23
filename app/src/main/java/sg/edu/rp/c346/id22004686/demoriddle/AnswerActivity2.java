package sg.edu.rp.c346.id22004686.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {
    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);

        tvAnswer = findViewById(R.id.textView);
        //tvAnswer.setText("In Second Activity");
        Intent intent = getIntent();
        String questions = intent.getStringExtra("Question");
        tvAnswer.setText(questions+" answer is: Gone");
    }
}