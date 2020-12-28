package com.st.motionanimator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.Group;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

/**
 * Group约束
 * 设置constraint_referenced_ids
 * 如果要设置位置需要给被包含的View设置
 */
public class GroupActivity extends BaseActivity {
    private Group group1,group2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_group);
        group1=findViewById(R.id.group1);
        group2=findViewById(R.id.group2);
    }

    @Override
    public void setTitle() {
        bar.setTitle("Group约束");
    }

    public void onClick(View view) {
        int visi= group1.getVisibility();
        if(visi==View.VISIBLE){
            group1.setVisibility(View.GONE);
            group2.setVisibility(View.VISIBLE);
        }else{
            group1.setVisibility(View.VISIBLE);
            group2.setVisibility(View.GONE);
        }
    }
}