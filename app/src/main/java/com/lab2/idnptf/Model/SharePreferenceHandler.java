package com.lab2.idnptf.Model;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

class SharePreferenceHandler {

    private Context context;
    private SharedPreferences myPrefs;

    public SharePreferenceHandler(Context context){
        this.context = context;
        myPrefs = context.getSharedPreferences("My_Preferences", Activity.MODE_PRIVATE);
    }

    public void saveToken(String token){
        SharedPreferences.Editor editor = myPrefs.edit();
        editor.putString("Tk", token);
        editor.commit();
    }

    public String getToken(){
        String token = myPrefs.getString("Tk","NULL");
        return token;
    }

}
