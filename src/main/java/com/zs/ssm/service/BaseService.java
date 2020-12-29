package com.zs.ssm.service;

public interface BaseService<T> {
    public void add(T t);
    public void del(T t);
    public void replace(T t);
    public T find(T t);
}
