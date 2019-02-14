package br.com.albertlopes.fcmapp

import com.google.firebase.iid.FirebaseInstanceIdService

class MyFirebaseInstanceIDService : FirebaseInstanceIdService(){


    override fun onTokenRefresh() {
        super.onTokenRefresh()
    }

}