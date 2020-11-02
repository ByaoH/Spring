package com.l.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

//用此类自动生成代理
public class ProxyInvocationHandler implements InvocationHandler {
    //    被代理的接口
    private Rent rent;

    public void setRent(Rent rent) {
        this.rent = rent;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), rent.getClass().getInterfaces(), this);
    }

    //    创建代理实例， 返回结果
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        seeHouse();
//        动态代理的本质， 使用反射实现
        fare();
        Object invoke = method.invoke(rent, objects);
        hetong();
        return invoke;
    }

    //    看房
    public void seeHouse() {
        System.out.println("看房");
    }

    //    收中介费
    public void fare() {
        System.out.println("收中介费");
    }

    //    合同
    public void hetong() {
        System.out.println("合同");
    }
}
