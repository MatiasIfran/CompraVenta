package com.example.compraventa.model;

import android.graphics.Color;

import androidx.core.util.Consumer;

import java.util.ArrayList;
import java.util.List;

public class Categoria {
    private int color;
    private String id;
    private String nombre;

    public Categoria(){}

    public Categoria (Consumer<Categoria> c) {c.accept(this);}

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public static List<Categoria> ejemplos(){

        ArrayList<Categoria> ac= new ArrayList<>();
        ac.add( new Categoria(
                c -> {
                    c.setId("MLA5725");
                    c.setNombre("Accesorios para Vehiculos");
                    c.setColor(Color.parseColor("#FFB172"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1512");
                    c.setNombre("Agro");
                    c.setColor(Color.parseColor("#FFE49E"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1403");
                    c.setNombre("Alimentos y Bebidas");
                    c.setColor(Color.parseColor("#E4FFC1"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA107");
                    c.setNombre("Animales y Mascotas");
                    c.setColor(Color.parseColor("#F97474"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1367");
                    c.setNombre("Antiguedades y Colecciones");
                    c.setColor(Color.parseColor("#E4DCCB"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1368");
                    c.setNombre("Arte, Libreria y Merceria");
                    c.setColor(Color.parseColor("#BFFBDD"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1743");
                    c.setNombre("Autos, Motos y Otros");
                    c.setColor(Color.parseColor("#EFE38E"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1384");
                    c.setNombre("Bebes");
                    c.setColor(Color.parseColor("#FDDCFF"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1246");
                    c.setNombre("Belleza y Cuidado Personal");
                    c.setColor(Color.parseColor("#EBDBFF"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1039");
                    c.setNombre("Camaras y Accesorios");
                    c.setColor(Color.parseColor("#EBEBEB"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1051");
                    c.setNombre("Celulares y Telefonos");
                    c.setColor(Color.parseColor("#BFFBF6"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1648");
                    c.setNombre("Computacion");
                    c.setColor(Color.parseColor("#CCE4EA"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1144");
                    c.setNombre("Consolas y Videojuegos");
                    c.setColor(Color.parseColor("#E1FF7C"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1500");
                    c.setNombre("Construccion");
                    c.setColor(Color.parseColor("#E2A4A4"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1276");
                    c.setNombre("Deportes y Fitness");
                    c.setColor(Color.parseColor("#EFC48B"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA5726");
                    c.setNombre("Electrodomesticos y Aires Ac.");
                    c.setColor(Color.parseColor("#FFB9F4"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1000");
                    c.setNombre("Electronica, Audio y Video");
                    c.setColor(Color.parseColor("#DCDBA9"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA2547");
                    c.setNombre("Entradas para Eventos");
                    c.setColor(Color.parseColor("#DEBBFF"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA407134");
                    c.setNombre("Herramientas");
                    c.setColor(Color.parseColor("#D8B683"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1574");
                    c.setNombre("Hogar, Muebles y Jardin");
                    c.setColor(Color.parseColor("#D7FECC"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1499");
                    c.setNombre("Industrias y Oficinas");
                    c.setColor(Color.parseColor("#F4D3FD"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1459");
                    c.setNombre("Inmuebles");
                    c.setColor(Color.parseColor("#D0F9FC"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1182");
                    c.setNombre("Instrumentos Musicales");
                    c.setColor(Color.parseColor("#FFE1C9"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA3937");
                    c.setNombre("Joyas y Relojes");
                    c.setColor(Color.parseColor("#CECECE"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1132");
                    c.setNombre("Juegos y Juguetes");
                    c.setColor(Color.parseColor("#E7EAFF"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA3025");
                    c.setNombre("Libros, Revistas y Comics");
                    c.setColor(Color.parseColor("#9ACED8"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1168");
                    c.setNombre("Musica, Peliculas y Series");
                    c.setColor(Color.parseColor("#F0D7EC"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1430");
                    c.setNombre("Ropa y Accesorios");
                    c.setColor(Color.parseColor("#F8FFB5"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA409431");
                    c.setNombre("Salud y Equipamiento Medico");
                    c.setColor(Color.parseColor("#94FFAF"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1540");
                    c.setNombre("Servicios");
                    c.setColor(Color.parseColor("#FCF4BA"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA9304");
                    c.setNombre("Souvenirs, Cotillon y Fiestas");
                    c.setColor(Color.parseColor("#98A5F2"));
                }
        ));

        ac.add( new Categoria(
                c -> {
                    c.setId("MLA1953");
                    c.setNombre("Otras categorias");
                    c.setColor(Color.parseColor("#C6EEFF"));
                }
        ));
        return ac;
    }
}
