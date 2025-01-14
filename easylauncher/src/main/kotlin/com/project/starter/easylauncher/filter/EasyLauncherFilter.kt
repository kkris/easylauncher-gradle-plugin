package com.project.starter.easylauncher.filter

import java.io.Serializable

interface EasyLauncherFilter : Serializable {

    fun apply(canvas: Canvas, adaptive: Boolean = false)
}
