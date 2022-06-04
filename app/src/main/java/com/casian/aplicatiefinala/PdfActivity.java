package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class PdfActivity extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.algebra1,
            R.drawable.algebra2,
            R.drawable.algebra3,
            R.drawable.algebra4,
            R.drawable.algebra5,
            R.drawable.algebra6,
            R.drawable.algebra7,
            R.drawable.algebra8,
            R.drawable.algebra9,
            R.drawable.algebra10,
            R.drawable.algebra11,
            R.drawable.algebra12,
            R.drawable.algebra13,
            R.drawable.algebra14,
            R.drawable.algebra15,
            R.drawable.algebra16,
            R.drawable.algebra17,
            R.drawable.algebra18,
            R.drawable.algebra19,
            R.drawable.algebra20,
            R.drawable.algebra21,
            R.drawable.algebra22,
            R.drawable.algebra23,
            R.drawable.algebra24,
            R.drawable.algebra25,
            R.drawable.algebra26,
            R.drawable.algebra27,
            R.drawable.algebra28,
            R.drawable.algebra29};

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