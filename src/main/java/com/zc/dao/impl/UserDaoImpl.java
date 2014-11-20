package com.zc.dao.impl;

import com.zc.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by netvempive on 2014/11/20.
 */
public class UserDaoImpl implements UserDao{

    @Autowired
    private SqlSession sqlSession;
}
