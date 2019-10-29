package com.all.mam.popDg

/**
 * *
 * *          ____  ____ _____ ___   ____
 * *         | \ \ / / |/ _  || \ \ / / |
 * *         | |\ V /| | (_| || |\ V /| |
 * *         |_| \_/ |_|\__,_||_| \_/ |_|
 * *
 * Created by Mohammad Ali Mirshahbazi
 */
import android.app.Application
import android.content.Context

import uk.co.chrisjenx.calligraphy.CalligraphyConfig

class AppController : Application() {

    override fun onCreate() {
        super.onCreate()
        appContext = this
        CalligraphyConfig.initDefault(CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/IRANSansMobile(FaNum)_Light.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        )
    }

    override fun attachBaseContext(base: Context) {
        super.attachBaseContext(base)

    }

    companion object {
        var appContext: AppController? = null
            private set
    }

}