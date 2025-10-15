package com.example.ktgk_thayhuy;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    TextView txtWelcome;
    Button btnLogout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login); // Giao diện chính sau đăng nhập

        // Ánh xạ view
        txtWelcome = findViewById(R.id.textView);
        btnLogout = findViewById(R.id.btnLogout);

        // Nhận dữ liệu username từ Intent
        String username = getIntent().getStringExtra("username");
        if (username != null && !username.isEmpty()) {
            txtWelcome.setText("Xin chào " + username);
        } else {
            txtWelcome.setText("Xin chào người dùng");
        }

        // Xử lý khi nhấn nút Đăng Xuất
        btnLogout.setOnClickListener(v -> {
            finish(); // Quay lại màn hình đăng nhập
        });
    }
}
