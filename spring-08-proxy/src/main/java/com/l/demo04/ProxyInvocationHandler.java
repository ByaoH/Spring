package com.l.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {
    //    被代理的接口
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    //    生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    //处理代理实例， 并返回结果
    public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
        System.out.println(method.getName());
        return method.invoke(target, objects);
    }
}
