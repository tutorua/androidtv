package com.example.helloworld;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.widget.Button;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.Toast;

import com.example.helloworld.TimeUtils;

public class SecondActivity extends AppCompatActivity {

    private static final String TAG = "SecondActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button backButton = findViewById(R.id.backButton);
        backButton.setOnClickListener(v -> finish()); // This closes SecondActivity and returns
    }

    @Override
    public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        // Log.d(TAG, TimeUtils.getTimestamp() + " - Key pressed: " + keyCode);
        Log.d(TAG, TimeUtils.getTimestamp() + " - Key pressed: " + keyCode + " (" + KeyEvent.keyCodeToString(keyCode) + ")");

        switch (keyCode) {
            case KeyEvent.KEYCODE_DPAD_CENTER:
                Log.i(TAG, "Center/OK pressed" + keyCode);
                break;
            case KeyEvent.KEYCODE_DPAD_LEFT:
                Log.i(TAG, "D-pad Left" + keyCode);
                break;
            // ...add more as needed
        }

        if (KeyMapHelper.isBackKey(keyCode)) {
            Log.i(TAG, TimeUtils.getTimestamp() + " - Back button pressed");
            // Custom behavior for Back button
            Toast.makeText(this, "Back button pressed!", android.widget.Toast.LENGTH_SHORT).show();
            finish(); // Optional: return to MainActivity
            return true; // You handled it
        }
        return super.onKeyDown(keyCode, event);
    }
}