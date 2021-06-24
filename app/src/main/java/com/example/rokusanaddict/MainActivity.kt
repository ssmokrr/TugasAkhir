package com.example.rokusanaddict

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ViewFlipper

class MainActivity : AppCompatActivity() {

    ViewFlipper viewFlipper;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var viewFlipper = (ViewFlipper) findViewById (R.id.viewFlipper);
    }
}