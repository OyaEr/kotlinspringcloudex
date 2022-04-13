package com.tech.n11.paymenthub.controllers

import com.tech.n11.paymenthub.services.PaymentHubService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Flux
import reactor.core.publisher.Mono
import java.sql.DriverManager.println

@RestController
class PaymentHubController(val paymentHubService: PaymentHubService){

    @GetMapping("/paymentMono")
    fun getPaymentMono(): Mono<String>  {
         return Mono.just(paymentHubService.getPaymentHubMono()).log()
    }

    @GetMapping("/paymentFlux")
    fun getPaymentFlux(): Flux<Array<Int>> {
        return Flux.just(paymentHubService.getPaymentHubFlux()).log()
    }

    @GetMapping("/paymentError") //Tek bir array olduğu için
    fun getPaymentMonoError(): Mono<Array<Int>>  {
        return Mono.just(paymentHubService.getPaymentHubFlux()).log()
    }
}