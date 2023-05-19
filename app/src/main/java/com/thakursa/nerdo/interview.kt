package com.thakursa.nerdo

import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.VideoView
import androidx.appcompat.app.AppCompatActivity


class interview : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interview)

        val videoView: VideoView = findViewById<View>(R.id.videoView) as VideoView
        //MediaController mediaController = new MediaController(this);
        // mediaController.setAnchorView(videoView);
        //videoView.setMediaController(mediaController);

        //MediaController mediaController = new MediaController(this);
        // mediaController.setAnchorView(videoView);
        //videoView.setMediaController(mediaController);
        val view = findViewById<View>(R.id.videoView) as VideoView
        val path = "android.resource://" + packageName + "/" + R.raw.interviewer
        view.setVideoURI(Uri.parse(path))
        view.start()
    }
}