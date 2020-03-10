package com.erwin.meterapp.dao.domoticz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;
import java.time.LocalTime;
import java.util.Arrays;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {

    @JsonProperty("ActTime")
    private Timestamp actTime;

    @JsonProperty("AstrTwilightEnd")
    private LocalTime astrTwilightEnd;

    @JsonProperty("AstrTwilightStart")
    private LocalTime astrTwilightStart;

    @JsonProperty("CivTwilightEnd")
    private LocalTime civTwilightEnd;

    @JsonProperty("CivTwilightStart")
    private LocalTime civTwilightStart;

    @JsonProperty("DayLength")
    private LocalTime dayLength;

    @JsonProperty("NautTwilightEnd")
    private LocalTime nautTwilightEnd;

    @JsonProperty("NautTwilightStart")
    private LocalTime nautTwilightStart;

    @JsonProperty("ServerTime")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Timestamp serverTime;

    @JsonProperty("SunAtSouth")
    private LocalTime sunAtSouth;

    @JsonProperty("sunrise")
    private LocalTime sunrise;

    @JsonProperty("sunset")
    private LocalTime sunset;

    @JsonProperty("app_version")
    private String appVersion;

    // Dedicated list for the results
    public Result[] result;

    public Timestamp getActTime() {
        return actTime;
    }

    public void setActTime(Timestamp actTime) {
        this.actTime = actTime;
    }

    public LocalTime getAstrTwilightEnd() {
        return astrTwilightEnd;
    }

    public void setAstrTwilightEnd(LocalTime astrTwilightEnd) {
        this.astrTwilightEnd = astrTwilightEnd;
    }

    public LocalTime getAstrTwilightStart() {
        return astrTwilightStart;
    }

    public void setAstrTwilightStart(LocalTime astrTwilightStart) {
        this.astrTwilightStart = astrTwilightStart;
    }

    public LocalTime getCivTwilightEnd() {
        return civTwilightEnd;
    }

    public void setCivTwilightEnd(LocalTime civTwilightEnd) {
        this.civTwilightEnd = civTwilightEnd;
    }

    public LocalTime getCivTwilightStart() {
        return civTwilightStart;
    }

    public void setCivTwilightStart(LocalTime civTwilightStart) {
        this.civTwilightStart = civTwilightStart;
    }

    public LocalTime getDayLength() {
        return dayLength;
    }

    public void setDayLength(LocalTime dayLength) {
        this.dayLength = dayLength;
    }

    public LocalTime getNautTwilightEnd() {
        return nautTwilightEnd;
    }

    public void setNautTwilightEnd(LocalTime nautTwilightEnd) {
        this.nautTwilightEnd = nautTwilightEnd;
    }

    public LocalTime getNautTwilightStart() {
        return nautTwilightStart;
    }

    public void setNautTwilightStart(LocalTime nautTwilightStart) {
        this.nautTwilightStart = nautTwilightStart;
    }

    public Timestamp getServerTime() {
        return serverTime;
    }

    public void setServerTime(Timestamp serverTime) {
        this.serverTime = serverTime;
    }

    public LocalTime getSunAtSouth() {
        return sunAtSouth;
    }

    public void setSunAtSouth(LocalTime sunAtSouth) {
        this.sunAtSouth = sunAtSouth;
    }

    public LocalTime getSunrise() {
        return sunrise;
    }

    public void setSunrise(LocalTime sunrise) {
        this.sunrise = sunrise;
    }

    public LocalTime getSunset() {
        return sunset;
    }

    public void setSunset(LocalTime sunset) {
        this.sunset = sunset;
    }

    public String getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(String appVersion) {
        this.appVersion = appVersion;
    }

    @Override
    public String toString() {
        return "Main{" +
                "actTime=" + actTime +
                ", astrTwilightEnd=" + astrTwilightEnd +
                ", astrTwilightStart=" + astrTwilightStart +
                ", civTwilightEnd=" + civTwilightEnd +
                ", civTwilightStart=" + civTwilightStart +
                ", dayLength=" + dayLength +
                ", nautTwilightEnd=" + nautTwilightEnd +
                ", nautTwilightStart=" + nautTwilightStart +
                ", serverTime=" + serverTime +
                ", sunAtSouth=" + sunAtSouth +
                ", sunrise=" + sunrise +
                ", sunset=" + sunset +
                ", appVersion='" + appVersion + '\'' +
                ", result=" + Arrays.toString(result) +
                '}';
    }
}