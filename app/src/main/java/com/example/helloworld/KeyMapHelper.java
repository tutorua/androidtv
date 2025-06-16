package com.example.helloworld;

import android.view.KeyEvent;

public class KeyMapHelper {

    public static boolean isBackKey(int keyCode) {
        return keyCode == KeyEvent.KEYCODE_BACK
                || keyCode == KeyEvent.KEYCODE_ESCAPE
                || keyCode == KeyEvent.KEYCODE_BUTTON_B; // Just in case of gamepad
    }

    public static String describeKey(int keyCode) {
        return KeyEvent.keyCodeToString(keyCode);
    }

    // Add more helpers as needed: for volume, D-pad, media keys...
}
