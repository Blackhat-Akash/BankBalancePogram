package com.example.bankaccountprogram

class BankAccount(var accountHolder: String, var balance: Double, var accountNumber: Long) {

    private val transactionsHistory = mutableListOf<String>()

    fun deposit(amount: Double){
        balance += amount
        transactionsHistory.add("$accountHolder Deposited $amount")

    }

    fun withdraw(amount: Double){
        if (amount <= balance){
            balance -= amount
            transactionsHistory.add("$accountHolder withdrew the amount of $amount")
        }else{
            println("You do not have enough balance to withdraw $amount")
        }

    }

    fun displayTransactionsHistory(){
        println("Transactions History for $accountHolder on account number  $accountNumber is:")
        for (transacton in transactionsHistory){
            println(transacton)
        }

    }

    fun acctbalance(){
        println("The total balance is $balance")
    }
}