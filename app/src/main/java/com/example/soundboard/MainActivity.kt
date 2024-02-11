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
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //makes button objects to change page
        val page1Btn = findViewById<Button>(R.id.page1)
        val page2Btn = findViewById<Button>(R.id.page2)

        //sets default fragment to page1
        replaceFragment(Page1())

        //event listeners for when buttons are pressed
        page1Btn.setOnClickListener {
            replaceFragment(Page1())
        }
        page2Btn.setOnClickListener {
            replaceFragment(Page2())
        }

    }

    //function to change the fragment to the correct page
    private fun replaceFragment(fragment: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }
}
