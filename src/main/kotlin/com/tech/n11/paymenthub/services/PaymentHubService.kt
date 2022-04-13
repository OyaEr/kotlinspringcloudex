package com.tech.n11.paymenthub.services

import org.springframework.stereotype.Service

@Service
class PaymentHubService {

    fun getPaymentHubMono(): String {
        return "hello paymenthub service"
    }


    fun getPaymentHubFlux(): Array<Int>  {
        val array= arrayOf(1,2,3)
        return array
    }
}