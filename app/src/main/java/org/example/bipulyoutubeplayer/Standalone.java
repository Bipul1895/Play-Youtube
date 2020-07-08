package org.example.bipulyoutubeplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeStandalonePlayer;

public class Standalone extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_standalone);

        Button btnPlayVideo = findViewById(R.id.btnPlayVideo);
        Button btnPlaylist = findViewById(R.id.btnPlayList);

        View.OnClickListener ourListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = null;

                if(view.getId() == R.id.btnPlayVideo){
                    intent = YouTubeStandalonePlayer.createVideoIntent(Standalone.this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_VIDEO_ID);
                }
                else if(view.getId() == R.id.btnPlayList){
                    intent = YouTubeStandalonePlayer.createPlaylistIntent(Standalone.this, YoutubeActivity.GOOGLE_API_KEY, YoutubeActivity.YOUTUBE_PLAYLIST);
                }

                if(intent != null) {
                    startActivity(intent);
                }

            }
        };

        btnPlayVideo.setOnClickListener(ourListener);
        btnPlaylist.setOnClickListener(ourListener);

    }
}
