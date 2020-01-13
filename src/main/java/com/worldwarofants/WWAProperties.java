package com.worldwarofants;

public enum WWAProperties {
    PATH_PROPERTIES("wwa.properties"),
    VERSION("version"),
    LOCATION_ASSETS("assets");

    private String propertyName;

    WWAProperties(String name) {
        setName(name);
    }

    private void setName(String name) {
        propertyName = name;
    }

    public String getName() {
        return propertyName;
    }
}
