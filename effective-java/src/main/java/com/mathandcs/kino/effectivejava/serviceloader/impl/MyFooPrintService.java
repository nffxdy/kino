package com.mathandcs.kino.effectivejava.serviceloader.impl;

import com.mathandcs.kino.effectivejava.serviceloader.MyPrintService;

/**
 * Created by dash on 12/7/17.
 */
public class MyFooPrintService implements MyPrintService{
    @Override
    public void print() {
        System.out.println("foo");
    }
}
