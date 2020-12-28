package com.st.motionanimator;

import android.os.Bundle;

import androidx.annotation.Nullable;

/**
 * 1.对于其他View来说，位置的设置就是左边框在某个View的右边框处
 * 2.对于parent来说，位置的设置就是左边框贴住Parent左边框的位置
 * 3.可以产生像FrameLayout一样的View覆盖效果
 * 4.通过constraintBaseline_toBaselineOf可以让两个View的文本对齐
 * 5.以前常用的layout_marginLeft等属性在View位置没被确定时不会生效，包括BaseLine一样不会生效
 */
public class RelationActivity extends BaseActivity {

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_relation);
    }

    @Override
    public void setTitle() {
        bar.setTitle("相对定位");
    }



}
