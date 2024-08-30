package com.joshaby.creationalPatterns.builder.structure;

public class Product2 {

    private String featureA;

    private String featureB;

    private String featureZ;

    public String getFeatureA() {
        return featureA;
    }

    public void setFeatureA(String featureA) {
        this.featureA = featureA;
    }

    public String getFeatureB() {
        return featureB;
    }

    public void setFeatureB(String featureB) {
        this.featureB = featureB;
    }

    public String getFeatureZ() {
        return featureZ;
    }

    public void setFeatureZ(String featureZ) {
        this.featureZ = featureZ;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "featureA='" + featureA + '\'' +
                ", featureB='" + featureB + '\'' +
                ", featureZ='" + featureZ + '\'' +
                '}';
    }
}
