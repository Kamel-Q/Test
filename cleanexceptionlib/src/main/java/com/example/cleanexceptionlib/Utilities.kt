package com.example.cleanexceptionlib

import android.content.Context

class Utilities {

    companion object {
        //        @Throws(Exception::class)
        fun getDataDir(context: Context, packageName: String): String {
            return context.packageManager.getPackageInfo(packageName, 0).applicationInfo.dataDir
        }
    }
}