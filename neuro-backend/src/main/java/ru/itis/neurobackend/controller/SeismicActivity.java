package ru.itis.neurobackend.controller;


import org.springframework.web.bind.annotation.*;
import ru.itis.neurobackend.model.SeismicEntity;

import java.time.Instant;
import java.util.UUID;

@RestController
@CrossOrigin
@RequestMapping("/seismic")
public class SeismicActivity {

    @GetMapping("/{region}")
    public SeismicEntity getSeismic(@PathVariable String region){
        return SeismicEntity.builder()
                .posX(55.4)
                .posY(31.5)
                .id(UUID.randomUUID())
                .createdAt(Instant.now())
                .location(region)
                .build();
    }

}
