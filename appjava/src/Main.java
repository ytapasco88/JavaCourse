//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Primer Programa
        System.out.println("Hello, world!");

        //Variables Primitivas
        // int, byte, short, long
        int edad = 18;
        System.out.println(edad);

        // double, float
        float age = 15.6f;
        System.out.println(age);

        // boolean
        boolean isActive = true; //false
        System.out.println(isActive);

        // char
        char course = 'A'; //para char se deben usar comillas sencillas
        System.out.println(course);

        // String Literal
        String text = "Hola, Mundo!";
        System.out.println(text);

        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hola", "Chao");
        System.out.println(texto);

        System.out.println(texto.endsWith("undo!"));
        System.out.println(texto.endsWith("undo"));

        System.out.println(texto.startsWith("Ch"));
        System.out.println(texto.contains("und"));

        System.out.println(texto.indexOf("Mund")); //Indice, comienza desde el numero 0
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());

        String malo = "    chancho feliz   ";

        System.out.println(malo);
        System.out.println(malo.trim());
        

    }
}