package com.erwin.meterapp.service;

import com.erwin.meterapp.persistence.model.DeviceMeasurementsStatsModel;
import com.erwin.meterapp.persistence.model.DevicesModel;
import com.erwin.meterapp.persistence.repository.DeviceMeasurementsStatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class DeviceMeasurementsStatsService {
    @Autowired
    private DeviceMeasurementsStatsRepository deviceMeasurementsStatsRepository;

    @Cacheable("getStats")
    public DeviceMeasurementsStatsModel getStats(DevicesModel device, Integer hour) {
        DeviceMeasurementsStatsModel deviceStats = deviceMeasurementsStatsRepository.findByDeviceAndTariffAndHour(device.getId(), device.getTariff().getId(), hour);
        return deviceStats;
    }
}
