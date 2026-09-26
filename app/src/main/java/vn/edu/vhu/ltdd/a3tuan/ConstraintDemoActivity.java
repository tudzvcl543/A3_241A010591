package vn.edu.vhu.ltdd.a3tuan;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

/** Minh họa màn hình có các View trực tiếp trong ConstraintLayout. */
public class ConstraintDemoActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_constraint_demo);
        findViewById(R.id.btnBack).setOnClickListener(view -> finish());
    }
}
