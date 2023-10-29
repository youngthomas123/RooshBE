package com.projectsem3.rooshapi.data;

import com.projectsem3.rooshapi.repositories.entity.GenericEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.UUID;

@NoRepositoryBean
public interface GenericDatalayer<T extends GenericEntity>  extends JpaRepository<T, UUID> {}