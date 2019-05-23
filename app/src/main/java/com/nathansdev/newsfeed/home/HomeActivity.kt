package com.nathansdev.newsfeed.home

import android.os.Bundle
import com.nathansdev.newsfeed.R
import com.nathansdev.newsfeed.base.BaseActivity

/**
 *  Home screen displays news feeds
 */
class HomeActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        setUpViews()
    }

    fun setUpViews() {

    }
}
