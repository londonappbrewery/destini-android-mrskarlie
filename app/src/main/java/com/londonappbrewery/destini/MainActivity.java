package com.londonappbrewery.destini;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    private TextView user_Story;
    private Button answer_top_btn;
    private Button answer_bottom_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        user_Story = (TextView) findViewById(R.id.storyTextView);
        answer_top_btn = (Button) findViewById(R.id.buttonTop);
        answer_bottom_btn = (Button) findViewById(R.id.buttonBottom);



        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:

        answer_top_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Loop1();
            }
        });


        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:

        answer_bottom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_Story.setText(R.string.T2_Story);
                answer_top_btn.setText(R.string.T2_Ans1);
                answer_bottom_btn.setText(R.string.T2_Ans2);
                answer_top_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Loop1();
                    }
                });
                answer_bottom_btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        user_Story.setText(R.string.T4_End);
                        answer_top_btn.setVisibility(View.INVISIBLE);
                        answer_bottom_btn.setVisibility(View.INVISIBLE);
                    }
                });


            }
        });


    }
    private void Loop1(){
        user_Story.setText(R.string.T3_Story);
        answer_top_btn.setText(R.string.T3_Ans1);
        answer_bottom_btn.setText(R.string.T3_Ans2);
        answer_top_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_Story.setText(R.string.T6_End);
                answer_top_btn.setVisibility(View.INVISIBLE);
                answer_bottom_btn.setVisibility(View.INVISIBLE);
            }
        });
        answer_bottom_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                user_Story.setText(R.string.T5_End);
                answer_top_btn.setVisibility(View.INVISIBLE);
                answer_bottom_btn.setVisibility(View.INVISIBLE);
            }
        });

    }
}
