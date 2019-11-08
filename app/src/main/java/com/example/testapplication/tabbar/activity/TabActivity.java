package com.example.testapplication.tabbar.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.testapplication.R;
import com.example.testapplication.tabbar.adapter.TabBarViewPagerAdapter;
import com.example.testapplication.tabbar.fragment.TabOne;
import com.example.testapplication.tabbar.fragment.TabTwo;
import com.example.testapplication.tabbar.fragment.TabThree;
import com.google.android.material.tabs.TabLayout;

public class TabActivity extends AppCompatActivity {

    TabBarViewPagerAdapter tabAdapter;
    //This is our tablayout
    TabLayout tabLayout;
    //This is our viewPager
    ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cooking);

        //Initializing the tablayout
        viewPager = (ViewPager) findViewById(R.id.viewPager);
        tabLayout = (TabLayout) findViewById(R.id.tabLayout);

        //Creating our pager adapter
        tabAdapter = new TabBarViewPagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        tabAdapter.addFragment(new TabOne(), getString(R.string.tab_one));
        tabAdapter.addFragment(new TabTwo(), getString(R.string.tab_two));
        tabAdapter.addFragment(new TabThree(), getString(R.string.tab_three));

        //Adding adapter to pager
        viewPager.setAdapter(tabAdapter);
        tabLayout.setupWithViewPager(viewPager);


        tabLayout.addOnTabSelectedListener(new TabLayout.BaseOnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });


    }


}
