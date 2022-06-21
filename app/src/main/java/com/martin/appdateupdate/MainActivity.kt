package com.martin.appdateupdate

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.martin.appdateupdate.databinding.ActivityMainBinding
import java.text.SimpleDateFormat
import java.util.*

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    val TAG = "Activity_Lifecycle"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.DateTv.text = getCurrentTime()

        Log.i(TAG , "Activity on Create")
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG , "Activity on Start")
    }

    override fun onResume() {
        super.onResume()
        binding.DateTv.text = getCurrentTime()
        Log.i(TAG , "Activity on Resume")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG , "Activity on Pause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG , "Activity on Stop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG , "Activity on Destroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG , "Activity on Restart")
    }

    private fun getCurrentTime() :String {
        val cInstance = Calendar.getInstance()
        val sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val date = sdf.format(cInstance.time)
        return date
    }

}