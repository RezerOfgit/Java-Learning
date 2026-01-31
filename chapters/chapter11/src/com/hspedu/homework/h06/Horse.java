package com.hspedu.homework.h06;

import com.sun.corba.se.spi.orbutil.threadpool.Work;

/**
 * @author Re-zero
 * @version 1.0
 */
public class Horse implements Vehicles{
    @Override
    public void work() {
        System.out.println("一般情况下,使用马儿前进...");
    }
}
