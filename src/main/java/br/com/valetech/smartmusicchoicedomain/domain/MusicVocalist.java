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
public class MusicVocalist {
    private UUID musicId;
    private UUID vocalistId;
}
