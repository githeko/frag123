package com.example.frag123;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import androidx.core.app.FragmentManager;
import androidx.core.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final androidx.core.app.Fragment first = new FirstFragment();
        final androidx.core.app.Fragment second = new SecondFragment();
        findViewById(R.id.fragment1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                androidx.core.app.FragmentManager fm = getSupportFragmentManager();
                androidx.core.app.FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.layout, first);
                fragmentTransaction.commit();
            }
        });
        findViewById(R.id.fragment2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm = getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fm.beginTransaction();
                fragmentTransaction.replace(R.id.layout, second);
                fragmentTransaction.commit();
            }
        });
    }
}