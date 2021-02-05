package com.picsapp.picsmusic;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class PremiumFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_premium, container, false);
    }

    // display message for the user
    public void Tosta (View view) {
        Toast.makeText(getActivity() , "There is no need to subscribing because you are a tester :D" , Toast.LENGTH_LONG).show();
    }
}