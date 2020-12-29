package com.zs.ssm.dao;

public interface BaseMappper<T> {
    public void add(T t);
    public void del(T t);
    public void replace(T t);
    public T find(T t);
}
