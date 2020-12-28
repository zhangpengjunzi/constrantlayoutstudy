package com.st.motionanimator;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    private TextView relationTv, gone_tv, bias_tv, circle_tv,pro_tv,util_tv,barrier_tv,group_tv;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        relationTv = findViewById(R.id.relation_tv);
        gone_tv = findViewById(R.id.gone_tv);
        bias_tv = findViewById(R.id.bias_tv);
        circle_tv = findViewById(R.id.circle_tv);
        pro_tv = findViewById(R.id.pro_tv);
        util_tv = findViewById(R.id.util_tv);
        barrier_tv = findViewById(R.id.barrier_tv);
        group_tv = findViewById(R.id.group_tv);
        relationTv.setOnClickListener(this);
        gone_tv.setOnClickListener(this);
        bias_tv.setOnClickListener(this);
        circle_tv.setOnClickListener(this);
        pro_tv.setOnClickListener(this);
        util_tv.setOnClickListener(this);
        barrier_tv.setOnClickListener(this);
        group_tv.setOnClickListener(this);
    }

    @Override
    public void setTitle() {
        bar.setTitle("ConstraintsLayout用法学习");
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.relation_tv:
                startActivity(new Intent(this, RelationActivity.class));
                break;
            case R.id.gone_tv:
                startActivity(new Intent(this, GoneLayoutActivity.class));
                break;
            case R.id.bias_tv:
                startActivity(new Intent(this, BiasActivity.class));
                break;
            case R.id.circle_tv:
                startActivity(new Intent(this, CircleActivity.class));
                break;
            case R.id.pro_tv:
                startActivity(new Intent(this, ProportionActivity.class));
                break;
            case R.id.util_tv:
                startActivity(new Intent(this, LayoutUtilActivity.class));
                break;
            case R.id.barrier_tv:
                startActivity(new Intent(this, BarrierActivity.class));
                break;
            case R.id.group_tv:
                startActivity(new Intent(this, GroupActivity.class));
                break;
        }
    }
}