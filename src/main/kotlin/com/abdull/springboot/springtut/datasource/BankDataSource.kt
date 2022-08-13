package com.abdull.springboot.springtut.datasource

import com.abdull.springboot.springtut.model.Bank

interface BankDataSource {

    fun retrieveBanks(): Collection<Bank>
}