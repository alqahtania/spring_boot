package com.abdull.springboot.springtut.service

import com.abdull.springboot.springtut.datasource.BankDataSource
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Test

internal class BankServiceTest{

    private val bankDataSource: BankDataSource = mockk(relaxed = true)

    private val bankService = BankService(bankDataSource)

    @Test
    fun `should call its data source to retrieve banks`() {
        // act
        val bank = bankService.getBanks()
        // assert
        verify(exactly = 1){ bankDataSource.retrieveBanks() }
    }
}