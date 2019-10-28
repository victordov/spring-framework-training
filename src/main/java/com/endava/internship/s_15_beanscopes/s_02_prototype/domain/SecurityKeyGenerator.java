package com.endava.internship.s_15_beanscopes.s_02_prototype.domain;

import java.util.Date;
import java.util.Random;

public class SecurityKeyGenerator {

    private long hashSeed;

    public SecurityKeyGenerator() {
        hashSeed = new Random(new Date().getTime()).nextLong();
    }

    public long hashSeed() {
        return hashSeed;
    }
}
