package ro.tuc.ds2020.dtos.builders;

import ro.tuc.ds2020.dtos.DeviceDTO;
import ro.tuc.ds2020.dtos.DeviceDetailsDTO;
import ro.tuc.ds2020.dtos.PersonDTO;
import ro.tuc.ds2020.dtos.PersonDetailsDTO;
import ro.tuc.ds2020.entities.Devices;
import ro.tuc.ds2020.entities.Person;

public class DeviceBuilder {

    public DeviceBuilder() {
    }

    public static DeviceDTO toDeviceDTO(Devices devices) {
        return new DeviceDTO(devices.getId(), devices.getName(), devices.getCapacity(),devices.getOwner());
    }

    public static DeviceDetailsDTO toDeviceDetailsDTO(Devices devices) {
        return new DeviceDetailsDTO(devices.getId(), devices.getName(), devices.getCapacity(), devices.getOwner());
    }

    public static Devices toEntity(DeviceDetailsDTO deviceDetailsDTO) {
        return new Devices(deviceDetailsDTO.getName(),
                deviceDetailsDTO.getCapacity(),
                deviceDetailsDTO.getOwner());
    }
}
