package com.example.adsdemo.AdsShow;

import android.Manifest;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;

import com.facebook.ads.AudienceNetworkAds;

import java.util.ArrayList;
import java.util.List;


public class App_Main extends PreferenceManager {
    public static Context getContext() {
        return context;
    }
    public static Context context;
    public static final String[] REQUIRED_PERMISSIONS = getRequiredPermissions().toArray(new String[0]);
    private final String TAG = "App";
    public static SharedPreferences sharedPreferences;

    public static List<String> getRequiredPermissions() {
        List<String> permissions = new ArrayList<>();
        permissions.add(Manifest.permission.READ_PHONE_STATE);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            permissions.add(Manifest.permission.READ_MEDIA_AUDIO);
            permissions.add(Manifest.permission.READ_MEDIA_IMAGES);
            permissions.add(Manifest.permission.POST_NOTIFICATIONS);
        } else if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            permissions.add(Manifest.permission.WRITE_EXTERNAL_STORAGE);
            permissions.add(Manifest.permission.READ_EXTERNAL_STORAGE);
        }
        return permissions;
    }
    @Override
    public void onCreate() {
        super.onCreate();
        context = this;

        sharedPreferences = getSharedPreferences(getPackageName(), 0);
        new AppOpenManager(this);
        AudienceNetworkAds.initialize(this);
    }
}

