package com.example.cicd_test


class MainViewModel {

    fun checkValue(value: Int): Boolean {
        if (value % 2 == 0) {
            return true
        } else {
            return false
        }
    }
}