package com.example.varadhi.trans;

import android.app.Dialog;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager pager =  findViewById(R.id.content);
        pager.setAdapter(new MyPagerAdapter(getSupportFragmentManager()));
        getSupportFragmentManager().beginTransaction().add(R.id.content,new Newaddvehicle()).commit();

    }


    private class MyPagerAdapter extends FragmentPagerAdapter {

        public MyPagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int pos) {

            switch(pos) {

                case 0: return Newaddvehicle.newInstance("Addvehicle, Instance 1");
                case 1: return Transportbarriers.newInstance("Transportbarriers, Instance 1");
                case 2: return Createroute.newInstance("Addvehicle, Instance 1");
                case 3: return Row.newInstance("Addvehicle, Instance 1");


                default: return Newaddvehicle.newInstance("Addvehicle, Instance 1");
            }
        }

        @Override
        public int getCount() {
            return 4;
        }
    }
}
