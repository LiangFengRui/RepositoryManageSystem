package com.rabbiter.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.rabbiter.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 *
 * @author 梁凤瑞
 * @since 2023-06-30
 */
public interface UserService extends IService<User> {
    IPage pageC(IPage<User> page);

    IPage pageCC(IPage<User> page, Wrapper wrapper);
}
