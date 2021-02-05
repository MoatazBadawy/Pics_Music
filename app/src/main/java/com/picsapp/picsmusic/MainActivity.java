package com.picsapp.picsmusic;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // methods to start new fragment
        // make new object and find the view "BottomNavigationView"
        BottomNavigationView navigationView = findViewById(R.id.bottom_navigation);
        // To make the first fragment shows when the app start.
        // We will ignore the "activity_main" and we will make new activity(fragment) called "fragment_home"
        // and we will add all views we want to display them on it.
        // (fragment_layout) it is a fragment have id was defined in "activity_main"
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout,
                new HomeFragment()).commit();
        // make Listener to call the fragments on buttons
        // to start new fragment
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selectedFragment = null;
                switch (item.getItemId()) {
                    // first fragment "home"
                    case R.id.item1:
                        selectedFragment = new HomeFragment();
                        break;
                    // second fragment "videos"
                    case R.id.item2:
                        selectedFragment = new SearchFragment();
                        break;
                    // third fragment "ebadat"
                    case R.id.item4:
                        selectedFragment = new LibraryFragment();
                        break;
                    // fourth fragment "images"
                    case R.id.item5:
                        selectedFragment = new PremiumFragment();
                        break;
                }
                assert selectedFragment != null;
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_layout, selectedFragment).commit();

                return true;
            }

        });
    }

}
