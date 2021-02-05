package com.picsapp.picsmusic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class LibraryFragment extends Fragment {

    View view;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_library, container, false);
        // Create an ArrayList of songListDetail objects
        ArrayList<SongListDetail> songListDetails = new ArrayList<SongListDetail>();
        songListDetails.add(new SongListDetail("Muhammad (Pbuh) Waheshna", "Maher Zain", R.drawable.muhammad, R.drawable.list));
        songListDetails.add(new SongListDetail("Medina", "Maher Zain", R.drawable.medina, R.drawable.list));
        songListDetails.add(new SongListDetail("Hasbi Rabbi", "Sami Yusuf", R.drawable.hasbi, R.drawable.list));
        songListDetails.add(new SongListDetail("Ya Nabi Salam Alayka", "Maher Zain", R.drawable.ya, R.drawable.list));
        songListDetails.add(new SongListDetail("Qamarun Sidnan Nabi", "Mustafa Atef", R.drawable.qamarun, R.drawable.list));
        songListDetails.add(new SongListDetail("Ramadan", "Maher Zain ", R.drawable.ramadan, R.drawable.list));
        songListDetails.add(new SongListDetail("Kun Anta", "Humood Alkhudher", R.drawable.kun, R.drawable.list));
        songListDetails.add(new SongListDetail("khawater songs", "Ahmed Shuqairi", R.drawable.kwater, R.drawable.list));
        songListDetails.add(new SongListDetail("Insan", "Hamza Namira", R.drawable.insan, R.drawable.list));
        songListDetails.add(new SongListDetail("Qiyam", "Humood Alkhudher", R.drawable.qiyam, R.drawable.list));

        /**
         * Create an {@link songListDetails}, whose data source is a list of
         * {@link songListDetails}s. The adapter knows how to create list item views for each item in the list.
         */
        SongListDetailAdapter flavorAdapter = new SongListDetailAdapter(getActivity(), songListDetails);

        // Get a reference to the ListView, and attach the adapter to the listView.
        ListView listView = view.findViewById(R.id.listview_songs2);
        listView.setAdapter(flavorAdapter);

        // Inflate the layout for this fragment
        return view;
    }
}