package app.repositories;

import  org.springframework.data.jpa.repository.JpaRepository;
import app.entities.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
}