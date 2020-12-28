package com.st.motionanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 圆形定位
 * 1. 3个设置
 * 2. 需要至少2个View才可以
 * 3. constraintCircle 设置圆心View
 *    constraintCircleRadius 设置圆半径
 *    constraintCircleAngle 设置角度，0度从top位置开始
 */
public class CircleActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_circle);
    }

    @Override
    public void setTitle() {
        bar.setTitle("Circle定位");
    }
}