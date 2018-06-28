package net.gotev.baselibrarydemo

import android.app.Application
import android.util.Log

/**
 * @author Aleksandar Gotev
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        Log.i("APP", "net.gotev.baselibrarydemo.App initialized")
    }
}
