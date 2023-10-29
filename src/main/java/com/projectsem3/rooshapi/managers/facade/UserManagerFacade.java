package com.projectsem3.rooshapi.managers.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
public class UserManagerFacade {
//    @Autowired
//    private UserManager _manager;
//    @Autowired
//    private PasswordEncoderConfig c = new PasswordEncoderConfig();
//    @Autowired
//    private PasswordEncoder passwordEncoder = c.passwordEncoder();
//
//    @Autowired
//    private UserRequestMapper _requestMapper;
//
//    public List<UserResponse> getItems() {
//        return UserResponseMapper.mapUserResponse(_manager.getItems());
//    }
//
//    public UserResponse getItemById(UUID id) {
//        return UserResponseMapper.userToUserResponse(_manager.getItemById(id));
//    }
//
//    public Boolean addItem(UserCreationRequest item) {
//        item.setPassword(passwordEncoder.encode(item.getPassword() + "aiqe9hpr@##%rgt43GG#"));
//
//        return _manager.addItem(UserRequestMapper.toUser(item));
//    }
//
//    public Boolean removeItem(UUID item) {
//        return _manager.removeItem(item);
//    }
//
//    public Boolean updateItem(UserUpdateRequest item) {
//        return _manager.updateItem(UserRequestMapper.toUser(item));
//    }

}
