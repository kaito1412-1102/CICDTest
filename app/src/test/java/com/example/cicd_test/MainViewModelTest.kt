package com.example.cicd_test

import org.junit.Test

class MainViewModelTest {
    private val viewModel = MainViewModel()

    @Test
    fun testCheckValue_evenNumber_returnsTrue() {
        val result =viewModel.checkValue(2)
        assert(result)
    }

    @Test
    fun testCheckValue_oddNumber_returnsFalse() {
        val result = viewModel.checkValue(2)
        assert(!result)
    }
}