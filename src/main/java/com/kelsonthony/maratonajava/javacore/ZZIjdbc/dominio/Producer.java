package com.kelsonthony.maratonajava.javacore.ZZIjdbc.dominio;

import lombok.Builder;
import lombok.Value;

@Value // para a class ser final
@Builder
public final class Producer {
    private final Integer id;
    private final String name;



}
