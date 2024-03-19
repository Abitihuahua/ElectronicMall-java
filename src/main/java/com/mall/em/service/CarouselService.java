package com.mall.em.service;

import com.mall.em.entity.Carousel;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mall.em.mapper.CarouselMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class CarouselService extends ServiceImpl<CarouselMapper, Carousel> {

    @Resource
    private CarouselMapper carouselMapper;

    public List<Carousel> getAllCarousel() {
        return carouselMapper.getAllCarousel();
    }
}
