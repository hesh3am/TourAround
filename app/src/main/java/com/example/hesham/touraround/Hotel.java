package com.example.hesham.touraround;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class Hotel extends Fragment {
    public Hotel() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.tour_list, container, false);


        final ArrayList<Tour> tours = new ArrayList<Tour>();
        tours.add(new Tour(R.string.FairmontNile,
                R.string.des_Firmont, R.drawable.aaaaa));
        tours.add(new Tour(R.string.Foursesons,
                R.string.des_Fourseason, R.drawable.bbbb));
        tours.add(new Tour(R.string.RamsesHilton,
                R.string.des_Ramseshilton, R.drawable.cccc));
        tours.add(new Tour(R.string.NileRitzCarlton,
                R.string.des_Nileritzcarlton, R.drawable.dddd));

        TourAdapter adapter = new TourAdapter(getActivity(), tours, R.color.primary_dark_color);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        return rootView;
    }
}