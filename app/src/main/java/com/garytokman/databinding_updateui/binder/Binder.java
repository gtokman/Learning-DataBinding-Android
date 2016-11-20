package com.garytokman.databinding_updateui.binder;
// Gary Tokman
// 11/20/16
// DataBinding-UpdateUI

import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class Binder {

    @BindingAdapter(value = {"imageUrl", "placeholder"}, requireAll = false)
    public static void setImageUrl(ImageView imageView, String url, Drawable placeHolder) {
        if (url == null) {
            imageView.setImageDrawable(placeHolder);
        } else {
            Glide.with(imageView.getContext()).load(url).placeholder(placeHolder).into(imageView);
            Log.d("Binder:", "setImageUrl: " + url);
        }
    }
}
