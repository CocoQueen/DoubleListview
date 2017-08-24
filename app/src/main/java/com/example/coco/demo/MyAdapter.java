package com.example.coco.demo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by coco on 2017/8/23.
 */

public class MyAdapter extends BaseAdapter {
    private Context ctx;
    private List<String> list;

    public MyAdapter(Context ctx, List<String> list) {
        this.ctx = ctx;
        this.list = list;
    }

    @Override
    public int getCount() {
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder2 vh2 = null;
        if (convertView == null) {
            vh2 = new ViewHolder2();
            convertView = View.inflate(ctx, R.layout.item2, null);
            vh2.mTv1 = (TextView) convertView.findViewById(R.id.mTv1);
            vh2.mTv2 = (TextView) convertView.findViewById(R.id.mTv2);
            vh2.mTv3 = (TextView) convertView.findViewById(R.id.mTv3);
            convertView.setTag(vh2);
        } else {
            vh2 = (ViewHolder2) convertView.getTag();
        }
        vh2.mTv1.setText(list.get(position));
        vh2.mTv2.setText("标题"+list.get(position));
        vh2.mTv3.setText("访问量"+list.get(position));
        return convertView;
    }
    private class ViewHolder2 {
        private TextView mTv1, mTv2, mTv3;
    }
}
