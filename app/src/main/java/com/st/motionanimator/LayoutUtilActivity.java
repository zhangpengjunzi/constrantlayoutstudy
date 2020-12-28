package com.st.motionanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 工具GuideLine
 * 可设置一条水平线或者垂直线
 * 设置方向 android:orientation
 * layout_constraintGuide_start 可以设置距离上或者左的边距
 * layout_constraintGuide_end 可以设置距离下或者右的边距
 * layout_constraintGuide_percent 可以设置距离上或者左的百分比距离
 * 优先级  percent>start>end
 */
public class LayoutUtilActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_util);
    }

    @Override
    public void setTitle() {
        bar.setTitle("工具约束使用");
    }
}