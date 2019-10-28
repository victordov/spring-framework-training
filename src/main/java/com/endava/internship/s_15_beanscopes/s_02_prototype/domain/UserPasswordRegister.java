package com.endava.internship.s_15_beanscopes.s_02_prototype.domain;

import org.springframework.beans.factory.annotation.Lookup;

import java.nio.charset.StandardCharsets;
import java.util.Random;

public class UserPasswordRegister {

    private SecurityKeyGenerator securityKeyGenerator;

    public String generateSecureKey() {
        final SecurityKeyGenerator securityKeyGenerator = getSecurityKeyGenerator();
        return "" + securityKeyGenerator.hashSeed();
    }

    private static String byteSeed() {
        byte[] arr = new byte[7];
        new Random().nextBytes(arr);
        return new String(arr, StandardCharsets.UTF_8);
    }

    @Lookup
    public SecurityKeyGenerator getSecurityKeyGenerator() {
        throw new RuntimeException("Prototype method, must be overridden by spring");
    }

    public void setSecurityKeyGenerator(SecurityKeyGenerator securityKeyGenerator) {
        this.securityKeyGenerator = securityKeyGenerator;
    }
}
