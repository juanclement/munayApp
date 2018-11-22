package com.example.user.munayapp.loginModule.view;

import android.content.Intent;

public interface LoginView {
    void showProgress();
    void hideProgress();

    void openMainActivity();
    void openUiLogin();

    void showLoginSuccessfully(Intent intent);
    void showMessageStartin();

    void showError(int resMsg);
}
