package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Tehnologic extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.teh1,
            R.drawable.teh2,
            R.drawable.teh3,
            R.drawable.teh4,
            R.drawable.teh5,
            R.drawable.teh6,
            R.drawable.teh7,
            R.drawable.teh8,
            R.drawable.teh9,
            R.drawable.teh10,
            R.drawable.teh11,
            R.drawable.teh12,
            R.drawable.teh13,
            R.drawable.teh14,
            R.drawable.teh15,
            R.drawable.teh16,
            R.drawable.teh17,
            R.drawable.teh18,
            R.drawable.teh19,
            R.drawable.teh20,
            R.drawable.teh21,


    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();

    }
}