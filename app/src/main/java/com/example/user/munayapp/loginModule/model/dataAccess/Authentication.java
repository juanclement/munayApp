package com.example.user.munayapp.loginModule.model.dataAccess;

import android.support.annotation.NonNull;

import com.example.user.munayapp.common.model.dataAccess.FirebaseAuthenticationAPI;
import com.example.user.munayapp.common.model.pojo.User;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Authentication {
    private FirebaseAuthenticationAPI mAuthenticationAPI;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    public Authentication() {
        mAuthenticationAPI = FirebaseAuthenticationAPI.getInstance();
    }

    public void onResume() {
        mAuthenticationAPI.getmFirebaseAth().addAuthStateListener(mAuthStateListener);
    }

    public void onPause() {
        if (mAuthStateListener != null) {
            mAuthenticationAPI.getmFirebaseAth().removeAuthStateListener(mAuthStateListener);
        }
    }

    public void getStatusAuth(final StatusAuthCallback callback) {
        mAuthStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null){
                    callback.onGetUser(user);
                }else {
                    callback.onLaunchUILogin();
                }
            }
        };
    }
    public User getCurrentUser(){
        return mAuthenticationAPI.getAuthUser();
    }
}
