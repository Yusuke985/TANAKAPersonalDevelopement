package jp.ac.maijou.android.tanakapersonaldevelopement;

import android.content.Intent;
import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import jp.ac.maijou.android.tanakapersonaldevelopement.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        binding.yotei.setOnClickListener(v ->{
                var intent = new Intent(this,calender.class);
                startActivity(intent);
        });
        binding.todo.setOnClickListener(v ->{
            var intent = new Intent(this,ToDoAdd.class);
            startActivity(intent);
        });
        binding.screenTime.setOnClickListener(v ->{
            var intent = new Intent(this,calender.class);
            startActivity(intent);
        });
        binding.tuuchi.setOnClickListener(v ->{
            var intent = new Intent(this,NoticeSetting.class);
            startActivity(intent);
        });


    }
}