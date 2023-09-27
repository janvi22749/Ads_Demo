package com.example.adsdemo.AdsShow;

import android.content.Context;
import android.content.SharedPreferences;

public class Ads_Preference {
    public SharedPreferences.Editor editor;
    public SharedPreferences prefs;

    public Ads_Preference(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("ADS_PREFS", 0);
        this.prefs = sharedPreferences;
        this.editor = sharedPreferences.edit();
    }

    public void set_bottom_native_enable(boolean z) {
        this.editor.putBoolean("BOTTOM_NATIVE_ENABLE", z).commit();
    }

    public boolean get_bottom_native_enable() {
        return this.prefs.getBoolean("BOTTOM_NATIVE_ENABLE", false);
    }

    public void set_extra_screen1_enable(boolean z) {
        this.editor.putBoolean("EXTRA_SCREEN1_ENABLE", z).commit();
    }

    public boolean get_extra_screen1_enable() {
        return this.prefs.getBoolean("EXTRA_SCREEN1_ENABLE", false);
    }

    public void set_IsCheckVPN(boolean z) {
        this.editor.putBoolean("is_check", z).commit();
    }

    public boolean get_IsCheckVPN() {
        return this.prefs.getBoolean("is_check", false);
    }

    public void set_extra_screen2_enable(boolean z) {
        this.editor.putBoolean("EXTRA_SCREEN2_ENABLE", z).commit();
    }

    public boolean get_extra_screen2_enable() {
        return this.prefs.getBoolean("EXTRA_SCREEN2_ENABLE", false);
    }

    public void set_extra_screen3_enable(boolean z) {
        this.editor.putBoolean("EXTRA_SCREEN3_ENABLE", z).commit();
    }

    public boolean get_extra_screen3_enable() {
        return this.prefs.getBoolean("EXTRA_SCREEN3_ENABLE", false);
    }

    public void set_extra_screen4_enable(boolean z) {
        this.editor.putBoolean("EXTRA_SCREEN4_ENABLE", z).commit();
    }

    public boolean get_extra_screen4_enable() {
        return this.prefs.getBoolean("EXTRA_SCREEN4_ENABLE", false);
    }

    public void set_qureka_header_show(boolean z) {
        this.editor.putBoolean("QUREKA_HEADER_SHOW", z).commit();
    }

    public boolean get_qureka_header_show() {
        return this.prefs.getBoolean("QUREKA_HEADER_SHOW", false);
    }

    public void set_Custom_Inter(boolean z) {
        this.editor.putBoolean("CUSTOM_INTERSTITIAl_ENABLE", z).commit();
    }

    public boolean get_Custom_Inter() {
        return this.prefs.getBoolean("CUSTOM_INTERSTITIAl_ENABLE", false);
    }

    public void set_Update_dialog_close_enable(boolean z) {
        this.editor.putBoolean("UPDATE_DIALOG_CLOSE_ENABLE", z).commit();
    }

    public boolean get_Update_dialog_close_enable() {
        return this.prefs.getBoolean("UPDATE_DIALOG_CLOSE_ENABLE", false);
    }

    public void set_qureka_webview_on_off(String str) {
        this.editor.putString("QUREKA_WEBVIEW_ON_OFF", str).commit();
    }

    public String get_qureka_webview_on_off() {
        return this.prefs.getString("QUREKA_WEBVIEW_ON_OFF", "");
    }

    public void set_VPN_URL(String str) {
        this.editor.putString("VPN_BASE_URL", str).commit();
    }

    public String get_VPN_URL() {
        return this.prefs.getString("VPN_BASE_URL", "");
    }

    public void set_VPN_ID(String str) {
        this.editor.putString("VPN_CARRIER_ID", str).commit();
    }

    public String get_VPN_ID() {
        return this.prefs.getString("VPN_ON_OFF", "");
    }


    public void set_VPN_ON_OFF(String str) {
        this.editor.putString("VPN_ON_OFF", str).commit();
    }

    public String get_VPN_ON_OFF() {
        return this.prefs.getString("VPN_ON_OFF", "");
    }


    public void set_new_app_version(String new_version) {
        this.editor.putString("NEW_APP_VERSION_CHECK", new_version).commit();
    }

    public String get_new_app_version() {
        return prefs.getString("NEW_APP_VERSION_CHECK", "");
    }


    public void setAdmAppOpenID(String str) {
        this.editor.putString("APP_OPEN_ID", str).commit();
    }

    public String getAdmAppOpenID() {
        return this.prefs.getString("APP_OPEN_ID", "");
    }


    public void setAppOpenSplashEnable(boolean z) {
        this.editor.putBoolean("APP_OPEN_ENABLE", z).commit();
    }

    public boolean getAppOpenSplashEnable() {
        return this.prefs.getBoolean("APP_OPEN_ENABLE", false);
    }


    public void setbanner_enable(boolean z) {
        this.editor.putBoolean("BANNER_ENABLE", z).commit();
    }

    public boolean getbanner_enable() {
        return this.prefs.getBoolean("BANNER_ENABLE", false);
    }


    public void setAdmBannerID(String str) {
        this.editor.putString("AM_BANNER_ID", str).commit();
    }

    public String getAdmBannerID() {
        return this.prefs.getString("AM_BANNER_ID", "");
    }


