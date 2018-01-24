package com.akashdubey.fradmcustomlistviewdemo;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

/**
 * Created by FLAdmin on 1/24/2018.
 */

public class ListFrag extends Fragment {
    int [] images={R.drawable.youtube,R.drawable.blogger,R.drawable.android};
    String[] strTitle={"youtube.com","blogger.com","Android inc"};
    String [] strDesc={"The no 1 Video playback service","The place for artists to share their heart", "86% devices of worls are android based"};
    ImageView pic;
    TextView title,desc;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment,container,false);


        ListView lv=(ListView)view.findViewById(R.id.listLV);

        MyListAdapter myListAdapter=new MyListAdapter();

        lv.setAdapter(myListAdapter);

        return view;
    }



    public class MyListAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return strTitle.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            view=getLayoutInflater().inflate(R.layout.listadapter,null);
            pic=(ImageView)view.findViewById(R.id.picIV);
            title=(TextView)view.findViewById(R.id.titleTV);
            desc=(TextView)view.findViewById(R.id.descTV);

            pic.setImageResource(images[i]);
            title.setText(strTitle[i]);
            desc.setText(strDesc[i]);

            return view;
        }
    }
}
