package com.qhala.util

object Keys {

    init {
        System.loadLibrary("native-lib")
    }

    external fun apiKey(): String
}