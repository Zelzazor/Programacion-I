class Test{
    public static void main(String[] args){
        //Clase Persona
        Persona p1 = new Persona();
        p1.setNombre("Juan");
        p1.setApellido("Pérez");
        p1.setEdad(34);
        p1.setSexo('M');
        System.out.println(p1.caminar());
        System.out.println(p1.comer());
        System.out.println(p1.hablar());
        System.out.println(p1.respirar());
        System.out.println(p1.Datos());
        //Clase Bebe
        Bebe b1 = new Bebe();
        b1.setNombre("Felipe");
        b1.setApellido("Ramírez");
        b1.setEdadMeses(4);
        b1.setSexo('M');
        System.out.println(b1.caminar());
        System.out.println(b1.comer());
        System.out.println(b1.hablar());
        System.out.println(b1.respirar());
        System.out.println(b1.Datos());
    }
}