package com.abdull.springboot.springtut.service

import com.abdull.springboot.springtut.datasource.BankDataSource
import com.abdull.springboot.springtut.model.Bank
import org.springframework.stereotype.Service


@Service
class BankService(private val bankDataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return bankDataSource.retrieveBanks()
    }
}