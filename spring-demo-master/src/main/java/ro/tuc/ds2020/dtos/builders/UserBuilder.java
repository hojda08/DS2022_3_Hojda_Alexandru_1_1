package ro.tuc.ds2020.dtos.builders;

import ro.tuc.ds2020.dtos.UserDTO;
import ro.tuc.ds2020.dtos.UserDetailsDTO;
import ro.tuc.ds2020.entities.Users;

public class UserBuilder {

    private UserBuilder() {
    }

    public static UserDTO toUserDTO(Users user) {
        return new UserDTO(user.getId(), user.getUsername(), user.getRole());
    }

    public static UserDetailsDTO toUserDetailsDTO(Users user) {
        return new UserDetailsDTO(user.getId(), user.getUsername(), user.getPassword(), user.getRole());
    }

    public static Users toEntity(UserDetailsDTO userDetailsDTO) {
        return new Users(userDetailsDTO.getUsername(),
                userDetailsDTO.getPassword(),
                userDetailsDTO.getRole());
    }
}
