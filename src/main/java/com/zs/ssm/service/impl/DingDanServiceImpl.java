package com.zs.ssm.service.impl;

import com.zs.ssm.dao.DingDanMapper;
import com.zs.ssm.domain.DingDan;
import com.zs.ssm.service.DingDanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("dingDanService")
public class DingDanServiceImpl extends BaseServiceImpl<DingDan> implements DingDanService {
    @Autowired
    private DingDanMapper danMapper;
    public List<DingDan> findAll() {
        return danMapper.findAllDingDan();
    }
}