    public void setFbBannerID(String str) {
        this.editor.putString("FB_BANNER_ID", str).commit();
    }

    public String getFbBannerID() {
        return this.prefs.getString("FB_BANNER_ID", "");
    }


    public void setFbInterstitialID(String str) {
        this.editor.putString("FB_INTERSTITIAL_ID", str).commit();
    }

    public String getFbInterstitialID() {
        return this.prefs.getString("FB_INTERSTITIAL_ID", "");
    }


    public void setFbNativeID(String str) {
        this.editor.putString("FB_NATIVE_ID", str).commit();
    }

    public String getFbNativeID() {
        return this.prefs.getString("FB_NATIVE_ID", "");
    }


    public void setInterstitialClickGap(String j) {
        this.editor.putString("INTERSTITIAL_CLICK_MODULE", j).commit();

    }

    public String getInterstitialClickGap() {
        return this.prefs.getString("INTERSTITIAL_CLICK_MODULE", "0");
    }


    public void setinterstitial_enable(boolean z) {
        this.editor.putBoolean("INTERSTITIAL_ENABLE", z).commit();
    }

    public boolean getinterstitial_enable() {
        return this.prefs.getBoolean("INTERSTITIAL_ENABLE", false);
    }


    public void setInterstitialEnableBackPress(boolean z) {
        this.editor.putBoolean("INTERSTITIAL_ENABLE_BACKPRESS", z).commit();
    }

    public boolean getInterstitialEnableBackPress() {
        return this.prefs.getBoolean("INTERSTITIAL_ENABLE_BACKPRESS", false);
    }


    public void setAdmInterstitialID(String str) {
        this.editor.putString("AM_INTERSTITIAL_ID", str).commit();
    }

    public String getAdmInterstitialID() {
        return this.prefs.getString("AM_INTERSTITIAL_ID", "");
    }


    public void setnative_ads_enable(boolean z) {
        this.editor.putBoolean("NATIVE_ENABLE", z).commit();
    }

    public boolean getnative_ads_enable() {
        return this.prefs.getBoolean("NATIVE_ENABLE", false);
    }


    public void setAdmNativeID(String str) {
        this.editor.putString("AM_NATIVE_ID", str).commit();
    }

    public String getAdmNativeID() {
        return this.prefs.getString("AM_NATIVE_ID", "");
    }


    public void setInterstitialGapEnable(boolean z) {
        this.editor.putBoolean("INTERSTITIAL_GAP_ENABLE", z).commit();
    }

    public boolean getInterstitialGapEnable() {
        return this.prefs.getBoolean("INTERSTITIAL_GAP_ENABLE", false);
    }


    public void setnative_qureka_enable(boolean z) {
        this.editor.putBoolean("NATIVE_QUREKA_ENABLE", z).commit();
    }

    public boolean getnative_qureka_enable() {
        return this.prefs.getBoolean("NATIVE_QUREKA_ENABLE", false);
    }


    public void set_new_link(String str) {
        this.editor.putString("NEW_LINK", str).commit();
    }

    public String get_new_link() {
        return this.prefs.getString("NEW_LINK", "");
    }


    public void set_priority(String str) {
        this.editor.putString("PRIORITY", str).commit();
    }

    public String get_priority() {
        return this.prefs.getString("PRIORITY", "");
    }


    public void set_privacy_url(String str) {
        this.editor.putString("LINK_PRIVACY_POLICY", str).commit();
    }

    public String get_privacy_url() {
        return this.prefs.getString("LINK_PRIVACY_POLICY", "");
    }

    public void set_feedback(String str) {
        this.editor.putString("FEEDBACK", str).commit();
    }

    public String get_feedback() {
        return this.prefs.getString("FEEDBACK", "");
    }

    public void set_moreapp(String str) {
        this.editor.putString("MORE_APP", str).commit();
    }

    public String get_moreapp() {
        return this.prefs.getString("MORE_APP", "");
    }


    public void setQurekaEnable(boolean z) {
        this.editor.putBoolean("INTERSTITIAL_QUREKA_ENABLE", z).commit();
    }

    public boolean getQurekaEnable() {
        return this.prefs.getBoolean("INTERSTITIAL_QUREKA_ENABLE", false);
    }


    public void set_qureka_time(String str) {
        this.editor.putString("INTERSTITIAL_QUREKA_TIME", str).commit();
    }

    public String get_qureka_time() {
        return this.prefs.getString("INTERSTITIAL_QUREKA_TIME", "");
    }


    public void setQureka_link(String str) {
        this.editor.putString("LINK_QUREKA", str).commit();
    }

    public String getQureka_link() {
        return this.prefs.getString("LINK_QUREKA", "");
    }

    public void setInterstitialBackPressClickGap(String j) {

        this.editor.putString("INTERSTITIAL_BACKPRESS_CLICK_MODULE", j).commit();

    }

    public String getInterstitialBackPressClickGap() {
        return this.prefs.getString("INTERSTITIAL_BACKPRESS_CLICK_MODULE", "0");
    }


    public void setIsFirstTime(boolean z) {
        this.editor.putBoolean("isFirstTime", z).commit();
    }

    public boolean getIsFirstTime() {
        return this.prefs.getBoolean("isFirstTime", false);
    }


}
