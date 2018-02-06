package com.wardslaus.welcome;

import com.stephentuso.welcome.BasicPage;
import com.stephentuso.welcome.TitlePage;
import com.stephentuso.welcome.WelcomeActivity;
import com.stephentuso.welcome.WelcomeConfiguration;

/**
 * Created by dominic@wardslaus.co.za on 10/5/16.
 */

public class DefaultWelcomeActivity extends WelcomeActivity {

    @Override
    protected WelcomeConfiguration configuration() {
        return new WelcomeConfiguration.Builder(this)
                .defaultBackgroundColor(R.color.colorPrimary)
                .page(new TitlePage(R.drawable.ic_image_white, "Default Welcome Screen"))
                .page(new BasicPage(R.drawable.ic_style_white, "Default style", "No custom styles are applied to this welcome screen"))
                .page(new BasicPage(R.drawable.ic_image_white, "Default properties", "No properties were set on the WelcomeScreenBuilder"))
                .build();
    }

}
