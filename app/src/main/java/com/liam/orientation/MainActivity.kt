package com.liam.orientation

import android.content.pm.ActivityInfo
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        group.setOnCheckedChangeListener { _, checkedId ->
            run {
                when (checkedId) {
                    R.id.screen_orientation_unspecified -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_UNSPECIFIED
                    R.id.screen_orientation_landscape -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE
                    R.id.screen_orientation_portrait -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT
                    R.id.screen_orientation_user -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_USER
                    R.id.screen_orientation_behind -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_BEHIND
                    R.id.screen_orientation_sensor -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR
                    R.id.screen_orientation_nosensor -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_NOSENSOR
                    R.id.screen_orientation_sensor_landscape -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_LANDSCAPE
                    R.id.screen_orientation_sensor_portrait -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_SENSOR_PORTRAIT
                    R.id.screen_orientation_reverse_landscape -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_LANDSCAPE
                    R.id.screen_orientation_reverse_portrait -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_REVERSE_PORTRAIT
                    R.id.screen_orientation_full_sensor -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR
                    R.id.screen_orientation_user_landscape -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_USER_LANDSCAPE // API 18
                    R.id.screen_orientation_user_portrait -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_USER_PORTRAIT   // API 18
                    R.id.screen_orientation_full_user -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_FULL_USER   // API 18
                    R.id.screen_orientation_locked -> requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_LOCKED // API 18
                    else -> print("else")
                }
            }
        }
    }
}