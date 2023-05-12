package com.suiivpn.app

import com.suiivpn.app.model.Countries

interface OnTapToConnectVariantClickListener {

    fun onBuySubscriptionClick()
    fun onWatchAdClick(country: Countries, position: Int)
    fun onDirectConnect(country: Countries, position: Int)
    fun onConnectClick(country: Countries, position: Int)
}