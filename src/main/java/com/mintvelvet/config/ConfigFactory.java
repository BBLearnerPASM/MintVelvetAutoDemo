package com.mintvelvet.config;

public final class ConfigFactory {  // Not to be inheritant or extend this class

    private ConfigFactory(){}


    public static FrameworkConfig getConfig()
    {

        return org.aeonbits.owner.ConfigFactory.create(FrameworkConfig.class);
    }
}
