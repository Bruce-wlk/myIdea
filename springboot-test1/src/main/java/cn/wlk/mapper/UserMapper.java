package cn.wlk.mapper;

import cn.wlk.model.User;

public interface UserMapper {
    public void insert(String name,String stuClass);
    public User findByName(String name);
}
