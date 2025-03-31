package org.example;

import java.util.List;

public class Main {

SQLAccesunidad8act1 miData = new SQLAccesunidad8act1();

    List<Inventario> productos = miData.getMostrartodos();

    for(Inventario kk : productos){
        System.out.println(kk);
    }
}