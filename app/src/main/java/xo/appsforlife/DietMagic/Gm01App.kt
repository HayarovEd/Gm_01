package xo.appsforlife.DietMagic

import android.app.Application
import com.appsflyer.AppsFlyerLib
import com.onesignal.OneSignal
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import xo.appsforlife.DietMagic.data.APPS_FLYER
import xo.appsforlife.DietMagic.data.ONE_SIGNAL

class Gm01App: Application() {
    override fun onCreate() {
        super.onCreate()
        OneSignal.initWithContext(this, ONE_SIGNAL)
        CoroutineScope(Dispatchers.IO).launch {
            OneSignal.Notifications.requestPermission(true)
        }
        AppsFlyerLib.getInstance().init(APPS_FLYER, null, this)
        AppsFlyerLib.getInstance().start(this)
    }
}