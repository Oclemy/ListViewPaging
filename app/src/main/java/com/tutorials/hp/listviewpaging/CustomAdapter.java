package com.tutorials.hp.listviewpaging;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Oclemy on 2017 for ProgrammingWizards TV Channel and http://www.camposha.info.
 - Our custom adapter class.
 - Derives from android.widget.BaseAdapter.
 - Responsible for layout inflation as well as data binding to inflated views.
 */
public class CustomAdapter extends BaseAdapter {

    Context c;
    ArrayList<Galaxy> galaxies;

    public CustomAdapter(Context c, ArrayList<Galaxy> galaxies) {
        this.c = c;
        this.galaxies = galaxies;
    }

    @Override
    public int getCount() {
        return galaxies.size();
    }

    @Override
    public Object getItem(int i) {
        return galaxies.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null)
        {
            view= LayoutInflater.from(c).inflate(R.layout.model,viewGroup,false);
        }
        //reference widgets
        TextView nameTxt=view.findViewById(R.id.nameTxt);
        TextView descTxt=view.findViewById(R.id.descTxt);
        TextView categoryTxt=view.findViewById(R.id.categoryTxt);
        ImageView galaxyImg=view.findViewById(R.id.galaxyImageview);

        //bind data to widgets
        Galaxy g= (Galaxy) getItem(i);
        nameTxt.setText(g.getName());
        descTxt.setText(g.getDescription());
        categoryTxt.setText(g.getCategory());
        galaxyImg.setImageResource(g.getImage());

        return view;
    }
}
