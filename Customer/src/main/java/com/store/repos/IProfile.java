package com.store.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entities.Profile;

public interface IProfile extends JpaRepository<Profile, Long>{

}
