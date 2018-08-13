package com.master.killercode.myapplication.Functions;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableField;
import android.view.View;

import com.master.killercode.myapplication.BR;

import static com.master.killercode.myapplication.Functions.BindingUtils.unCapitalize;

public class FunctionsEvents extends BaseObservable {

    String text = "Functions Events";

    @Bindable
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        notifyPropertyChanged(BR.text);
    }

    public void onButtonClick(View view) {
        setText(unCapitalize(text));
    }

}

