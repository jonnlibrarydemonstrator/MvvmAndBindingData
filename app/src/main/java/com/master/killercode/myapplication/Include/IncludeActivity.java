package com.master.killercode.myapplication.Include;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.master.killercode.myapplication.R;
import com.master.killercode.myapplication.databinding.IncludesBinding;

public class IncludeActivity extends AppCompatActivity {
    IncludesBinding binding;
    IncludeEvents includeEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVars();
        initActions();

    }

    private void initVars() {
        binding = DataBindingUtil.setContentView(this, R.layout.includes);

        includeEvents = new IncludeEvents();
        binding.setInclude(includeEvents);

        binding.executePendingBindings();
    }

    private void initActions() {
        binding.getInclude().setTextInXml();
    }

}
