package com.zs.ssm.dao;

import com.zs.ssm.domain.DingDan;

import java.util.List;

public interface DingDanMapper extends BaseMappper<DingDan> {
    //查找所有订单
    public List<DingDan> findAllDingDan();
}
