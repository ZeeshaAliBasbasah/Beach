package com.example.beach

import org.mockito.MockitoAnnotations


abstract class BaseTest() {


    init {
        MockitoAnnotations.initMocks(this)
    }

}