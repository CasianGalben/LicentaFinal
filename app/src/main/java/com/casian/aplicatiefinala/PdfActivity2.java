package com.casian.aplicatiefinala;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

public class PdfActivity2 extends AppCompatActivity {

    SliderView sliderView;
    int[] images = {R.drawable.algabraa1,
            R.drawable.algabraa2,
            R.drawable.algrabraa3,
            R.drawable.algebraa4,
            R.drawable.algebraa5,
            R.drawable.algebraa6,
            R.drawable.algebraa7,
            R.drawable.algebraa8,
            R.drawable.algebraa9,
            R.drawable.algebraa10,
            R.drawable.algebraa11,
            R.drawable.algebraa12,
            R.drawable.algebraa13,
            R.drawable.algebraa14,
            R.drawable.algebraa15,
            R.drawable.algebraa16,
            R.drawable.algebraa17,
            R.drawable.algebraa18,
            R.drawable.algebraa19,
            R.drawable.algebraa20,
            R.drawable.algebraa21,
            R.drawable.algebraa22,
            R.drawable.algebraa23,
            R.drawable.algebraa24,
            R.drawable.algebraa25,
            R.drawable.algebraa26,
            R.drawable.algebraa27,
            R.drawable.algebraa28,
            R.drawable.algebraa29,
            R.drawable.algebraa30,
            R.drawable.algebraa31,
            R.drawable.algebraa32};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pdf2);
        getSupportActionBar().hide();
        sliderView = findViewById(R.id.image_slider);

        SliderAdapter sliderAdapter = new SliderAdapter(images);

        sliderView.setSliderAdapter(sliderAdapter);
        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.DEPTHTRANSFORMATION);
        sliderView.startAutoCycle();


    }
}