package com.st.motionanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 1.水平居中 两个条件  layout_constraintTop 和  layout_constraintBottom
 * 2.垂直居中 两个条件  layout_constraintLeft 和 layout_constraintRight
 * 3.Bias是设置View在父View的偏移程度的，取值为0-1
 *   必须设置4个位置才可以生效，也就是
 *   layout_constraintTop layout_constraintBottom layout_constraintLeft layout_constraintRight
 */
public class BiasActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bias);
    }

    @Override
    public void setTitle() {
        bar.setTitle("Bias定位");
    }
}