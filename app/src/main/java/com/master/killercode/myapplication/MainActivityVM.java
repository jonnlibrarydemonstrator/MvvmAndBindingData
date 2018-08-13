package com.master.killercode.myapplication;

import android.databinding.ObservableField;
import android.support.design.widget.Snackbar;
import android.view.View;

import static com.master.killercode.myapplication.ViewUtil.initSnackBar;

public class MainActivityVM {

    String lastAction = "Last Action: ";
    public ObservableField<String> text = new ObservableField<>();

    public void setObservableText(String textObservable) {
        text.set(textObservable);
    }

    public void fabClicked(View view) {
        String text = lastAction + "Fab Clicked";
        initSnackBar(view, text);
        setObservableText(text);
    }

}
