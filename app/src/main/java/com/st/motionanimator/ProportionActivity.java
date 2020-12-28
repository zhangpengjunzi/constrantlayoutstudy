package com.st.motionanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;

/**
 * 比例约束
 * 1.当将View定位后，0dp会扩充所有可用空间，打到match_parent的效果，wrap_content空间只能由文本撑起来
 * 2.当width和height为wrap_content时，很多约束不会生效，需要设置layout_constraintWidth=true  layout_constraintHeight=true 才可以生效
 * 3.设置百分比布局
 *   设置width为0dp,设置layout_constraintWidth_default="percent" layout_constraintWidth_percent=0~1
 *   设置height为0dp,设置layout_constraintHeight_default="percent" layout_constraintHeight_percent=0~1
 *   设置width为wrap_content 需要额外设置layout_constraintWidth=true
 *   设置height为wrap_content 需要额外设置layout_constraintHeight=true
 * 4.宽高比约束
 *   设置layout_constraintDimensionRatio来设置
 */
public class ProportionActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proportion);
    }

    @Override
    public void setTitle() {
        bar.setTitle("比例约束布局");
    }
}