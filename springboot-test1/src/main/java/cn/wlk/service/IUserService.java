package cn.wlk.service;

import cn.wlk.model.User;

public interface IUserService {
    public void register(String name,String stuClass);
    public User findByName(String name);
}
