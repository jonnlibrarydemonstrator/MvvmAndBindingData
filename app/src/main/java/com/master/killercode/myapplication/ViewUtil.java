package com.master.killercode.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.Toolbar;
import android.view.View;

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

}
