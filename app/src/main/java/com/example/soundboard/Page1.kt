package com.example.soundboard

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

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

class Page1 : Fragment() {

    private var mediaPlayer:MediaPlayer? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view =  inflater.inflate(R.layout.fragment_page1, container, false)

        //all sound buttons are defined
        var alarm = view.findViewById<Button>(R.id.alarm)
        var baby_button = view.findViewById<Button>(R.id.baby)
        var boing_button = view.findViewById<Button>(R.id.boing)
        var bonk_button = view.findViewById<Button>(R.id.bonk)
        var car_button = view.findViewById<Button>(R.id.car_horn)
        var running_button = view.findViewById<Button>(R.id.cartoon_run)
        var applause_button = view.findViewById<Button>(R.id.applause)
        var explosion_button = view.findViewById<Button>(R.id.explosion)
        var goofy_button = view.findViewById<Button>(R.id.yell)
        var horse_button = view.findViewById<Button>(R.id.horse)


        //event listeners are made for each button
        alarm.setOnClickListener {
            playSound(R.raw.alarm_audio)
        }
        baby_button.setOnClickListener {
            playSound(R.raw.baby_crying_audio)
        }
        boing_button.setOnClickListener {
            playSound(  R.raw.boing_audio)
        }
        bonk_button.setOnClickListener {
            playSound(R.raw.bonk_audio)
        }
        car_button.setOnClickListener {
            playSound(R.raw.car_horn_audio)
        }
        running_button.setOnClickListener {
            playSound(R.raw.cartoon_run_audio)
        }
        applause_button.setOnClickListener {
            playSound( R.raw.clapping_audio)
        }
        explosion_button.setOnClickListener {
            playSound( R.raw.explosion_audio)
        }
        goofy_button.setOnClickListener {
            playSound( R.raw.goofy_audio)
        }
        horse_button.setOnClickListener {
            playSound(R.raw.horse_audio)
        }

        return view
    }

    //function takes ID for sound and plays the correct sound
    fun playSound(soundResourceId: Int){

        // Create a new MediaPlayer instance with the provided sound resource ID
        mediaPlayer = MediaPlayer.create(requireContext(), soundResourceId)

        // Start playing the sound
        mediaPlayer?.start()
    }



}