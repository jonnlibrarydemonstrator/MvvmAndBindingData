package com.master.killercode.myapplication.LoadUrl;


import android.databinding.BindingAdapter;
import android.databinding.ObservableField;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

import static com.master.killercode.myapplication.ViewUtil.initGlide;
import static com.master.killercode.myapplication.ViewUtil.initSnackBar;

public class Data {

    String raw = "https://pp.userapi.com/c629327/v629327473/db66/r051joYFRX0.jpg";

    public ObservableField<String> urlProfile = new ObservableField<>(raw);

    @BindingAdapter({"android:urlImg"})
    public static void loadImage(final ImageView view, String imageUrl) {
        initGlide(view, imageUrl);
    }

    public void onFabClicked(View view, String url) {
        urlProfile.set(url);
    }

}

