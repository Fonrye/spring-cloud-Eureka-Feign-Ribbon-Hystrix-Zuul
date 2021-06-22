package com.shop.consumer8085.service.impl;

import com.shop.api.entity.GoodsActivity;
import com.shop.consumer8085.service.ActivityService;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ActivityServiceImpl implements ActivityService {
    @Override
    public List<GoodsActivity> list(GoodsActivity activity) {
        ArrayList<GoodsActivity> goodsActivityList = new ArrayList<>();
        for (int i = 0; i < 30; i++) {
            goodsActivityList.add(new GoodsActivity());
        }
        return goodsActivityList;

    }

    @Override
    public boolean add(GoodsActivity activity) {
        return false;
    }

    @Override
    public boolean del(Integer activityId) {
        return false;
    }

    @Override
    public boolean update(GoodsActivity activity) {
        return false;
    }

}