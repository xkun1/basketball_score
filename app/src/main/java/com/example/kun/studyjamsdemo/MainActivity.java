package com.example.kun.studyjamsdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView mScore_a, mScore_b;  //分数

    private Button add2_a, add3_a, punish_a, add2_b, add3_b, punish_b, reset;

    private int score_a = 0; //A 初始分数
    private int score_b = 0; //B 初始分数

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();//初始化控件

        mScore_a.setText(String.valueOf(score_a));
        mScore_b.setText(String.valueOf(score_b));

    }

    private void init() {
        mScore_a = (TextView) findViewById(R.id.score_a);
        mScore_b = (TextView) findViewById(R.id.score_b);

        add2_a = (Button) findViewById(R.id.add2_a);
        add3_a = (Button) findViewById(R.id.add3_a);
        add2_b = (Button) findViewById(R.id.add2_b);
        add3_b = (Button) findViewById(R.id.add3_b);

        punish_a = (Button) findViewById(R.id.punish_a);
        punish_b = (Button) findViewById(R.id.punish_b);

        reset = (Button) findViewById(R.id.reset);


        add2_a.setOnClickListener(this);
        add2_b.setOnClickListener(this);
        add3_a.setOnClickListener(this);
        add3_b.setOnClickListener(this);
        punish_a.setOnClickListener(this);
        punish_b.setOnClickListener(this);
        reset.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.add2_a:
                score_a = score_a + 2;  // A 加2分
                mScore_a.setText(String.valueOf(score_a));
                break;
            case R.id.add2_b:
                score_b = score_b + 2;  // B 加2分
                mScore_b.setText(String.valueOf(score_b));
                break;
            case R.id.add3_a:
                score_a = score_a + 3;  // A 加3分
                mScore_a.setText(String.valueOf(score_a));
                break;
            case R.id.add3_b:
                score_b = score_b + 3;  // B 加3分
                mScore_b.setText(String.valueOf(score_b));
                break;
            case R.id.punish_a:
                score_a = score_a - 1;  // A 罚球减1分
                mScore_a.setText(String.valueOf(score_a));
                break;
            case R.id.punish_b:
                score_b = score_b - 1;  // B 罚球减1分
                mScore_b.setText(String.valueOf(score_b));
                break;
            case R.id.reset:  //重置 归0
                score_a=0;
                score_b=0;
                mScore_a.setText(String.valueOf(score_a));
                mScore_b.setText(String.valueOf(score_b));
                break;
        }
    }
}
