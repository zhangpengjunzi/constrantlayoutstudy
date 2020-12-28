package com.st.motionanimator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * GoneMargin属性是基于自身VIEW来实现效果的，也就是对自身定位时产生关系的其他VIEW
 */
public class GoneLayoutActivity extends BaseActivity implements View.OnClickListener {
    private TextView xs_tv,zp_tv,qc_tv;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gone_layout);
        xs_tv=findViewById(R.id.xs_tv);
        zp_tv=findViewById(R.id.zp_tv);
        qc_tv=findViewById(R.id.qc_tv);
        xs_tv.setOnClickListener(this);
    }

    @Override
    public void setTitle() {
        bar.setTitle("GoneMargin等新属性");
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.xs_tv)
            toggle();
    }

    private void toggle(){
        int visibility=qc_tv.getVisibility()==View.GONE?View.VISIBLE:View.GONE;
        qc_tv.setVisibility(visibility);
    }
}