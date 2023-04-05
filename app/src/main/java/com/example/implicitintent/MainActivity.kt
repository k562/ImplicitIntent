package com.example.implicitintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.MediaStore
import android.provider.MediaStore.Audio.Media
import androidx.cardview.widget.CardView
import androidx.core.content.ContextCompat
import androidx.core.content.ContextCompat.startActivity

class MainActivity : AppCompatActivity() {

    lateinit var card_web : CardView
    lateinit var card_cam : CardView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        card_web =  findViewById(R.id.Cam_web)
        card_cam =  findViewById(R.id.cam_cam)

            CardWeb()
            CardCam()

    }

     fun CardCam() {

         card_cam.setOnClickListener {

             val intent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
             startActivity(intent)
             finish()

         }

    }



private fun CardWeb() {


    card_web.setOnClickListener {

        val intent = Intent(Intent.ACTION_VIEW, Uri.parse("https://www.google.com/"))
        startActivity(intent)


    }

    }


}