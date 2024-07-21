package com.example.bankaccountprogram

fun main(){

    val akashBankAccount = BankAccount("Akash Kumar",2000.20, 5455415654)

    akashBankAccount.deposit(200.0)
    akashBankAccount.withdraw(1200.00)
    akashBankAccount.deposit(3000.0)
    akashBankAccount.withdraw(2000.00)
    akashBankAccount.deposit(3333.0)
    //println(akashBankAccount.balance)

    akashBankAccount.displayTransactionsHistory()
    println("${akashBankAccount.accountHolder}'s balance of account number ${akashBankAccount.accountNumber} is ${akashBankAccount.balance}")
    akashBankAccount.acctbalance()

}