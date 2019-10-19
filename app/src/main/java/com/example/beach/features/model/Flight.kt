package com.example.beach.features.model

import java.io.Serializable
import java.text.DateFormat
import java.text.SimpleDateFormat
import java.util.*

/*
Copyright (c) 2019 Kotlin Data Classes Generated from JSON powered by http://www.json2kotlin.com

Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the "Software"), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.

For support, please feel free to contact me at https://www.linkedin.com/in/syedabsar */


open class Flight(
    var price: Int,
    var airline: String,
    var departure_date: String,
    var arrival_date: String,
    var departure_airport: String,
    var arrival_airport: String
) : Serializable {

    fun convertDate(dateTime: String): String {
        val dateFormat: DateFormat = SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US)
        val date =
            dateFormat.parse(dateTime)//You will get date object relative to server/client timezone wherever it is parsed
        val formatter: DateFormat =
            SimpleDateFormat(
                "yyyy-MM-dd HH:mm",
                Locale.US
            ) //If you need time just put specific format for time like 'HH:mm:ss'
        return formatter.format(date)
    }
}