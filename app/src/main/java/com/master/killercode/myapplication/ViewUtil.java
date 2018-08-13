package com.master.killercode.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.support.annotation.Nullable;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.DataSource;
import com.bumptech.glide.load.engine.GlideException;
import com.bumptech.glide.request.RequestListener;
import com.bumptech.glide.request.target.Target;

public class ViewUtil {

    static void initDrawer(Activity activity, DrawerLayout drawerLayout, Toolbar toolbar) {
        ((MainActivity) activity).setSupportActionBar(toolbar);
        toolbar.setTitle(activity.getResources().getString(R.string.app_name));

        //setup action bar drawer toggle
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(activity, drawerLayout, toolbar,
                R.string.opened, R.string.closed);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();
    }

    static void initIntent(Activity activity, Class c) {
        Intent intent = new Intent(activity, c);
        activity.startActivity(intent);
    }

    public static void initSnackBar(View view, String text) {
        Snackbar.make(view, text, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }

    public static void initGlide(final View view, String imageUrl) {
        Glide.with(view.getContext())
                .load(imageUrl)
                .listener(new RequestListener<Drawable>() {
                    @Override
                    public boolean onLoadFailed(@Nullable GlideException e, Object model, Target<Drawable> target, boolean isFirstResource) {
                        initSnackBar(view, "Load Failed");
                        return false;
                    }

                    @Override
                    public boolean onResourceReady(Drawable resource, Object model, Target<Drawable> target, DataSource dataSource, boolean isFirstResource) {
                        return false;
                    }
                })
                .into((ImageView) view);

        // If you consider Picasso, follow the below
        // Picasso.with(view.getContext()).load(imageUrl).placeholder(R.drawable.placeholder).into(view);
    }

}
