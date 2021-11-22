package com.example.exo_viewpager_fun.players

import com.google.android.exoplayer2.ExoPlayer
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.Player

val ExoPlayer.currentMediaItems: List<MediaItem> get() {
    return List(mediaItemCount, ::getMediaItemAt)
}

fun ExoPlayer.loopVideos() {
    repeatMode = Player.REPEAT_MODE_ONE
}
