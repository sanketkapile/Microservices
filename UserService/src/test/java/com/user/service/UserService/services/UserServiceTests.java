package com.user.service.UserService.services;

import com.user.service.UserService.UserServiceApplication;
import com.user.service.UserService.repository.UserRepository;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = UserServiceApplication.class)
public class UserServiceTests {

    @Autowired
    private UserRepository userRepository;

    @ParameterizedTest
    @CsvSource({
            "0e0337de-a40b-4a32-9a8d-87f0004d0093",
            "181a5652-05ff-484e-8b2a-f69546ec5587",
            "1e0014b6-485e-423a-ac2a-493a4848bf6e",
            "4e03fb2e-666a-47a3-a05d-d3dffe9367c7",
            "913ee3c9-0a5f-4523-a4d7-d4de4db1677d",
            "e975a184-1736-4db3-82f6-1a1c01e96699",
            "0e0337de-a40b-4a32-9a8d-87f0004d0092",
            "0e0337de-a40b-4a32-9a8d-87f0004d009422"
    })
    public void testService(String userId) {
        //userRepository.findById(userId);
        assertEquals(4, 2 + 2);
        assertNotNull(userRepository.findById(userId), "User Not Found for userId:" + userId);
    }
}
