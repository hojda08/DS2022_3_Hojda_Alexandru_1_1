package ro.tuc.ds2020.dtos;

import ro.tuc.ds2020.dtos.validators.annotation.AgeLimit;

import javax.validation.constraints.NotNull;
import java.util.Objects;
import java.util.UUID;

public class DeviceDetailsDTO {

    private UUID id;
    @NotNull
    private String name;
    @NotNull
    private String capacity;
    @NotNull
    private String owner;

    public DeviceDetailsDTO() {
    }

    public DeviceDetailsDTO(String name,String capacity,String owner) {
        this.name = name;
        this.capacity = capacity;
        this.owner = owner;
    }

    public DeviceDetailsDTO(UUID id,String name,String capacity,String owner) {
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
        DeviceDetailsDTO that = (DeviceDetailsDTO) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(capacity, that.capacity) &&
                Objects.equals(owner, that.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, owner);
    }
}
