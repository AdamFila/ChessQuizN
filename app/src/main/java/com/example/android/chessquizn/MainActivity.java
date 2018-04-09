package com.example.android.chessquizn;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int positive = 0;
    private boolean[] checked = new boolean [9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        for(int i=0; i<9; i++){
            checked[i] = false;
        }

        setContentView(R.layout.activity_main);
    }

    public void submit(View view) {
        RadioButton answer1_3RadioButton = (RadioButton) findViewById(R.id.answer_1_3_RadioButton);
        RadioButton answer2_4RadioButton = (RadioButton) findViewById(R.id.answer_2_4_RadioButton);
        RadioButton answer3_2RadioButton = (RadioButton) findViewById(R.id.answer_3_2_RadioButton);
        RadioButton answer4_4RadioButton = (RadioButton) findViewById(R.id.answer_4_4_RadioButton);
        RadioButton answer5_1RadioButton = (RadioButton) findViewById(R.id.answer_5_1_RadioButton);
        RadioButton answer6_1RadioButton = (RadioButton) findViewById(R.id.answer_6_1_RadioButton);
        RadioButton answer7_2RadioButton = (RadioButton) findViewById(R.id.answer_7_2_RadioButton);

        CheckBox answer8_1CheckBox = (CheckBox) findViewById(R.id.answer_8_1_CheckBox);
        CheckBox answer8_2CheckBox = (CheckBox) findViewById(R.id.answer_8_2_CheckBox);
        CheckBox answer8_3CheckBox = (CheckBox) findViewById(R.id.answer_8_3_CheckBox);
        CheckBox answer8_4CheckBox = (CheckBox) findViewById(R.id.answer_8_4_CheckBox);

        EditText solutionEditText = (EditText) findViewById(R.id.answer_0_EditText);


        if((answer1_3RadioButton.isChecked()) && (!checked[0])) positive++; checked[0] = true;
        if((answer2_4RadioButton.isChecked()) && (!checked[1])) positive++; checked[1] = true;
        if((answer3_2RadioButton.isChecked()) && (!checked[2])) positive++; checked[2] = true;
        if((answer4_4RadioButton.isChecked()) && (!checked[3])) positive++; checked[3] = true;
        if((answer5_1RadioButton.isChecked()) && (!checked[4])) positive++; checked[4] = true;
        if((answer6_1RadioButton.isChecked()) && (!checked[5])) positive++; checked[5] = true;
        if((answer7_2RadioButton.isChecked()) && (!checked[6])) positive++; checked[6] = true;

        if((solutionEditText.getText().toString().equals("64")) && (!checked[7])) positive++; checked[7] = true;

        if((answer8_1CheckBox.isChecked()) || (answer8_4CheckBox.isChecked())){
        } else if((answer8_2CheckBox.isChecked()) && (answer8_3CheckBox.isChecked()) && (!checked[8])) positive++; checked[8] = true;

        Context context = getApplicationContext();
        CharSequence text = positive+"/9";
        int duration = Toast.LENGTH_SHORT;

        setPoints(String.valueOf(positive));
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }

    public void reset(View view) {
        RadioButton answer1_1RadioButton = (RadioButton) findViewById(R.id.answer_1_1_RadioButton);
        RadioButton answer1_2RadioButton = (RadioButton) findViewById(R.id.answer_1_2_RadioButton);
        RadioButton answer1_3RadioButton = (RadioButton) findViewById(R.id.answer_1_3_RadioButton);
        RadioButton answer1_4RadioButton = (RadioButton) findViewById(R.id.answer_1_4_RadioButton);
        RadioButton answer2_1RadioButton = (RadioButton) findViewById(R.id.answer_2_1_RadioButton);
        RadioButton answer2_2RadioButton = (RadioButton) findViewById(R.id.answer_2_2_RadioButton);
        RadioButton answer2_3RadioButton = (RadioButton) findViewById(R.id.answer_2_3_RadioButton);
        RadioButton answer2_4RadioButton = (RadioButton) findViewById(R.id.answer_2_4_RadioButton);
        RadioButton answer3_1RadioButton = (RadioButton) findViewById(R.id.answer_3_1_RadioButton);
        RadioButton answer3_2RadioButton = (RadioButton) findViewById(R.id.answer_3_2_RadioButton);
        RadioButton answer3_3RadioButton = (RadioButton) findViewById(R.id.answer_3_3_RadioButton);
        RadioButton answer3_4RadioButton = (RadioButton) findViewById(R.id.answer_3_4_RadioButton);
        RadioButton answer4_1RadioButton = (RadioButton) findViewById(R.id.answer_4_1_RadioButton);
        RadioButton answer4_2RadioButton = (RadioButton) findViewById(R.id.answer_4_2_RadioButton);
        RadioButton answer4_3RadioButton = (RadioButton) findViewById(R.id.answer_4_3_RadioButton);
        RadioButton answer4_4RadioButton = (RadioButton) findViewById(R.id.answer_4_4_RadioButton);
        RadioButton answer5_1RadioButton = (RadioButton) findViewById(R.id.answer_5_1_RadioButton);
        RadioButton answer5_2RadioButton = (RadioButton) findViewById(R.id.answer_5_2_RadioButton);
        RadioButton answer5_3RadioButton = (RadioButton) findViewById(R.id.answer_5_3_RadioButton);
        RadioButton answer5_4RadioButton = (RadioButton) findViewById(R.id.answer_5_4_RadioButton);
        RadioButton answer6_1RadioButton = (RadioButton) findViewById(R.id.answer_6_1_RadioButton);
        RadioButton answer6_2RadioButton = (RadioButton) findViewById(R.id.answer_6_2_RadioButton);
        RadioButton answer6_3RadioButton = (RadioButton) findViewById(R.id.answer_6_3_RadioButton);
        RadioButton answer6_4RadioButton = (RadioButton) findViewById(R.id.answer_6_4_RadioButton);
        RadioButton answer7_1RadioButton = (RadioButton) findViewById(R.id.answer_7_1_RadioButton);
        RadioButton answer7_2RadioButton = (RadioButton) findViewById(R.id.answer_7_2_RadioButton);
        RadioButton answer7_3RadioButton = (RadioButton) findViewById(R.id.answer_7_3_RadioButton);
        RadioButton answer7_4RadioButton = (RadioButton) findViewById(R.id.answer_7_4_RadioButton);

        CheckBox answer8_1CheckBox = (CheckBox) findViewById(R.id.answer_8_1_CheckBox);
        CheckBox answer8_2CheckBox = (CheckBox) findViewById(R.id.answer_8_2_CheckBox);
        CheckBox answer8_3CheckBox = (CheckBox) findViewById(R.id.answer_8_3_CheckBox);
        CheckBox answer8_4CheckBox = (CheckBox) findViewById(R.id.answer_8_4_CheckBox);


        answer1_1RadioButton.setChecked(false);
        answer1_2RadioButton.setChecked(false);
        answer1_3RadioButton.setChecked(false);
        answer1_4RadioButton.setChecked(false);
        answer2_1RadioButton.setChecked(false);
        answer2_2RadioButton.setChecked(false);
        answer2_3RadioButton.setChecked(false);
        answer2_4RadioButton.setChecked(false);
        answer3_1RadioButton.setChecked(false);
        answer3_2RadioButton.setChecked(false);
        answer3_3RadioButton.setChecked(false);
        answer3_4RadioButton.setChecked(false);
        answer4_1RadioButton.setChecked(false);
        answer4_2RadioButton.setChecked(false);
        answer4_3RadioButton.setChecked(false);
        answer4_4RadioButton.setChecked(false);
        answer5_1RadioButton.setChecked(false);
        answer5_2RadioButton.setChecked(false);
        answer5_3RadioButton.setChecked(false);
        answer5_4RadioButton.setChecked(false);
        answer6_1RadioButton.setChecked(false);
        answer6_2RadioButton.setChecked(false);
        answer6_3RadioButton.setChecked(false);
        answer6_4RadioButton.setChecked(false);
        answer7_1RadioButton.setChecked(false);
        answer7_2RadioButton.setChecked(false);
        answer7_3RadioButton.setChecked(false);
        answer7_4RadioButton.setChecked(false);

        answer8_1CheckBox.setChecked(false);
        answer8_2CheckBox.setChecked(false);
        answer8_3CheckBox.setChecked(false);
        answer8_4CheckBox.setChecked(false);

        setSolution0Text("Type number");


        positive = 0;
        setPoints(String.valueOf(positive));

        for(int i=0; i<9; i++){
            checked[i] = false;
        }
    }


    private void setPoints(String variable) {
        TextView pointsTextView = (TextView) findViewById(R.id.points_text_view);
        pointsTextView.setText("" + variable);
    }

    private void setSolution0Text(String variable) {
        EditText solutionEditText = (EditText) findViewById(R.id.answer_0_EditText);
        solutionEditText.setText("" + variable);
    }

    //Solutions
    public void solution_0(View view) {
        setSolution0Text("64");
    }

    public void solution_1(View view) {
        RadioButton answer1_1RadioButton = (RadioButton) findViewById(R.id.answer_1_1_RadioButton);
        RadioButton answer1_2RadioButton = (RadioButton) findViewById(R.id.answer_1_2_RadioButton);
        RadioButton answer1_3RadioButton = (RadioButton) findViewById(R.id.answer_1_3_RadioButton);
        RadioButton answer1_4RadioButton = (RadioButton) findViewById(R.id.answer_1_4_RadioButton);

        answer1_1RadioButton.setChecked(false);
        answer1_2RadioButton.setChecked(false);
        answer1_3RadioButton.setChecked(true);
        answer1_4RadioButton.setChecked(false);
    }

    public void solution_2(View view) {
        RadioButton answer2_1RadioButton = (RadioButton) findViewById(R.id.answer_2_1_RadioButton);
        RadioButton answer2_2RadioButton = (RadioButton) findViewById(R.id.answer_2_2_RadioButton);
        RadioButton answer2_3RadioButton = (RadioButton) findViewById(R.id.answer_2_3_RadioButton);
        RadioButton answer2_4RadioButton = (RadioButton) findViewById(R.id.answer_2_4_RadioButton);

        answer2_1RadioButton.setChecked(false);
        answer2_2RadioButton.setChecked(false);
        answer2_3RadioButton.setChecked(false);
        answer2_4RadioButton.setChecked(true);
    }

    public void solution_3(View view) {
        RadioButton answer3_1RadioButton = (RadioButton) findViewById(R.id.answer_3_1_RadioButton);
        RadioButton answer3_2RadioButton = (RadioButton) findViewById(R.id.answer_3_2_RadioButton);
        RadioButton answer3_3RadioButton = (RadioButton) findViewById(R.id.answer_3_3_RadioButton);
        RadioButton answer3_4RadioButton = (RadioButton) findViewById(R.id.answer_3_4_RadioButton);

        answer3_1RadioButton.setChecked(false);
        answer3_2RadioButton.setChecked(true);
        answer3_3RadioButton.setChecked(false);
        answer3_4RadioButton.setChecked(false);
    }

    public void solution_4(View view) {
        RadioButton answer4_1RadioButton = (RadioButton) findViewById(R.id.answer_4_1_RadioButton);
        RadioButton answer4_2RadioButton = (RadioButton) findViewById(R.id.answer_4_2_RadioButton);
        RadioButton answer4_3RadioButton = (RadioButton) findViewById(R.id.answer_4_3_RadioButton);
        RadioButton answer4_4RadioButton = (RadioButton) findViewById(R.id.answer_4_4_RadioButton);

        answer4_1RadioButton.setChecked(false);
        answer4_2RadioButton.setChecked(false);
        answer4_3RadioButton.setChecked(false);
        answer4_4RadioButton.setChecked(true);
    }

    public void solution_5(View view) {
        RadioButton answer5_1RadioButton = (RadioButton) findViewById(R.id.answer_5_1_RadioButton);
        RadioButton answer5_2RadioButton = (RadioButton) findViewById(R.id.answer_5_2_RadioButton);
        RadioButton answer5_3RadioButton = (RadioButton) findViewById(R.id.answer_5_3_RadioButton);
        RadioButton answer5_4RadioButton = (RadioButton) findViewById(R.id.answer_5_4_RadioButton);

        answer5_1RadioButton.setChecked(true);
        answer5_2RadioButton.setChecked(false);
        answer5_3RadioButton.setChecked(false);
        answer5_4RadioButton.setChecked(false);
    }

    public void solution_6(View view) {
        RadioButton answer6_1RadioButton = (RadioButton) findViewById(R.id.answer_6_1_RadioButton);
        RadioButton answer6_2RadioButton = (RadioButton) findViewById(R.id.answer_6_2_RadioButton);
        RadioButton answer6_3RadioButton = (RadioButton) findViewById(R.id.answer_6_3_RadioButton);
        RadioButton answer6_4RadioButton = (RadioButton) findViewById(R.id.answer_6_4_RadioButton);

        answer6_1RadioButton.setChecked(true);
        answer6_2RadioButton.setChecked(false);
        answer6_3RadioButton.setChecked(false);
        answer6_4RadioButton.setChecked(false);
    }

    public void solution_7(View view) {
        RadioButton answer7_1RadioButton = (RadioButton) findViewById(R.id.answer_7_1_RadioButton);
        RadioButton answer7_2RadioButton = (RadioButton) findViewById(R.id.answer_7_2_RadioButton);
        RadioButton answer7_3RadioButton = (RadioButton) findViewById(R.id.answer_7_3_RadioButton);
        RadioButton answer7_4RadioButton = (RadioButton) findViewById(R.id.answer_7_4_RadioButton);

        answer7_1RadioButton.setChecked(false);
        answer7_2RadioButton.setChecked(true);
        answer7_3RadioButton.setChecked(false);
        answer7_4RadioButton.setChecked(false);
    }

    public void solution_8(View view) {
       CheckBox answer8_1CheckBox = (CheckBox) findViewById(R.id.answer_8_1_CheckBox);
       CheckBox answer8_2CheckBox = (CheckBox) findViewById(R.id.answer_8_2_CheckBox);
       CheckBox answer8_3CheckBox = (CheckBox) findViewById(R.id.answer_8_3_CheckBox);
       CheckBox answer8_4CheckBox = (CheckBox) findViewById(R.id.answer_8_4_CheckBox);

        answer8_1CheckBox.setChecked(false);
        answer8_2CheckBox.setChecked(true);
        answer8_3CheckBox.setChecked(true);
        answer8_4CheckBox.setChecked(false);
    }
}
