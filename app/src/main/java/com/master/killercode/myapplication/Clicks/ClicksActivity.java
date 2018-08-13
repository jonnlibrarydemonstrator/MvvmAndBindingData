package com.master.killercode.myapplication.Clicks;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;


import com.master.killercode.myapplication.R;
import com.master.killercode.myapplication.databinding.ClicksBinding;

public class ClicksActivity extends AppCompatActivity {
    ClicksBinding binding;
    ClicksEvents clicksEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVars();
        initActions();

    }

    private void initVars() {
        binding = DataBindingUtil.setContentView(this, R.layout.clicks);

        clicksEvents = new ClicksEvents();
        binding.setClickEvents(clicksEvents);

        binding.executePendingBindings();

    }

    private void initActions() {
        binding.getClickEvents().setTextInXml();
    }

}
