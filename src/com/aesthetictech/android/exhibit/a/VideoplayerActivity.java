package com.aesthetictech.android.exhibit.a;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoplayerActivity extends Activity {
/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
    setContentView(R.layout.main);
    VideoView videoView =(VideoView)findViewById(R.id.videoView);
    videoView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    MediaController mediaController= new MediaController(this);
    mediaController.setAnchorView(videoView);        
    Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.one);        
   // videoView.setMediaController(mediaController);
    videoView.setVideoURI(uri);        
    videoView.requestFocus();
    videoView.start();
    
    // video finish listener
    videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

        @Override
        public void onCompletion(MediaPlayer mp) {
            // not playVideo
                        // playVideo();

                        //mp.start();
        	finish();
        }
    });


    }
    }   

