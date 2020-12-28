package com.st.motionanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * 1.链式布局 需要在链条的第1个View上设置 layout_constraintHorizontal_chainStyle 或者 layout_constraintVertical_chainStyle
 *   3种布局方式
 *   1.packed 包裹布局 所有View连接在一起移动,其他为剩余空间，可以通过bias整体移动
 *   2.spread_inside  头和尾都贴紧parent，其他的在中间
 *   3.spread 均分横布局
 *   所有布局可以设置width为0dp,通过layout_constraintHorizontal_weight来控制权重。
 */
public class ChainActivity extends BaseActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chain);
    }

    @Override
    public void setTitle() {
        bar.setTitle("链布局");
    }
}