package com.mall.em.mapper;

import com.mall.em.entity.Carousel;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

public interface CarouselMapper extends BaseMapper<Carousel> {

    List<Carousel> getAllCarousel();
}
