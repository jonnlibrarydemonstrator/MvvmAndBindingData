package com.master.killercode.myapplication.Clicks;

import android.databinding.ObservableField;
import android.view.View;

import static com.master.killercode.myapplication.ViewUtil.initSnackBar;

public class ClicksEvents {

    public ObservableField<String> text = new ObservableField<>();

    public void setTextInXml() {
        text.set("Events Clicks");
    }

    public void onButtonClick(View view) {
        initSnackBar(view , "Button clicked!");
    }

    public void onButtonClickWithParam(View view, String text) {
        initSnackBar(view , "Button clicked! Text: " + text);
    }

    public boolean onButtonLongPressed(View view) {
        initSnackBar(view , "Button long pressed!");return false;
    }
}

