package com.tntask.provider.service.impl;

import com.tntask.provider.service.TestService;

public class TestServiceImpl implements TestService {
    @Override
    public Long getComputeResult(){
        Long result = (long) 123;
        return result;
    }
}
