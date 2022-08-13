package com.abdull.springboot.springtut.datasource.mock

import com.abdull.springboot.springtut.datasource.BankDataSource
import com.abdull.springboot.springtut.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {

    private val banks = listOf(Bank("112", 0.0, 8))
    override fun retrieveBanks(): Collection<Bank> = banks
}