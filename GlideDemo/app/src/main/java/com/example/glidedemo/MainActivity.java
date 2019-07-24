package com.example.glidedemo;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image_view);
    }

    public void loadImage(View view) {
        String url = "http://cn.bing.com/az/hprichbg/rb/Dongdaemun_ZH-CN10736487148_1920x1080.jpg";
        //三步：
        //with() context参数决定了Glide加载图片的生命周期
        //load()用于制定待加载的图片资源，包括网络图片、本地图片、应用资源、二进制流、Uri对象等等。
        //into()方法是希望图片显示在那个ImageView上。
        Glide.with(this)
                .load(url)
                .placeholder(R.mipmap.loading)
                .into(imageView);

        //扩展：
        //占位图
//        Glide.with(this)
//                .load(url)
//                //指定图片格式
//                //.asGif()
//                .asBitmap()
//                .placeholder(R.drawable.loading)
//                .error(R.drawable.error)
//                .diskCacheStrategy(DiskCacheStrategy.NONE)
//                //指定大小
//                //.override(100, 100)
//                .into(imageView);
    }
}
