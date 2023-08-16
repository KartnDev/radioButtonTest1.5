package com.company.untitled.screen.user;

import io.jmix.core.metamodel.datatype.impl.EnumClass;

import javax.annotation.Nullable;


public enum NewEnum implements EnumClass<String> {

    SD("A"),
    DSAD("B"),
    SDA("C"),
    SDSADSAD("D"),
    SDAD("E"),
    NEW_VALUE1ASDSDSAD("F"),
    ASD("G"),
    D("H"),
    NEW_VALUE3("I"),
    NEW_VALUE4DSADSADSADSADSADSAD("J"),
    NEW_VALUE5("K"),
    NEW_VALUSADSADE6("L"),
    NEW_VALUE7("M"),
    NEW_VALUE8("N"),
    NEW_VALUE9("O"),
    ASDASD("P"),
    NEW_VALUE11("Q"),
    ADSA("R"),
    NEW_VALUE13("S"),
    NEW_VALUE14("T"),
    NEW_VALUE15("U"),
    SADS("V"),
    NEW_VALUE17("W"),
    SDSAD("X"),
    NEW_VALUE19("Y");

    private final String id;

    NewEnum(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Nullable
    public static NewEnum fromId(String id) {
        for (NewEnum at : NewEnum.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}