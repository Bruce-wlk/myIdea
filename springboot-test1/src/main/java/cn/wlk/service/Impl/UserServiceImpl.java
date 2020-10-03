package cn.wlk.service.Impl;

import cn.wlk.mapper.UserMapper;
import cn.wlk.model.User;
import cn.wlk.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public void register(String name, String stuClass) {
        userMapper.insert(name,stuClass);
//        int i = 10/0;

    }

    @Override
    public User findByName(String name) {
        return userMapper.findByName(name);
    }
}
