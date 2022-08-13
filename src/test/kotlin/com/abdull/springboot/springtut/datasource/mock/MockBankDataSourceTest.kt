package com.abdull.springboot.springtut.datasource.mock

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    private val mockBankDS = MockBankDataSource()
    @Test
    fun `should return a non empty bank collection`() {

        // act
        val bank = mockBankDS.retrieveBanks()

        // assert

        assertThat(bank).isNotEmpty
    }

    @Test
    fun `should make sure all banks have account number`() {

        // act
        val banks = mockBankDS.retrieveBanks()

        // assert
        assertThat(banks).allMatch { it.accountNumber.isNotBlank() }
    }
}