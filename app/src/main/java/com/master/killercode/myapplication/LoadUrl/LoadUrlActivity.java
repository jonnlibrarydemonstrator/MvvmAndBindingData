package com.master.killercode.myapplication.LoadUrl;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.master.killercode.myapplication.R;
import com.master.killercode.myapplication.databinding.LoadUrlBinding;

public class LoadUrlActivity extends AppCompatActivity {
    LoadUrlBinding binding;
    Data actions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVars();
        initActions();

    }

    private void initVars() {
        binding = DataBindingUtil.setContentView(this, R.layout.load_url);

        actions = new Data();

        binding.setLoadActions(actions);
        binding.executePendingBindings();
    }

    private void initActions() {

    }

}
