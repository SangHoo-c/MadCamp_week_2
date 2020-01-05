package com.example.recyclerview.gallery;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.recyclerview.R;

public class image_view_page_3 extends Fragment {
    Integer country_code;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        //bundle 로 전달받은 country code 객체를 사용한다.
        Bundle bundle = getArguments();
        if(bundle != null){
            country_code = bundle.getInt("Country_code");
        }
        Log.v("country_code : ", String.valueOf(country_code));

        FrameLayout frameLayout = (FrameLayout) inflater.inflate(R.layout.content_image_inlarge,container, false);
        ImageView background = (ImageView) frameLayout.findViewById(R.id.image_large);
        background.setBackgroundResource(R.drawable.santorini3);

        return frameLayout;
    }
}
