
package com.example.taxis.Modelo;


public class SubMenuMOD {
    
    private int id_subMenu;
    private String nombre, grupo;
    MenuMOD menuMOD = new MenuMOD();

    public int getId_subMenu() {
        return id_subMenu;
    }

    public void setId_subMenu(int id_subMenu) {
        this.id_subMenu = id_subMenu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public MenuMOD getMenuMOD() {
        return menuMOD;
    }

    public void setMenuMOD(MenuMOD menuMOD) {
        this.menuMOD = menuMOD;
    }
    
    
}
