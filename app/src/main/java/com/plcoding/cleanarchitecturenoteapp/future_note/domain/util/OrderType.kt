package com.plcoding.cleanarchitecturenoteapp.future_note.domain.util

sealed class OrderType {
    object Ascending: OrderType()
    object Descending: OrderType()
}
