package com.example.myapplication.Servies

import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceHelper (context: Context) {
    private val APP_NAME = "SharedPref"

    private var pref: SharedPreferences

    private var editor: SharedPreferences.Editor

    init {
        pref = context.getSharedPreferences(APP_NAME,Context.MODE_PRIVATE)
        editor = pref.edit()
    }

    var login: String?
        get() = pref.getString("login",null)
        set(value) = pref.edit().putString(login,value).apply()

    var password: String?
        get() = pref.getString("password",null)
        set(value) = pref.edit().putString(password,value).apply()

}