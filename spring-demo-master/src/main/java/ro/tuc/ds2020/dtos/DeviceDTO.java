package ro.tuc.ds2020.dtos;

import org.springframework.hateoas.RepresentationModel;

import java.util.Objects;
import java.util.UUID;

public class DeviceDTO extends RepresentationModel<DeviceDTO> {

    private UUID id;
    private String name;
    private String capacity;
    private String owner;

    public DeviceDTO() {
    }

    public DeviceDTO(UUID id, String name, String capacity, String owner) {
        this.id = id;
        this.name = name;
        this.capacity = capacity;
        this.owner = owner;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DeviceDTO deviceDTO = (DeviceDTO) o;
        return Objects.equals(name, deviceDTO.name) &&
                Objects.equals(capacity, deviceDTO.capacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity);
    }
}
