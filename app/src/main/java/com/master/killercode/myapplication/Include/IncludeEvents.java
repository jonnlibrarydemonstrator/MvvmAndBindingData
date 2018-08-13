package com.master.killercode.myapplication.Include;

import android.databinding.ObservableField;
import android.view.View;

import static com.master.killercode.myapplication.ViewUtil.initSnackBar;

public class IncludeEvents {

    private int count = 1;

    public ObservableField<String> text = new ObservableField<>();

    public void setTextInXml() {
        text.set("Includes Clicks");
    }

    public void onButtonClick(View view) {
        text.set("FAB Clicked " + count + "x");
        count++;
    }

}

