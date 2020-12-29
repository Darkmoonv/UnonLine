package com.zs.ssm.service;

import com.zs.ssm.domain.DingDan;

import java.util.List;

public interface DingDanService extends BaseService<DingDan> {
    public List<DingDan> findAll();
}
