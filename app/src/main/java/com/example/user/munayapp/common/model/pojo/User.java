package com.example.user.munayapp.common.model.pojo;

import android.net.Uri;

import com.google.firebase.database.Exclude;

public class User {
    private String lastConnectionWith;
    private String username;
    private String email;
    private String photoUrl;
    private int messageUnread;

    @Exclude
    private String uid;
    @Exclude
    private Uri uri;

    public User() {
    }

    public String getLastConnectionWith() {
        return lastConnectionWith;
    }

    public void setLastConnectionWith(String lastConnectionWith) {
        this.lastConnectionWith = lastConnectionWith;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl;
    }

    public int getMessageUnread() {
        return messageUnread;
    }

    public void setMessageUnread(int messageUnread) {
        this.messageUnread = messageUnread;
    }

    @Exclude
    public String getUid() {
        return uid;
    }

    @Exclude
    public void setUid(String uid) {
        this.uid = uid;
    }

    @Exclude
    public Uri getUri() {
        return uri;
    }

    @Exclude
    public void setUri(Uri uri) {
        this.uri = uri;
    }
}
