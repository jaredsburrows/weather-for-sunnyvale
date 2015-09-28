package com.piotr.weatherforpoznan;

import com.google.gson.annotations.SerializedName;

public class Weather {
    @SerializedName("id")
    String id;
    @SerializedName("main")
    String main;
    @SerializedName("description")
    String description;
    @SerializedName("icon")
    String icon;
    @SerializedName("speed")
    String speed;
    @SerializedName("deg")
    String deg;

    @SerializedName("temp")
    String temp;
    @SerializedName("temp_min")
    String temp_min;
    @SerializedName("temp_max")
    String temp_max;
    @SerializedName("pressure")
    String pressure;
    @SerializedName("sea_level")
    String sea_level;
    @SerializedName("grnd_level")
    String grnd_level;
    @SerializedName("humidity")
    String humidity;

    public String getTemp() {
        return temp;
    }

    public String getTemp_min() {
        return temp_min;
    }

    public String getTemp_max() {
        return temp_max;
    }

    public String getPressure() {
        return pressure;
    }

    public String getSea_level() {
        return sea_level;
    }

    public String getGrnd_level() {
        return grnd_level;
    }

    public String getHumidity() {
        return humidity;
    }


    public String getSpeed() {
        return speed;
    }

    public String getDeg() {
        return deg;
    }


    public String getId() {
        return id;
    }

    public String getMain() {
        return main;
    }

    public String getDescription() {
        return description;
    }

    public String getIcon() {
        return icon;
    }

}