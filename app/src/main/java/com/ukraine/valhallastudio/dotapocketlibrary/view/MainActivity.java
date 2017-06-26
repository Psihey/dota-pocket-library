package com.ukraine.valhallastudio.dotapocketlibrary.view;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

import com.ukraine.valhallastudio.dotapocketlibrary.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.btn_heroes) Button mBtnHeroes;
    @BindView(R.id.btn_items) Button mBtnItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        setUpFonts();
    }

    private void setUpFonts() {
        Typeface dotaFonts = Typeface.createFromAsset(getAssets(), "fonts/Trajan Bold.ttf");
        mBtnHeroes.setTypeface(dotaFonts);
        mBtnItems.setTypeface(dotaFonts);
    }

}
