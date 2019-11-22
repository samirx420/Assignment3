package com.samir.app5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;
import com.samir.app5.adapter.ViewPagerAdapter;
import com.samir.app5.fragments.LoginFragment;
import com.samir.app5.fragments.RegistrationFragment;


public class LoginViewPagerActivity extends AppCompatActivity {
    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_view_pager);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabId);

//        tabLayout.setSelectedTabIndicator(Color.parseColor("#FFFFFF"));
        ViewPagerAdapter viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());
        viewPagerAdapter.addFragment(new LoginFragment(), "Login");
        viewPagerAdapter.addFragment(new RegistrationFragment(), "Registration");

        viewPager.setAdapter(viewPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
    }
}

