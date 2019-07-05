package com.WildCodeSchool;

// This class define a Wilder with this name, and it's awaritude
public class Wilder {

    private String firstname;
    private boolean aware;


    public Wilder(String firstname, boolean aware) {
        this.firstname = firstname;
        this.aware = aware;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public boolean isAware() {
        return aware;
    }

    public void setAware(boolean aware) {
        this.aware = aware;
    }

    public String whoAmI() {
        String strIsIt= isAware() ? "je suis":"je ne suis pas";
        String strRet= "Je m'appelle " + getFirstname() + " et " + strIsIt + " aware.";
        return(strRet);
    }

}
