package com.finaannisar10120179.uasakbif_510120179;

//NIM   : 10120179
//Nama  : Fina Annisa Rahmasari
//Kelas : IF-5

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.finaannisar10120179.uasakbif_510120179.adapter.SectionPagerAdapter;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class InfoActivity extends AppCompatActivity {

    ViewPagerFragmentAdapter viewPagerFragmentAdapter;
    TabLayout tabLayout;
    ViewPager viewPager;

    private String[] titles= new String[]{"About App","Version"};

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_info);

            getSupportFragmentManager().beginTransaction()
                    .setReorderingAllowed(true)
                    .replace(R.id.fragmenContainer, InfoFragment.class, null)
                    .commit();

        }
//    View myFragments;
//
//    ViewPager viewPager;
//    TabLayout tabLayout;
//
//
//
////    public InfoActivity() {
////        // Required empty public constructor
////    }
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState){
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_info);
//
//        tabLayout = findViewById(R.id.tabLayout);
//        viewPager = findViewById(R.id.viewPager);
//
//        tabLayout.setupWithViewPager(viewPager);
//
//        SectionPagerAdapter sectionPagerAdapter = new SectionPagerAdapter(getSupportFragmentManager(),
//                FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
//        sectionPagerAdapter.addFragment(new Info1Fragment(),"About");
//        sectionPagerAdapter.addFragment(new Info2Fragment(),"Version");
//
//    }

//    public View onCreateView(LayoutInflater inflater, ViewGroup container,
//                             Bundle savedInstanceState) {
//        // Inflate the layout for this fragment
//        myFragments = inflater.inflate(R.layout.activity_info, container, false);
//
//        viewPager = myFragments.findViewById(R.id.viewPager);
//        tabLayout = myFragments.findViewById(R.id.tabLayout);
//
//        return myFragments;
//    }
//
////    onActivity create method
//
//
//    @Override
//    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//        setUpViewPager(viewPager);
//        tabLayout.setupWithViewPager(viewPager);
//
//        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
//            @Override
//            public void onTabSelected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabUnselected(TabLayout.Tab tab) {
//
//            }
//
//            @Override
//            public void onTabReselected(TabLayout.Tab tab) {
//
//            }
//        });
//    }
//
//    private void setUpViewPager(ViewPager viewPager) {
//        SectionPagerAdapter adapter = new SectionPagerAdapter(getSupportFragmentManager());
//
//        adapter.addFragment(new Info1Fragment(), "About");
//        adapter.addFragment(new Info2Fragment(), "Version");
//
//        viewPager.setAdapter(adapter);
//    }
}