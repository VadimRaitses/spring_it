package com.bakman.spring_it.config;

//@ConfigurationProperties("springit")
public class SprintItProperties {

    /**
     * this is our custom properties file
     */
    private String welcome = "Hello";

    public String getWelcome() {
        return welcome;
    }

    public void setWelcome(String welcome) {
        this.welcome = welcome;
    }
}
