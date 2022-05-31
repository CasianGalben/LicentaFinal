package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class Stinte extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.stinte1,
            R.drawable.stinte2,
            R.drawable.stinte3,
            R.drawable.stinte4,
            R.drawable.stinte5,
            R.drawable.stinte6,
            R.drawable.stinte7,
            R.drawable.stinte8,
            R.drawable.stinte9,
            R.drawable.stinte10,
            R.drawable.stinte11,
            R.drawable.stinte12,
            R.drawable.stinte13,
            R.drawable.stinte14,
            R.drawable.stinte15,
            R.drawable.stinte16,
            R.drawable.stinte17,
            R.drawable.stinte18,
            R.drawable.stinte19,
            R.drawable.stinte20,
            R.drawable.stinte21,
            R.drawable.stinte22,
            R.drawable.stinte23,
            R.drawable.stinte24,
            R.drawable.stinte25,

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