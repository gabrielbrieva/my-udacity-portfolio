package com.tuxan.udacity.myappportfolio;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;


public class PortfolioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portfolio);
    }

    public void onSocialButtonTap(View view)
    {
        String url = null;

        switch (view.getId())
        {
            case R.id.ibGitHub:
                url = "https://github.com/tuxan";
                break;
            case R.id.ibGooglePlus:
                url = "https://plus.google.com/+GabrielBrieva";
                break;
            case R.id.ibLinkedIn:
                url = "https://cl.linkedin.com/pub/gabriel-brieva-alvarez/23/138/3a0";
                break;
        }

        if (url == null) {
            Toast.makeText(getApplicationContext(), "Ups :(", Toast.LENGTH_SHORT).show();
            return;
        }

        Intent browse = new Intent(Intent.ACTION_VIEW, Uri.parse(url) );
        startActivity(browse);
    }

    public void onAppPortfolioButtonTap(View view)
    {
        String toastText = "This button will lunch my %s app!";
        String appName = null;

        switch (view.getId())
        {
            case R.id.bt_spotify:
                appName = getResources().getString(R.string.spotify_streamer_app);
                break;
            case R.id.bt_football_scores:
                appName = getResources().getString(R.string.football_scores_app);
                break;
            case R.id.bt_library:
                appName = getResources().getString(R.string.library_app);
                break;
            case R.id.bt_build_it_bigger:
                appName = getResources().getString(R.string.build_it_bigger_app);
                break;
            case R.id.bt_capstone:
                appName = getResources().getString(R.string.capstone_app);
                break;
        }

        if (appName == null) {
            Toast.makeText(getApplicationContext(), "Ups :(", Toast.LENGTH_SHORT).show();
            return;
        }

        Toast.makeText(getApplicationContext(), String.format(toastText, appName), Toast.LENGTH_SHORT).show();
    }
}
