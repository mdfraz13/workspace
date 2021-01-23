package com.java8.examples;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.concurrent.TimeUnit;

public class DynamicProxyInJava
{

	public static void main(String[] args) {
		Target t = new Target();
		t.sum(10, 20);

		DynamicProxy dynamicProxy = new DynamicProxy();

		Target o = (Target) Proxy.newProxyInstance(
			DynamicProxy.class.getClassLoader(),
			new Class[]{Target.class}, dynamicProxy);
		o.sum(10, 20);

	}
}
class DynamicProxy implements InvocationHandler {

	@Override
	public Object invoke(Object o, Method method, Object[] objects) throws Throwable {
		System.out.println("------ time ---- "+ System.currentTimeMillis());
		return null;
	}
}
class Target {

	public Integer sum(Integer a , Integer b) {
		try {
			TimeUnit.SECONDS.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return a + b;
	}

}