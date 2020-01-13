package com.worldwarofants;

public enum WWAProperties {
    VERSION("version");

    private String propertyName;

    WWAProperties(String name) {
        setName(name);
    }

    private void setName(String name) {
        propertyName = name;
    }

    @Override
    public String toString() {
        return propertyName;
    }
}
