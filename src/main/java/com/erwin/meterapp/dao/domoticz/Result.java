package com.erwin.meterapp.dao.domoticz;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Timestamp;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Result {

    @JsonProperty("AddjMulti")
    private float addjMulti;

    @JsonProperty("AddjMulti2")
    private float addjMulti2;

    @JsonProperty("AddjValue")
    private float addjValue;

    @JsonProperty("AddjValue2")
    private float addjValue2;

    @JsonProperty("BatteryLevel")
    private int batteryLevel;

    @JsonProperty("Counter")
    private String counter;

    @JsonProperty("CounterDeliv")
    private float counterDeliv;

    @JsonProperty("CounterDelivToday")
    private String counterDelivToday;

    @JsonProperty("CounterToday")
    private String counterToday;

    @JsonProperty("CustomImage")
    private int customImage;

    @JsonProperty("Data")
    private String data;

    @JsonProperty("Description")
    private String description;

    @JsonProperty("Favorite")
    private int favorite;

    @JsonProperty("HardwareID")
    private int hardwareID;

    @JsonProperty("HardwareName")
    private String hardwareName;

    @JsonProperty("HardwareType")
    private String hardwareType;

    @JsonProperty("HardwareTypeVal")
    private int hardwareTypeVal;

    @JsonProperty("HaveTimeout")
    private boolean haveTimeout;

    @JsonProperty("ID")
    private String id;

    @JsonProperty("LastUpdate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd hh:mm:ss")
    private Timestamp lastUpdate;

    @JsonProperty("Name")
    private String name;

    @JsonProperty("Notifications")
    private String notifications;

    @JsonProperty("PlanID")
    private String planId;

    @JsonProperty("Protected")
    private boolean bProtected;

    @JsonProperty("ShowNotifications")
    private boolean showNotifications;

    @JsonProperty("SignalLevel")
    private String signalLevel;

    @JsonProperty("subType")
    private String SubType;

    @JsonProperty("SwitchTypeVal")
    private int switchTypeVal;

    @JsonProperty("Timers")
    private String timers;

    @JsonProperty("Type")
    private String type;

    @JsonProperty("TypeImg")
    private String typeImg;

    @JsonProperty("Unit")
    private int unit;

    @JsonProperty("Usage")
    private String usage;

    @JsonProperty("UsageDeliv")
    private String usageDeliv;

    @JsonProperty("Used")
    private int used;

    @JsonProperty("XOffset")
    private String xOffset;

    @JsonProperty("YOffset")
    private String yOffset;

    @JsonProperty("idx")
    private int idx;

    public float getAddjMulti() {
        return addjMulti;
    }

    public void setAddjMulti(float addjMulti) {
        this.addjMulti = addjMulti;
    }

    public float getAddjMulti2() {
        return addjMulti2;
    }

    public void setAddjMulti2(float addjMulti2) {
        this.addjMulti2 = addjMulti2;
    }

    public float getAddjValue() {
        return addjValue;
    }

    public void setAddjValue(float addjValue) {
        this.addjValue = addjValue;
    }

    public float getAddjValue2() {
        return addjValue2;
    }

    public void setAddjValue2(float addjValue2) {
        this.addjValue2 = addjValue2;
    }

    public int getBatteryLevel() {
        return batteryLevel;
    }

    public void setBatteryLevel(int batteryLevel) {
        this.batteryLevel = batteryLevel;
    }

    public String getCounter() {
        return counter;
    }

    public void setCounter(String counter) {
        this.counter = counter;
    }

    public float getCounterDeliv() {
        return counterDeliv;
    }

    public void setCounterDeliv(float counterDeliv) {
        this.counterDeliv = counterDeliv;
    }

    public String getCounterDelivToday() {
        return counterDelivToday;
    }

    public void setCounterDelivToday(String counterDelivToday) {
        this.counterDelivToday = counterDelivToday;
    }

    public String getCounterToday() {
        return counterToday;
    }

    public void setCounterToday(String counterToday) {
        this.counterToday = counterToday;
    }

    public int getCustomImage() {
        return customImage;
    }

    public void setCustomImage(int customImage) {
        this.customImage = customImage;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFavorite() {
        return favorite;
    }

    public void setFavorite(int favorite) {
        this.favorite = favorite;
    }

    public int getHardwareID() {
        return hardwareID;
    }

    public void setHardwareID(int hardwareID) {
        this.hardwareID = hardwareID;
    }

    public String getHardwareName() {
        return hardwareName;
    }

    public void setHardwareName(String hardwareName) {
        this.hardwareName = hardwareName;
    }

    public String getHardwareType() {
        return hardwareType;
    }

    public void setHardwareType(String hardwareType) {
        this.hardwareType = hardwareType;
    }

    public int getHardwareTypeVal() {
        return hardwareTypeVal;
    }

    public void setHardwareTypeVal(int hardwareTypeVal) {
        this.hardwareTypeVal = hardwareTypeVal;
    }

    public boolean isHaveTimeout() {
        return haveTimeout;
    }

    public void setHaveTimeout(boolean haveTimeout) {
        this.haveTimeout = haveTimeout;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Timestamp getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNotifications() {
        return notifications;
    }

    public void setNotifications(String notifications) {
        this.notifications = notifications;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public boolean isbProtected() {
        return bProtected;
    }

    public void setbProtected(boolean bProtected) {
        this.bProtected = bProtected;
    }

    public boolean isShowNotifications() {
        return showNotifications;
    }

    public void setShowNotifications(boolean showNotifications) {
        this.showNotifications = showNotifications;
    }

    public String getSignalLevel() {
        return signalLevel;
    }

    public void setSignalLevel(String signalLevel) {
        this.signalLevel = signalLevel;
    }

    public String getSubType() {
        return SubType;
    }

    public void setSubType(String subType) {
        SubType = subType;
    }

    public int getSwitchTypeVal() {
        return switchTypeVal;
    }

    public void setSwitchTypeVal(int switchTypeVal) {
        this.switchTypeVal = switchTypeVal;
    }

    public String getTimers() {
        return timers;
    }

    public void setTimers(String timers) {
        this.timers = timers;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypeImg() {
        return typeImg;
    }

    public void setTypeImg(String typeImg) {
        this.typeImg = typeImg;
    }

    public int getUnit() {
        return unit;
    }

    public void setUnit(int unit) {
        this.unit = unit;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getUsageDeliv() {
        return usageDeliv;
    }

    public void setUsageDeliv(String usageDeliv) {
        this.usageDeliv = usageDeliv;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public String getxOffset() {
        return xOffset;
    }

    public void setxOffset(String xOffset) {
        this.xOffset = xOffset;
    }

    public String getyOffset() {
        return yOffset;
    }

    public void setyOffset(String yOffset) {
        this.yOffset = yOffset;
    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    @Override
    public String toString() {
        return "Result{" +
                "addjMulti=" + addjMulti +
                ", addjMulti2=" + addjMulti2 +
                ", addjValue=" + addjValue +
                ", addjValue2=" + addjValue2 +
                ", batteryLevel=" + batteryLevel +
                ", counter='" + counter + '\'' +
                ", counterDeliv=" + counterDeliv +
                ", counterDelivToday='" + counterDelivToday + '\'' +
                ", counterToday='" + counterToday + '\'' +
                ", customImage=" + customImage +
                ", data='" + data + '\'' +
                ", description='" + description + '\'' +
                ", favorite=" + favorite +
                ", hardwareID=" + hardwareID +
                ", hardwareName='" + hardwareName + '\'' +
                ", hardwareType='" + hardwareType + '\'' +
                ", hardwareTypeVal=" + hardwareTypeVal +
                ", haveTimeout=" + haveTimeout +
                ", id='" + id + '\'' +
                ", lastUpdate=" + lastUpdate +
                ", name='" + name + '\'' +
                ", notifications='" + notifications + '\'' +
                ", planId='" + planId + '\'' +
                ", bProtected=" + bProtected +
                ", showNotifications=" + showNotifications +
                ", signalLevel='" + signalLevel + '\'' +
                ", SubType='" + SubType + '\'' +
                ", switchTypeVal=" + switchTypeVal +
                ", timers='" + timers + '\'' +
                ", type='" + type + '\'' +
                ", typeImg='" + typeImg + '\'' +
                ", unit=" + unit +
                ", usage='" + usage + '\'' +
                ", usageDeliv='" + usageDeliv + '\'' +
                ", used=" + used +
                ", xOffset='" + xOffset + '\'' +
                ", yOffset='" + yOffset + '\'' +
                ", idx='" + idx + '\'' +
                '}';
    }
}