package com.task

/**
 * Created by TruyenDev
 */
sealed class DataStatus {
    object Success : DataStatus()
    object Fail : DataStatus()
    object EmptyResponse : DataStatus()
}
