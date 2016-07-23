package com.example.azvk.weather;

import javax.inject.Inject;

public class MainPresenter {

    //@Inject
    public MainPresenter(){
    }

    public void onPostGetWeatherButtonClicked(MainScreen mainScreen){
        mainScreen.launchPostsActivity();
    }

}
