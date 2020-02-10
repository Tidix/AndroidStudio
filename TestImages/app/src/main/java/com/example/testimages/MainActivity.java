package com.example.testimages;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.example.testimages.R;

public class MainActivity extends AppCompatActivity {
    private Button loadImageButton = null;
    private Button loadImageWithPlaceholderButton = null;
    private Button loadImageSpecialSizeButton = null;
    // Used to show glide load image.
    private ImageView imageView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.imageView);
        Glide.with(this).load("https://media1.giphy.com/media/nopqz91prOyvS/giphy.gif?cid=3640f6095c6fb73045666478512a97d7").into(imageView);
    }
}
