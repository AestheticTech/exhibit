package com.aesthetictech.android.exhibit;

import android.app.Activity;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.MediaController;
import android.widget.Toast;
import android.widget.VideoView;

public class VideoplayerActivityLoop extends Activity {
private static final Toast Toast = null;

/** Called when the activity is first created. */
@Override
public void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);

//	Toast toast = Toast.makeText(getBaseContext(),  "first", Toast.LENGTH_LONG);
//	toast.show();
			
    setContentView(R.layout.looper);
    VideoView videoView = (VideoView)findViewById(R.id.videoView);
    videoView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
    MediaController mediaController= new MediaController(this);
    mediaController.setAnchorView(videoView);        
    Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.loop);        
    //videoView.setMediaController(mediaController);
   
    videoView.setVideoURI(uri);        
    videoView.requestFocus();
    videoView.start(); 
	
    // activate lights out mode on touch
    videoView.setOnTouchListener(new View.OnTouchListener() {

        public boolean onTouch(View v, MotionEvent event) {
            v.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
            return true;
        }
    });
    
    
    // video finish listener
    videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

        @Override
        public void onCompletion(MediaPlayer mp) {
            // not playVideo
                        // playVideo();

                        mp.start();
        	//finish();
        }
    });


    }

@Override
public void onSaveInstanceState(Bundle outState) {
	super.onSaveInstanceState(outState);
	outState.putString("message", "This is my bundled message");
}

public void onResume() {
	super.onResume();
//	
//	Toast toast = Toast.makeText(getBaseContext(),  "resuming...", Toast.LENGTH_LONG);
//	toast.show();
	
	   setContentView(R.layout.looper);
	    VideoView videoView = (VideoView)findViewById(R.id.videoView);
	    videoView.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
	    MediaController mediaController= new MediaController(this);
	    mediaController.setAnchorView(videoView);        
	    Uri uri=Uri.parse("android.resource://"+getPackageName()+"/"+R.raw.loop);        
	    //videoView.setMediaController(mediaController);
	   
	    videoView.setVideoURI(uri);        
	    videoView.requestFocus();
	    videoView.start(); 
		
	    // activate lights out mode on touch
	    videoView.setOnTouchListener(new View.OnTouchListener() {

	        public boolean onTouch(View v, MotionEvent event) {
	            v.setSystemUiVisibility(View.SYSTEM_UI_FLAG_HIDE_NAVIGATION);
	            return true;
	        }
	    });
	    
	    
	    // video finish listener
	    videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

	        @Override
	        public void onCompletion(MediaPlayer mp) {
	            // not playVideo
	                        // playVideo();

	                        mp.start();
	        	//finish();
	        }
	    });


}

}