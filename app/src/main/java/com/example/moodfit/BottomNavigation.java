package com.example.moodfit;

import androidx.appcompat.app.AppCompatActivity;
import android.view.MenuItem;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.moodfit.fragments.CommunityFragment;
import com.example.moodfit.fragments.HomeFragment;
import com.example.moodfit.fragments.MyProfileFragment;
import com.example.moodfit.fragments.ToolFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class BottomNavigation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        showFragment(new HomeFragment());
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.nav_home:
                        showFragment(new HomeFragment());
                        break;
                    case R.id.nav_favorites:
                        showFragment(new ToolFragment());
                        break;
                    case R.id.nav_search:
                        showFragment(new CommunityFragment());
                        break;
                    case R.id.nav_profile:
                        showFragment(new MyProfileFragment());
                        break;
                }
                return true;
            }
        });
    }
    private void showFragment(Fragment fragment) {
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragment_container, fragment)
                .commit();
    }
}