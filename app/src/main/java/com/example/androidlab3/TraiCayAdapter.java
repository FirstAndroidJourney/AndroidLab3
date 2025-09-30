package com.example.androidlab3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class TraiCayAdapter extends BaseAdapter {
    private final Context context;
    private final int layout;
    private final List<TraiCay> traiCayList;

    public TraiCayAdapter(Context context, int layout, List<TraiCay> traiCayList) {
        this.context = context;
        this.layout = layout;
        this.traiCayList = traiCayList;
    }

    @Override public int getCount() { return traiCayList.size(); }
    @Override public Object getItem(int i) { return traiCayList.get(i); }
    @Override public long getItemId(int i) { return i; }

    static class ViewHolder {
        ImageView imgHinh;
        TextView tvTen, tvMota;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder h;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(layout, parent, false);
            h = new ViewHolder();
            h.imgHinh = convertView.findViewById(R.id.imageviewHinh);
            h.tvTen   = convertView.findViewById(R.id.textviewTen);
            h.tvMota  = convertView.findViewById(R.id.textviewMota);
            convertView.setTag(h);
        } else {
            h = (ViewHolder) convertView.getTag();
        }

        TraiCay tc = traiCayList.get(position);
        h.tvTen.setText(tc.getTen());
        h.tvMota.setText(tc.getMota());
        h.imgHinh.setImageResource(tc.getHinh());
        return convertView;
    }
}
