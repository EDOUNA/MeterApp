package com.erwin.meterapp.dao.domoticz;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.sql.Timestamp;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    private float AddjMulti;
    private float AddjMulti2;
    private float AddjValue;
    private float AddjValue2;
    private int BatteryLevel;
    private String Counter;
    private float CounterDeliv;
    private String CounterDelivToday;
    private String CounterToday;
    private int CustomImage;
    private String Data;
    private String Description;
    private int Favorite;
    private int HardwareID;
    private String HardwareName;
    private String HardwareType;
    private int HardwareTypeVal;
    private boolean HaveTimeout;
    private String ID;
    private Timestamp LastUpdate;
    private String Name;
    private String Notifications;
    private String PlanID;
    private boolean Protected;
    private boolean ShowNotifications;
    private String SignalLevel;
    private String SubType;
    private int SwitchTypeVal;
    private String Timers;
    private String Type;
    private String TypeImg;
    private int Unit;
    private String Usage;
    private String UsageDeliv;
    private int Used;
    private String XOffset;
    private String YOffset;
    private String idx;

    public float getAddjMulti() {
        return AddjMulti;
    }

    public void setAddjMulti(float addjMulti) {
        AddjMulti = addjMulti;
    }

    public float getAddjMulti2() {
        return AddjMulti2;
    }

    public void setAddjMulti2(float addjMulti2) {
        AddjMulti2 = addjMulti2;
    }

    public float getAddjValue() {
        return AddjValue;
    }

    public void setAddjValue(float addjValue) {
        AddjValue = addjValue;
    }

    public float getAddjValue2() {
        return AddjValue2;
    }

    public void setAddjValue2(float addjValue2) {
        AddjValue2 = addjValue2;
    }

    public int getBatteryLevel() {
        return BatteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        BatteryLevel = batteryLevel;
    }

    public String getCounter() {
        return Counter;
    }

    public void setCounter(String counter) {
        Counter = counter;
    }

    public float getCounterDeliv() {
        return CounterDeliv;
    }

    public void setCounterDeliv(float counterDeliv) {
        CounterDeliv = counterDeliv;
    }

    public String getCounterDelivToday() {
        return CounterDelivToday;
    }

    public void setCounterDelivToday(String counterDelivToday) {
        CounterDelivToday = counterDelivToday;
    }

    public String getCounterToday() {
        return CounterToday;
    }

    public void setCounterToday(String counterToday) {
        CounterToday = counterToday;
    }

    public int getCustomImage() {
        return CustomImage;
    }

    public void setCustomImage(int customImage) {
        CustomImage = customImage;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getFavorite() {
        return Favorite;
    }

    public void setFavorite(int favorite) {
        Favorite = favorite;
    }

    public int getHardwareID() {
        return HardwareID;
    }

    public void setHardwareID(int hardwareID) {
        HardwareID = hardwareID;
    }

    public String getHardwareName() {
        return HardwareName;
    }

    public void setHardwareName(String hardwareName) {
        HardwareName = hardwareName;
    }

    public String getHardwareType() {
        return HardwareType;
    }

    public void setHardwareType(String hardwareType) {
        HardwareType = hardwareType;
    }

    public int getHardwareTypeVal() {
        return HardwareTypeVal;
    }

    public void setHardwareTypeVal(int hardwareTypeVal) {
        HardwareTypeVal = hardwareTypeVal;
    }

    public boolean isHaveTimeout() {
        return HaveTimeout;
    }

    public void setHaveTimeout(boolean haveTimeout) {
        HaveTimeout = haveTimeout;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public Timestamp getLastUpdate() {
        return LastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        LastUpdate = lastUpdate;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getNotifications() {
        return Notifications;
    }

    public void setNotifications(String notifications) {
        Notifications = notifications;
    }

    public String getPlanID() {
        return PlanID;
    }

    public void setPlanID(String planID) {
        PlanID = planID;
    }

    public boolean isProtected() {
        return Protected;
    }

    public void setProtected(boolean aProtected) {
        Protected = aProtected;
    }

    public boolean isShowNotifications() {
        return ShowNotifications;
    }

    public void setShowNotifications(boolean showNotifications) {
        ShowNotifications = showNotifications;
    }

    public String getSignalLevel() {
        return SignalLevel;
    }

    public void setSignalLevel(String signalLevel) {
        SignalLevel = signalLevel;
    }

    public String getSubType() {
        return SubType;
    }

    public void setSubType(String subType) {
        SubType = subType;
    }

    public int getSwitchTypeVal() {
        return SwitchTypeVal;
    }

    public void setSwitchTypeVal(int switchTypeVal) {
        SwitchTypeVal = switchTypeVal;
    }

    public String getTimers() {
        return Timers;
    }

    public void setTimers(String timers) {
        Timers = timers;
    }

    public String getType() {
        return Type;
    }

    public void setType(String type) {
        Type = type;
    }

    public String getTypeImg() {
        return TypeImg;
    }

    public void setTypeImg(String typeImg) {
        TypeImg = typeImg;
    }

    public int getUnit() {
        return Unit;
    }

    public void setUnit(int unit) {
        Unit = unit;
    }

    public String getUsage() {
        return Usage;
    }

    public void setUsage(String usage) {
        Usage = usage;
    }

    public String getUsageDeliv() {
        return UsageDeliv;
    }

    public void setUsageDeliv(String usageDeliv) {
        UsageDeliv = usageDeliv;
    }

    public int getUsed() {
        return Used;
    }

    public void setUsed(int used) {
        Used = used;
    }

    public String getXOffset() {
        return XOffset;
    }

    public void setXOffset(String XOffset) {
        this.XOffset = XOffset;
    }

    public String getYOffset() {
        return YOffset;
    }

    public void setYOffset(String YOffset) {
        this.YOffset = YOffset;
    }

    public String getIdx() {
        return idx;
    }

    public void setIdx(String idx) {
        this.idx = idx;
    }
}