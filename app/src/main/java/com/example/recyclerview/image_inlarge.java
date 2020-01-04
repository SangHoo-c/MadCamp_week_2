package com.example.recyclerview;


import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;
import com.github.chrisbanes.photoview.PhotoView;



import java.io.File;



public class image_inlarge extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_image_inlarge);

        Intent mIntent = getIntent();
        final String filePath = mIntent.getStringExtra("filename");
        Log.v("FileName_after_intent: ", filePath);
        final File tmp_file = new File(filePath);

        if (tmp_file.exists()) {
            Bitmap myBitmap = BitmapFactory.decodeFile(tmp_file.getAbsolutePath());
            PhotoView photoView = findViewById(R.id.image_large);
            photoView.setImageBitmap(myBitmap);
        }
    }
}
