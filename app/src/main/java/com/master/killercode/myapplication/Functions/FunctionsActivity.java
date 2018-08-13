package com.master.killercode.myapplication.Functions;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import com.master.killercode.myapplication.R;
import com.master.killercode.myapplication.databinding.FunctionsBinding;

public class FunctionsActivity extends AppCompatActivity {
    FunctionsBinding binding;
    FunctionsEvents functionsEvents;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVars();
        initActions();
    }

    private void initVars() {
        binding = DataBindingUtil.setContentView(this, R.layout.functions);

        functionsEvents = new FunctionsEvents();
        binding.setFunc(functionsEvents);
        binding.executePendingBindings();
    }

    private void initActions() {

    }

}
