package com.heizi.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RadioButton rbTab1, rbTab2, rbTab3, rbTab4;
    private RadioGroup layTabBottom;
    private List<Fragment> mBaseFragment; //集合

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}