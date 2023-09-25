package com.jay.animequiz.model.common;

import android.content.Context;
import android.widget.ImageView;

import com.jay.animequiz.R;
import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;


public class Util {
    public static void loadUrl(String url, ImageView imageView, Context ctx){
        Glide.with(ctx)
                .load(url)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .placeholder(R.drawable.placeholder)
                .error(R.drawable.placeholder)
                .into(imageView);
    }
    public static void loadUrl(int res,ImageView imageView, Context ctx){
        Glide.with(ctx)
                .load(res)
                .diskCacheStrategy(DiskCacheStrategy.ALL)
                .centerCrop()
                .into(imageView);
    }
}
