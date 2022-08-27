package org.exemple;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UuidService {
    public UUID getUuids(){
        return UUID.randomUUID();
    }
}
