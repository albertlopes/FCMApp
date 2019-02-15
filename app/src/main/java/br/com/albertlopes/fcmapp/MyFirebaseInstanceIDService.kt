package br.com.albertlopes.fcmapp

import android.util.Log
import com.google.firebase.iid.FirebaseInstanceId
import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIDService : FirebaseInstanceIdService(){


    override fun onTokenRefresh() {
        super.onTokenRefresh()

        Log.i("TOKEN",FirebaseInstanceId.getInstance().token)
    }

}