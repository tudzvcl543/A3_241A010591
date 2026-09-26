package vn.edu.vhu.ltdd.a3tuan;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.snackbar.Snackbar;

/** Ví dụ bố cục LinearLayout và lưu tùy chọn nhớ MSSV trên thiết bị. */
public class MainActivity extends AppCompatActivity {
    private static final String PREFS = "student_login_demo";
    private static final String KEY_STUDENT_ID = "student_id";

    @Override
    protected void onCreate(Bundle state) {
        super.onCreate(state);
        setContentView(R.layout.activity_main);

        EditText studentId = findViewById(R.id.edtStudentId);
        EditText password = findViewById(R.id.edtPassword);
        CheckBox remember = findViewById(R.id.cbRemember);
        Button login = findViewById(R.id.btnLogin);
        Button openConstraint = findViewById(R.id.btnConstraintDemo);

        SharedPreferences preferences = getSharedPreferences(PREFS, MODE_PRIVATE);
        String previousId = preferences.getString(KEY_STUDENT_ID, "");
        if (!previousId.isEmpty()) {
            studentId.setText(previousId);
            remember.setChecked(true);
        }

        login.setOnClickListener(view -> {
            String value = studentId.getText().toString().trim();
            if (TextUtils.isEmpty(value)) {
                studentId.setError(getString(R.string.error_student_id));
                studentId.requestFocus();
                return;
            }
            if (TextUtils.isEmpty(password.getText().toString())) {
                password.setError(getString(R.string.error_password));
                password.requestFocus();
                return;
            }

            preferences.edit().putString(KEY_STUDENT_ID, remember.isChecked() ? value : "").apply();
            Snackbar.make(view, getString(R.string.login_message, value), Snackbar.LENGTH_LONG).show();
        });

        openConstraint.setOnClickListener(view ->
                startActivity(new Intent(this, ConstraintDemoActivity.class)));
    }
}
