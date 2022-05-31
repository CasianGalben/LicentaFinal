package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class MateInfo extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.mateinfo1,
            R.drawable.mateinfo2,
            R.drawable.mateinfo3,
            R.drawable.mateinfo4,
            R.drawable.mateinfo5,
            R.drawable.mateinfo6,
            R.drawable.mateinfo7,
            R.drawable.mateinfo8,
            R.drawable.mateinfo9,
            R.drawable.mateinfo10,
            R.drawable.mateinfo11,
            R.drawable.mateinfo12,
            R.drawable.mateinfo13,
            R.drawable.mateinfo14,
            R.drawable.mateinfo15,
            R.drawable.mateinfo16,
            R.drawable.mateinfo17,
            R.drawable.mateinfo18,
            R.drawable.mateinfo19,
            R.drawable.mateinfo20,
            R.drawable.mateinfo21,
            R.drawable.mateinfo22,
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