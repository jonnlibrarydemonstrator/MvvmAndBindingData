package com.master.killercode.myapplication.Objeto;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.master.killercode.myapplication.R;
import com.master.killercode.myapplication.databinding.ObjetoBinding;

public class ObjetoActivity extends AppCompatActivity {
    ObjetoBinding binding;
    User objeto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVars();
        initActions();

    }

    private void initVars() {
        binding = DataBindingUtil.setContentView(this, R.layout.objeto);

        objeto = new User();
        objeto.setData("00/00/0000 00:00:00");
        objeto.setName("Jonn");
        objeto.setEmail("Jonn255d@gmail.com");
        binding.setObjetoUser(objeto);
        binding.executePendingBindings();
    }

    private void initActions() {

    }

}
