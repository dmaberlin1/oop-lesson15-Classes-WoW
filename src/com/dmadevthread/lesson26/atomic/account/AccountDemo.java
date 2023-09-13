package com.dmadevthread.lesson26.atomic.account;

public class AccountDemo {
    public static void main(String[] args) throws InterruptedException {
        Account acc1 = new Account(20_000);
        Account acc2 = new Account(30_000);

        AccountThread accountThread1 = new AccountThread(acc1, acc2);
        AccountThread accountThread2 = new AccountThread(acc2, acc1);

        accountThread1.start();
        accountThread2.start();

        accountThread1.join();
        accountThread2.join();
        System.out.println(acc1);
        System.out.println(acc2);
    }
}
