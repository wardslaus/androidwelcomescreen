package com.wardslaus.welcome;

import android.support.v4.app.Fragment;

import com.stephentuso.welcome.FragmentWelcomePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;
import com.wardslaus.welcome.fragment.DoneFragment;
import com.wardslaus.welcome.fragment.ExampleFragment;

/**
 * Created by dominic@wardslaus.co.za on 10/5/16.
 */

public class CustomPageWelcomeActivity extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.colorPrimary)
                .page(new FragmentWelcomePage() {
                    @Override
                    protected Fragment fragment() {
                        return new ExampleFragment();
                    }
                })
                .page(new FragmentWelcomePage() {
                    @Override
                    protected Fragment fragment() {
                        return new DoneFragment();
                    }
                })
                .useCustomDoneButton(true)
                .build();
    }

}
