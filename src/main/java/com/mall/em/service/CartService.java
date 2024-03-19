package com.mall.em.service;

import com.mall.em.entity.Cart;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.em.mapper.CartMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class CartService extends ServiceImpl<CartMapper, Cart> {

    @Resource
    private CartMapper cartMapper;

    public List<Map<String,Object>> selectByUserId(Long userId) {
         return cartMapper.selectByUserId(userId);
    }
}
