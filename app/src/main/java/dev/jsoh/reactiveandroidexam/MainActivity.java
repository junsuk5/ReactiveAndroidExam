package dev.jsoh.reactiveandroidexam;

import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainViewModel model = ViewModelProviders.of(this).get(MainViewModel.class);

        TextView counterTextView = findViewById(R.id.counter_text_view);
        counterTextView.setText(model.count + "");

        findViewById(R.id.add_button).setOnClickListener(v -> {
            model.count++;
            counterTextView.setText(model.count + "");
        });
        findViewById(R.id.remove_button).setOnClickListener(v -> {
            model.count--;
            counterTextView.setText(model.count + "");
        });
    }
}
