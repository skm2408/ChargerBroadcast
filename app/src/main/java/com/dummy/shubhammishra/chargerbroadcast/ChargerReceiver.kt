package com.dummy.shubhammishra.chargerbroadcast

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast
import com.muddzdev.styleabletoastlibrary.StyleableToast

class ChargerReceiver : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        if(intent.action==(Intent.ACTION_POWER_CONNECTED))
        {
            StyleableToast.makeText(context,"Charger Connnected", Toast.LENGTH_SHORT,R.style.myToastYes).show()
        }else if(intent.action==Intent.ACTION_POWER_DISCONNECTED)
        {
            StyleableToast.makeText(context,"Charger Disconnnected", Toast.LENGTH_SHORT,R.style.myToastNot).show()
        }
    }
}
