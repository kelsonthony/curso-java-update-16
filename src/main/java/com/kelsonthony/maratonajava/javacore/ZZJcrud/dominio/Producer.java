package com.kelsonthony.maratonajava.javacore.ZZJcrud.dominio;

import lombok.Builder;
import lombok.Value;

@Value // para a class ser final
@Builder
public class Producer {
    Integer id;
    String name;



}
