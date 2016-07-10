package com.yuzhiyun.chemistry.view.activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.yuzhiyun.chemistry.R;
import com.yuzhiyun.chemistry.view.base.BaseActivity;

public class MainActivity extends BaseActivity implements View.OnClickListener{

    Button btnExam;
    Button btnAbout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected void setLayoutView() {
        setContentView(R.layout.activity_main);
    }

    @Override
    protected void findView() {
        btnExam= (Button) findViewById(R.id.btnExam);
        btnAbout= (Button) findViewById(R.id.btnAbout);

    }

    @Override
    protected void setListener() {
        btnExam.setOnClickListener(this);
        btnAbout.setOnClickListener(this);
    }

    @Override
    protected void initOther() {
        toolbar.setTitle("习题宝典");
//        toolbar.setLogo(R.drawable.icon);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnExam:
                startActivity(new Intent(context,ExamActivity.class));
                break;
            case R.id.btnAbout:
                startActivity(new Intent(context,OutlineActivity.class));
                break;
        }

    }
}
