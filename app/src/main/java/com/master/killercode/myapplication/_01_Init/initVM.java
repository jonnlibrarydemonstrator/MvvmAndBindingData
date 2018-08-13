package com.master.killercode.myapplication._01_Init;

import android.databinding.ObservableField;

public class initVM {

    public ObservableField<String> text = new ObservableField<>();

    public void initTextInMainActivityVM(){
        text.set("BOOOM! Hello World!");
    }

}
