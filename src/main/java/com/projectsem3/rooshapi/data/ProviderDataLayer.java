package com.projectsem3.rooshapi.data;

import com.projectsem3.rooshapi.repositories.entity.Office;
import com.projectsem3.rooshapi.repositories.entity.Provider;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ProviderDataLayer extends GenericDatalayer<Provider>{
    @Query("select P.offices from Provider as P Where P.id = :id")
    public List<Office> findOfficesByProvider(@Param("id") UUID id);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO provider_offices VALUES " +
            "( " +
            ":#{#providerId}, " +
            ":#{#officeId} " +
            ")", nativeQuery = true)
    public abstract void addOfficeToProvider(@Param("providerId") UUID providerId, @Param("officeId") UUID officeId);
}
