package com.example.soundboard

import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button


class Page2 : Fragment() {

    private var mediaPlayer:MediaPlayer? = null
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //all sound buttons are defined
        val view =  inflater.inflate(R.layout.fragment_page2, container, false)

        var iphone = view.findViewById<Button>(R.id.iphone)
        var marines = view.findViewById<Button>(R.id.leaving)
        var munch = view.findViewById<Button>(R.id.munch)
        var sad = view.findViewById<Button>(R.id.sad)
        var oh_brother = view.findViewById<Button>(R.id.brother)
        var tacobell = view.findViewById<Button>(R.id.tacobell)
        var tasty_burger = view.findViewById<Button>(R.id.burger)
        var what = view.findViewById<Button>(R.id.what)
        var wilhelm = view.findViewById<Button>(R.id.wilhelm)
        var wort = view.findViewById<Button>(R.id.wort)

        //event listeners are made for each button
        iphone.setOnClickListener {
            playSound(R.raw.iphone_audio)
        }
        marines.setOnClickListener {
            playSound(R.raw.marines_audio)
        }
        munch.setOnClickListener {
            playSound(  R.raw.munch_audio)
        }
        oh_brother.setOnClickListener {
            playSound(R.raw.oh_brother_audio)
        }
        sad.setOnClickListener {
            playSound(R.raw.sad_audio)
        }
        tacobell.setOnClickListener {
            playSound(R.raw.tacobell_bong_audio)
        }
        tasty_burger.setOnClickListener {
            playSound( R.raw.tasty_burger_audio)
        }
        what.setOnClickListener {
            playSound( R.raw.what_audio)
        }
        wilhelm.setOnClickListener {
            playSound( R.raw.wilhelm_audio)
        }
        wort.setOnClickListener {
            playSound(R.raw.wort_audio)
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