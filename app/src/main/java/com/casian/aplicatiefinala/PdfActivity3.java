package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class PdfActivity3 extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.geo1,
            R.drawable.geo2,
            R.drawable.geo3,
            R.drawable.geo4,
            R.drawable.geo5,
            R.drawable.geo6,
            R.drawable.geo7,
            R.drawable.geo8,
            R.drawable.geo9,
            R.drawable.geo10,
            R.drawable.geo11,
            R.drawable.geo12,
            R.drawable.geo13,
            R.drawable.geo14,
            R.drawable.geo15,
            R.drawable.geo16,
            R.drawable.geo17,
            R.drawable.geo18,
            R.drawable.geo19,
            R.drawable.geo20
            };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf3);
        getSupportActionBar().hide();
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


    }
}