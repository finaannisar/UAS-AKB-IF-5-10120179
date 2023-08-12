package com.finaannisar10120179.uasakbif_510120179;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerFragmentAdapter extends FragmentStateAdapter {

    private String[] titles= new String[]{"About App","Version"};

    public ViewPagerFragmentAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position)
        {
            case 0:
           return new Info1Fragment();
            case 1:
           return new Info2Fragment();
        }
        return new Info1Fragment();
    }

    @Override
    public int getItemCount() {
        return titles.length;
    }
}
