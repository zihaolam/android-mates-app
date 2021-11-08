package com.example.mates;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class UserViewModel extends ViewModel {
    private MutableLiveData<User> user = new MutableLiveData<User>(new User(null));
    public LiveData<User> getUser() {
        return this.user;
    }

    public void setUser(String username) {
        this.user.postValue(new User(username));
    }
}
