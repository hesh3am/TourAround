package com.example.hesham.touraround;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class Restorant extends Fragment {
    public Restorant() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.abouelsid,
                R.string.des_abouelsid, R.drawable.abalseed));
        tours.add(new Tour(R.string.alakeel,
                R.string.des_alakeel, R.drawable.alakeel));
        tours.add(new Tour(R.string.alsraya,
                R.string.des_alsraya, R.drawable.alsraya));
        tours.add(new Tour(R.string.balbaa,
                R.string.des_balbaa, R.drawable.balbaa));


        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.primary_dark_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}