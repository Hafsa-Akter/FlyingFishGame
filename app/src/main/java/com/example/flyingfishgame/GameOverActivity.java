package com.example.flyingfishgame;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOverActivity extends AppCompatActivity {
    private Button playAgain;
    private TextView displayScore;
    private  String score;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        score=getIntent().getExtras().get("score").toString();

        playAgain=(Button) findViewById(R.id.play_again_btn);
        displayScore=(TextView) findViewById(R.id.displayScoreId);

        playAgain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(GameOverActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });


        displayScore.setText("Score : "+score);
    }
}
