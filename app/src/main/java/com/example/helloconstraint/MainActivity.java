
package com.example.helloconstraint;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.Toast;
import android.graphics.Color;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int mCount = 0;
    private TextView mShowCount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mShowCount = findViewById(R.id.show_count);
    }

    public void showToast(View view) {
        Toast.makeText(this, "Hello Toast!",
                Toast.LENGTH_SHORT).show();
    }

    public void countUp(View view) {

        mCount++;

        mShowCount.setText(String.valueOf(mCount));

        if (mCount % 2 == 0) {
            view.setBackgroundColor(Color.GREEN);
        } else {
            view.setBackgroundColor(Color.MAGENTA);
        }

        Button zeroButton = findViewById(R.id.button_zero);
        zeroButton.setBackgroundColor(Color.MAGENTA);
    }

    public void zeroCount(View view) {

        mCount = 0;

        mShowCount.setText(String.valueOf(mCount));

        view.setBackgroundColor(Color.GRAY);
    }
}
