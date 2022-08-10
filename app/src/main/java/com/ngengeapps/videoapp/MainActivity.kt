package com.ngengeapps.videoapp

import android.os.Bundle
import android.widget.Chronometer
import android.widget.ImageButton
import androidx.appcompat.app.AppCompatActivity
import androidx.camera.view.PreviewView
import androidx.core.view.WindowCompat
import com.ngengeapps.videoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var recordVideoButton:ImageButton
    private lateinit var pauseVideoRecordButton:ImageButton
    private lateinit var stopVideoRecordButton:ImageButton
    private lateinit var previewView: PreviewView
    private lateinit var flipCameraButton:ImageButton
    private lateinit var videoRecordTimer:Chronometer

    private lateinit var binding: ActivityMainBinding

    private fun initViews() {
        recordVideoButton = binding.videoCaptureButton
        pauseVideoRecordButton = binding.pauseVideoRecordButton
        stopVideoRecordButton = binding.stopVideoCaptureButton
        previewView = binding.previewView
        flipCameraButton = binding.flipCameraButton
        videoRecordTimer = binding.videoTimer
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        WindowCompat.setDecorFitsSystemWindows(window, false)
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initViews()

    }



}