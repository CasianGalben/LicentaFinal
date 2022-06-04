package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Pedagogic extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.pda1,
            R.drawable.pda2,
            R.drawable.pda3,
            R.drawable.pda4,
            R.drawable.pda5,
            R.drawable.pda6,
            R.drawable.pda7,
            R.drawable.pda8,
            R.drawable.pda9,
            R.drawable.pda10,
            R.drawable.pda11,
            R.drawable.pda12,
            R.drawable.pda13,
            R.drawable.pda15,
            R.drawable.pda16,
            R.drawable.pda17,
            R.drawable.pda18,
            R.drawable.pda19,




    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);
        getSupportActionBar().hide();
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }
}