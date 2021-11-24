package com.example.exo_viewpager_fun.models

import com.example.exo_viewpager_fun.players.AppPlayer

data class ViewState(
    val appPlayer: AppPlayer? = null,
    val attachPlayer: Boolean = false,
    val page: Int = 0,
    val isLoading: Boolean = true,
    val videoData: List<VideoData>? = null
)
