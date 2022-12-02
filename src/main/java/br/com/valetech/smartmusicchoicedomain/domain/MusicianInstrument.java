package br.com.valetech.smartmusicchoicedomain.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MusicianInstrument {
    private UUID musicianId;
    private UUID instrumentId;
}
