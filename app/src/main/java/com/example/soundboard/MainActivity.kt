package com.example.soundboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import android.media.MediaPlayer
import android.net.Uri
import android.widget.Button
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.soundboard.ui.theme.SoundBoardTheme

class MainActivity : ComponentActivity() {
    fun playSound(path: String){
        var mp = MediaPlayer()
        mp.setDataSource(
            this,
            Uri.parse(path)
        )
        mp.prepare()
        mp.start()
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("Successfully set layout")

        var marineButton = findViewById<Button>(R.id.marines)

        println("Objects created")
        marineButton.setOnClickListener {
            println("Inside click listener")
            playSound("android.resource://" + this.packageName + "/" + R.raw.marines_audio)

        }

    }

}
