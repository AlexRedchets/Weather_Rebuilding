package com.example.azvk.weather;

import android.content.Intent;
import android.location.Location;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity implements MainScreen {

    //@Inject
    MainPresenter mainPresenter = new MainPresenter();

    private static final String TAG = MainActivity.class.getSimpleName();

    @BindView(R.id.getWeatherButton)
    Button getWetherButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i(TAG, "onCreated called");

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ButterKnife.bind(this);

    }

    @OnClick(R.id.getWeatherButton)
    public void setGetWetherButtonClicked(){
        Log.i(TAG, "Get Weather Button Clicked");

        mainPresenter.onPostGetWeatherButtonClicked(this);
    }

    @Override
    public void launchPostsActivity() {
        Log.i(TAG, "launch Posts Activity");

        Intent intent = new Intent(this, WeatherAcivity.class);
        startActivity(intent);
    }
}
