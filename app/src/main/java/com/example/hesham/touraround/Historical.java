package com.example.hesham.touraround;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Historical extends Fragment {
    public Historical() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);

        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.Egyptmuseum,
                R.string.des_Egyptmuseum, R.drawable.egyptmusium));
        tours.add(new Tour(R.string.Pyramids,
                R.string.des_Pyramids, R.drawable.pyramids));
        tours.add(new Tour(R.string.Vellageofkings,
                R.string.des_Vellageofkings, R.drawable.vellageofkings));
        tours.add(new Tour(R.string.Abosombol,
                R.string.des_AbuSimbeltemples, R.drawable.abosonbol));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.primary_dark_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}