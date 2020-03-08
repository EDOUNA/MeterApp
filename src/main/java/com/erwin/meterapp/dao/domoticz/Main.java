package com.erwin.meterapp.dao.domoticz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Time;
import java.sql.Timestamp;
import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {

    private Timestamp ActTime;
    private Time AstrTwilightEnd;
    private Time AstrTwilightStart;
    private Time CivTwilightEnd;
    private Time CivTwilightStart;
    private Time DayLength;
    private Time NautTwilightEnd;
    private Time NautTwilightStart;
    private Timestamp ServerTime;
    private Time SunAtSouth;
    private Time Sunrise;
    private Time Sunset;

    @JsonProperty("app_version")
    private String AppVersion;

    // Dedicated list for the results
    public List<Result> resultList;

    public Timestamp getActTime() {
        return ActTime;
    }

    public void setActTime(Timestamp actTime) {
        ActTime = actTime;
    }

    public Time getAstrTwilightEnd() {
        return AstrTwilightEnd;
    }

    public void setAstrTwilightEnd(Time astrTwilightEnd) {
        AstrTwilightEnd = astrTwilightEnd;
    }

    public Time getAstrTwilightStart() {
        return AstrTwilightStart;
    }

    public void setAstrTwilightStart(Time astrTwilightStart) {
        AstrTwilightStart = astrTwilightStart;
    }

    public Time getCivTwilightEnd() {
        return CivTwilightEnd;
    }

    public void setCivTwilightEnd(Time civTwilightEnd) {
        CivTwilightEnd = civTwilightEnd;
    }

    public Time getCivTwilightStart() {
        return CivTwilightStart;
    }

    public void setCivTwilightStart(Time civTwilightStart) {
        CivTwilightStart = civTwilightStart;
    }

    public Time getDayLength() {
        return DayLength;
    }

    public void setDayLength(Time dayLength) {
        DayLength = dayLength;
    }

    public Time getNautTwilightEnd() {
        return NautTwilightEnd;
    }

    public void setNautTwilightEnd(Time nautTwilightEnd) {
        NautTwilightEnd = nautTwilightEnd;
    }

    public Time getNautTwilightStart() {
        return NautTwilightStart;
    }

    public void setNautTwilightStart(Time nautTwilightStart) {
        NautTwilightStart = nautTwilightStart;
    }

    public Timestamp getServerTime() {
        return ServerTime;
    }

    public void setServerTime(Timestamp serverTime) {
        ServerTime = serverTime;
    }

    public Time getSunAtSouth() {
        return SunAtSouth;
    }

    public void setSunAtSouth(Time sunAtSouth) {
        SunAtSouth = sunAtSouth;
    }

    public Time getSunrise() {
        return Sunrise;
    }

    public void setSunrise(Time sunrise) {
        Sunrise = sunrise;
    }

    public Time getSunset() {
        return Sunset;
    }

    public void setSunset(Time sunset) {
        Sunset = sunset;
    }

    public String getAppVersion() {
        return AppVersion;
    }

    public void setAppVersion(String app_version) {
        this.AppVersion = app_version;
    }
}