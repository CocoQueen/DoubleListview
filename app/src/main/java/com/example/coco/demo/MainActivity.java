package com.example.coco.demo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView mLv_left,mLv_right;
    private MyAdapter adapter2;
    private List<String> list = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initDate();
        initView();
    }

    private void initView() {
        mLv_left = (ListView) findViewById(R.id.mLv_left);
        mLv_right = (ListView) findViewById(R.id.mLv_right);
        adapter2 = new MyAdapter(this, list);
        mLv_left.setAdapter(adapter2);
        mLv_right.setAdapter(adapter2);
    }

    private void initDate() {
        for (int i = 1; i <=50; i++) {
            list.add(i+"");
        }

    }
}
