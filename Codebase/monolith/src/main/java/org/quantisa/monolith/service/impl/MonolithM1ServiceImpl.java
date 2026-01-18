package org.quantisa.monolith.service.impl;

import org.quantisa.monolith.service.MonolithM1Service;
import org.springframework.stereotype.Service;

@Service
public class MonolithM1ServiceImpl implements MonolithM1Service {


    @Override
    public String getMessage() {
        return "Hello Service";
    }
}
