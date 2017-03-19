package com.wanbao.model;

/**
 * Created by wanbao on 2017/3/19.
 */
public class Country extends  BaseEntity {

    private  String countryname;
    private  String countrycode;

    public String getCountryname() {
        return countryname;
    }

    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    public String getCountrycode() {
        return countrycode;
    }

    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}
