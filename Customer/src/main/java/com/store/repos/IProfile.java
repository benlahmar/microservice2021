package com.store.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entities.Profile;

public interface IProfile extends JpaRepository<Profile, Long>{
		List<Profile> findByNom(String n);
}
