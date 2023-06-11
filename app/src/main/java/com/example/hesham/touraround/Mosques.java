package com.example.hesham.touraround;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Mosques extends Fragment {
    public Mosques() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.alazhar,
                R.string.des_alazhar, R.drawable.alazhar));
        tours.add(new Tour(R.string.ibntolon,
                R.string.des_ibntolon, R.drawable.ibntoloon));
        tours.add(new Tour(R.string.mohamedali,
                R.string.des_mohamedali, R.drawable.mohamedali));
        tours.add(new Tour(R.string.amrabnalas,
                R.string.des_amrabnalas, R.drawable.amrabnalass));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.primary_dark_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}