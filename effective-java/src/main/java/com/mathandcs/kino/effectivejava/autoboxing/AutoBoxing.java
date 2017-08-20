package com.mathandcs.kino.effectivejava.autoboxing;

/**
 * Created by dashwang on 8/20/17.
 * <p>
 * ref: http://www.cnblogs.com/danne823/archive/2011/04/22/2025332.html
 */
public class AutoBoxing {

    public static void testInteger() {

        Integer i1 = 127;  // 自动装箱  Integer i1 = Integer.valueOf(1) , i1可以调用Integer类的方法
        Integer i2 = 127;
        // 对于–128到127（默认是127）之间的值，Integer.valueOf(int i) 返回的是缓存的Integer对象（并不是新建对象)
        // true
        System.out.println(i1 == i2);

        Integer i3 = 129;
        Integer i4 = 129;
        // false
        System.out.println(i3 == i4);

        Integer a = new Integer(127);
        Integer b = new Integer(127);
        // 未使用自动装箱, 而是使用原生类的new方法, 所以不会走到Integer.valueOf()的cache, 故内存地址不同
        // false
        System.out.println(a == b);

        // 和primitive类型的==, 是比较的值, 所以都为true
        int i5 = 129;
        int i6 = 129;
        // true
        System.out.println(i5 == i6);

        Integer i7 = 1;
        int i8 = 1;
        // true
        System.out.println(i7 == i8);

        Integer i9 = 129;
        int i10 = 129;
        // true
        System.out.println(i9 == i10);

        // 自动拆箱
        Integer x = new Integer(1);
        int y = x;  // 执行了 int y = x.intValue()
    }

    public static void main(String[] args) {
        testInteger();
    }
}
