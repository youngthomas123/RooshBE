package com.projectsem3.rooshapi.controllers.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProviderUpdateRequest {
    private UUID id;
    private String name;
    private String logo;
}
