package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class PdfActivity4 extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.tri1,
            R.drawable.tri2,
            R.drawable.tri3,
            R.drawable.tri4,
            R.drawable.tri5,
            R.drawable.tri6,
            R.drawable.tri7,
            R.drawable.tri8,
            R.drawable.tri9,
            R.drawable.tri10,
            R.drawable.tri11,
            R.drawable.tri12,
            R.drawable.tri13,
            R.drawable.tri14,
            R.drawable.tri15,
            R.drawable.tri16,
            R.drawable.tri17,
            R.drawable.tri18,
            R.drawable.tri19,
            R.drawable.tri20,
            R.drawable.tri21,
            R.drawable.tri22,
           };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf4);

        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


    }
}