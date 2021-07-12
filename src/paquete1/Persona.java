package paquete1;

public class Persona {
    /* Modificador de acceso deafault:
       se puede puede acceder a los atributos
       y objetos dentro del mismo paquete */
    String nombre = "";

    /* Modificador de accesos privado:
       Se puede acceder sólo dentro de la misma clase */
    private int edad = 0;

    /* Modificador protected:
       Se puede acceder dentro de la misma clase y del mismo paquete */
    protected String domicilio = "";

    /* Modificador pulic:
       Se puede acceder desde la misma clase y otros paquetes */
    public float estatura = 0;

    String saludar() {
        return "Hola, mi nombre es " + this.nombre +
                ".\n Mi edad es " + this.edad +
                ".\n Mi domicilio es " + this.domicilio +
                ".\n Mi estatura es " + this.estatura;
    }

}
