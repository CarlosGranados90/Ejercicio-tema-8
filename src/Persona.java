public class Persona {

    // Atributos
    private String nombre;
    private int edad;
    private String telefono;

    // Contructor por defecto
    public Persona (){

    }
    // Constructor de copia
    public Persona(Persona persona) {
        this.edad = persona.edad;
        this.nombre = persona.nombre;
        this.telefono = persona.telefono;
    }

    // Contructor común
    public Persona (String nom, int edad, String tel){
        this.nombre = nom;
        this.edad = edad;
        this.telefono = tel;
    }

    // Print mayor o menor de edad
    public void mayorEdad(int edad){
        if (edad>18)
            System.out.println("Es mayor de edad");
        else
            System.out.println("Es menor de edad");
    }

    public String mostrarDatos(Persona persona){
        String datos = "Los datos son: \n";
        datos += persona.nombre + " \n";
        datos += persona.edad + " \n";
        datos += persona.telefono + " \n";
        return datos;
    }

    // Metodo Get y Set
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(){
        this.edad = edad;
    }

    public String getTelefono(){
        return telefono;
    }
    public void setTelefono(){
        this.telefono = telefono;
    }


    public static void main(String[] args) {
        Persona persona1 = new Persona("Personaje numero 1", 27, "123456");
        Persona persona2 = new Persona("Personaje numero 2", 33, "456789");
        Persona persona3 = new Persona("Personaje numero 3", 1, "789123");

        System.out.println(persona1.mostrarDatos(persona1));
        persona1.mayorEdad(27);

        System.out.println(persona2.mostrarDatos(persona2));
        persona2.mayorEdad(33);

        System.out.println(persona3.mostrarDatos(persona3));
        persona3.mayorEdad(1);

    }

}