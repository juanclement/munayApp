package com.example.user.munayapp.loginModule.model.dataAccess;

import com.google.firebase.auth.FirebaseUser;

interface StatusAuthCallback {
    void onGetUser(FirebaseUser user);
    void onLaunchUILogin();
}
