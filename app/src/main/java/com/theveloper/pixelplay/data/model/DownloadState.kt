package com.theveloper.pixelplay.data.model

data class DownloadState(
    val id: String,
    val isDownloading: Boolean = false,
    val progress: Float = 0f,
    val error: String? = null,
    val isComplete: Boolean = false
)
