package com.ahernaez.signaturecapture.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ahernaez.signaturecapture.R
import com.ahernaez.signaturecapture.custom_view.SignatureCaptureView
import com.ahernaez.signaturecapture.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpSignatureCaptureView()
    }

    private fun setUpSignatureCaptureView(){

        val signatureCaptureView = SignatureCaptureView(this, null)
        binding.signatureCaptureViewParentLayout.addView(signatureCaptureView)

        binding.clearBtn.setOnClickListener {
            signatureCaptureView.ClearCanvas()
        }
    }
}