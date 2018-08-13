package com.master.killercode.myapplication.Objeto;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.master.killercode.myapplication.BR;

public class User extends BaseObservable {

    String name;
    String email;
    String data;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
        notifyPropertyChanged(BR.email);
    }

    @Bindable
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
        notifyPropertyChanged(BR.data);
    }


}

