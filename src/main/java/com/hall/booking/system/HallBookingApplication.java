package com.hall.booking.system;

import com.hall.booking.system.models.User;
import com.hall.booking.system.repository.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
@SpringBootApplication
public class HallBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(HallBookingApplication.class, args);
	}
	//@Bean
	public User insertAdmin(UserRepository userRepository) {
		User admin = new User();
		admin.setFirstName("Nassir");
		admin.setSecondName("Said");
		admin.setLastName("Hamad");
		admin.setUsername("Chillibrown");
		admin.setPassword("123");
		admin.setRole("ROLE_ADMIN");
		admin.setPhoneNumber("00000000");
		return userRepository.save(admin);
	}
}
