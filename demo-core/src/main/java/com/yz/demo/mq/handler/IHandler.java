package com.yz.demo.mq.handler;

public interface IHandler<T> {
	
    public void handler(T attachment);
}
