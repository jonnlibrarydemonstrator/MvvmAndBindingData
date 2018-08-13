package com.master.killercode.myapplication;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;

import com.master.killercode.myapplication.Clicks.ClicksActivity;
import com.master.killercode.myapplication.Functions.FunctionsActivity;
import com.master.killercode.myapplication.Include.IncludeActivity;
import com.master.killercode.myapplication.LoadUrl.LoadUrlActivity;
import com.master.killercode.myapplication.Objeto.ObjetoActivity;
import com.master.killercode.myapplication._01_Init.init;
import com.master.killercode.myapplication.databinding.ActivityMainBinding;

import static com.master.killercode.myapplication.ViewUtil.initDrawer;
import static com.master.killercode.myapplication.ViewUtil.initIntent;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    ActivityMainBinding binding;
    MainActivityVM viewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        initVars();
        initActions();

    }

    private void initVars() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        viewModel = new MainActivityVM();
        binding.setInitMainActivity(viewModel);
        binding.executePendingBindings();

    }

    private void initActions() {
        binding.getInitMainActivity().setObservableText("BOOOM! Hello World!");

        initDrawer(this, binding.drawerLayout, binding.toolbarAction);
        binding.navView.setNavigationItemSelectedListener(this);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            binding.getInitMainActivity().setObservableText(binding.getInitMainActivity().lastAction + "Settings Clicked");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.init) {
            initIntent(this, init.class);
            binding.getInitMainActivity().setObservableText(binding.getInitMainActivity().lastAction + "Activity called: " + init.class.getSimpleName());
        } else if (id == R.id.clicks) {
            initIntent(this, ClicksActivity.class);
            binding.getInitMainActivity().setObservableText(binding.getInitMainActivity().lastAction + "Activity called: " + ClicksActivity.class.getSimpleName());
        }else if (id == R.id.include) {
            initIntent(this, IncludeActivity.class);
            binding.getInitMainActivity().setObservableText(binding.getInitMainActivity().lastAction + "Activity called: " + IncludeActivity.class.getSimpleName());
        }else if (id == R.id.functions) {
            initIntent(this, FunctionsActivity.class);
            binding.getInitMainActivity().setObservableText(binding.getInitMainActivity().lastAction + "Activity called: " + FunctionsActivity.class.getSimpleName());
        }else if (id == R.id.objeto) {
            initIntent(this, ObjetoActivity.class);
            binding.getInitMainActivity().setObservableText(binding.getInitMainActivity().lastAction + "Activity called: " + ObjetoActivity.class.getSimpleName());
        }else if (id == R.id.load_url) {
            initIntent(this, LoadUrlActivity.class);
            binding.getInitMainActivity().setObservableText(binding.getInitMainActivity().lastAction + "Activity called: " + LoadUrlActivity.class.getSimpleName());
        }

        binding.drawerLayout.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public void onBackPressed() {
        if (binding.drawerLayout.isDrawerOpen(GravityCompat.START)) {
            binding.drawerLayout.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}
