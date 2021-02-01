package com.cfox.mvvmprot.base.strategy.uievent

import androidx.fragment.app.FragmentManager

open class OrigFragmentEvent : FragmentEvent() {

    private lateinit var fragmentManager : FragmentManager
    private lateinit var activityName: String

    internal fun setActivityName(activityName: String) {
        this.activityName = activityName
    }

    fun getActivityName() : String {
        return activityName
    }

    internal fun setFragmentManager(fragmentManager : FragmentManager) {
        this.fragmentManager = fragmentManager
    }

    fun getFragmentManager() : FragmentManager {
        return fragmentManager
    }


}