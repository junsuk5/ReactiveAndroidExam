package dev.jsoh.reactiveandroidexam;

import android.arch.lifecycle.ViewModelProviders;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import dev.jsoh.reactiveandroidexam.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        MainViewModel model = ViewModelProviders.of(this).get(MainViewModel.class);

        binding.setViewModel(model);
        binding.setLifecycleOwner(this);


        // 사용자 입력 & 이벤트
        findViewById(R.id.add_button).setOnClickListener(v -> model.addCount());
        findViewById(R.id.remove_button).setOnClickListener(v -> model.subCount());
    }
}
