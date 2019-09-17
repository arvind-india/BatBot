package com.harlie.batbot.util

import android.util.Log
import org.greenrobot.eventbus.EventBus

class BluetoothStatusEvent(val message: String) {
    private val TAG = "LEE: <" + BluetoothStatusEvent::class.java!!.getSimpleName() + ">"

    fun post() {
        Log.d(TAG, "post: message=" + message)
        EventBus.getDefault().post(this)
    }
}
