package com.khushi.win10.jsonpassing;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Sony on 08-02-2017.
 */

public class CustomListAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private List<Model>list_mdl;


    public CustomListAdapter(Activity activity, List<Model> md){
        this.activity = activity;
        this.list_mdl =md ;

    }
    @Override
    public int getCount() {
        return list_mdl.size();
    }

    @Override
    public Object getItem(int position) {
        return list_mdl.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(inflater == null)
            inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(convertView == null)
            convertView =inflater.inflate(R.layout.list,null);

        TextView txt1 = (TextView)convertView.findViewById(R.id.txt_userid);
        TextView txt2 = (TextView)convertView.findViewById(R.id.txt_id);
        TextView txt3 = (TextView)convertView.findViewById(R.id.txt_title);
        TextView txt4 = (TextView)convertView.findViewById(R.id.txt_body);


        Model mdl = list_mdl.get(position);
        txt1.setText(String.valueOf(mdl.getUseri()));
        txt2.setText(String.valueOf(mdl.getId()));
        txt3.setText(mdl.getTitle());
        txt4.setText(mdl.getBody());
        return convertView;
    }
}
