package com.dio.live.model;


import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class categoriaUsuario {
    private long id;
    private String descricao;
}
