package com.example.mybolckcanary

import android.app.Application
import android.content.Context
import androidx.startup.Initializer

internal class BlockCanaryStartupInitializer : Initializer<BlockCanaryStartupInitializer> {


    override fun create(context: Context) = apply {
        val application = context.applicationContext as Application
//        val autoInstall = application.resources.getBoolean(R.bool.block_canary_auto_install)
        val blockCanaryConfig = BlockCanaryConfig.newBuilder().build()
        BlockCanary
            .install(application, blockCanaryConfig)
    }

    override fun dependencies() = emptyList<Class<out Initializer<*>>>()
}