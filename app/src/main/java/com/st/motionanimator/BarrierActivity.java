package com.st.motionanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 创造1个结界，把需要的View包裹进来
 * 两个重要的属性
 * 1.barrierDirection 设置对齐方向
 * 2.constraint_referenced_ids 设置包裹View  List
 */
public class BarrierActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barrier);
    }

    @Override
    public void setTitle() {
        bar.setTitle("栅栏约束");
    }


}