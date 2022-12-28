package org.example;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        read_file();
    }

    private static void revisarCodigo (String infoPersonas) {
        long count = infoPersonas.chars().filter(character -> character == ':').count();

        if(count == 2){ //Te enseña el primer erroneo;
            String [] datos = infoPersonas.split(":");

            if (datos[0].isBlank() || datos[0].isEmpty()){
                System.out.println("Faltaria el nombre de uno de los campos");
            }
        }
    }

    /*
    COMENTAR Y DESCOMENTAR LOS SOUTS
    PARA VER EL RESULTADO ESPERADO SEGUN
    EL APARTADO DEL EJERCICIO
     */

    public static void filtrarEdad(ArrayList<Person> Personas){
//----------------------------APARTADO A----------------------------------------------------
        List<Person> listPersonFiltrada = Personas.stream()
                .filter(persona -> persona.getAge() < 25 && persona.getAge() != 0).collect(Collectors.toList());

        // listPersonFiltrada.forEach(System.out::println);   //Este muestra las personas menores de 25

//----------------------------APARTADO B----------------------------------------------------
        List<Person> empiezaPorA = Personas.stream()
                .filter(person -> !person.getName().startsWith("A"))
                .collect(Collectors.toList());

        // empiezaPorA.stream().forEachOrdered(person -> System.out.println(person));

//----------------------------APARTADO C----------------------------------------------------
        Optional<Person> townIsMadrid = Personas.stream()
                .filter(person -> person.getTown().equals("Madrid")).findFirst();

        String resultadoMadrid;

        if (townIsMadrid.isPresent()) {
            resultadoMadrid = townIsMadrid.get().toString();

            //System.out.println(resultadoMadrid);  // Apart. C: Para mostrar las personas de Madrid

        }

//----------------------------APARTADO D----------------------------------------------------//------------------------------------------------------------------------------------------------
        Optional<Person> townIsBarcelona = Personas.stream()
                .filter(person -> person.getTown().equals("Barcelona")).findFirst();

        String resultadoBarcelona;

        if (townIsBarcelona.isPresent()){
            resultadoBarcelona = townIsBarcelona.get().toString();

            // System.out.println(resultadoBarcelona); // Apart. D: Primera persona de Barcelona

        };

//----------------------------LISTA COMPLETA-------------------------------------------------

        for(Person persona: Personas){
            System.out.println(persona.toString()); // Este los muestra todos

        }

    }

//--------------------------------------------------------------------------------------
    private static Person createPerson (String infoPersonas){
        Person person = new Person();

        String[] datosPersona;

        if(infoPersonas != null){
            datosPersona = infoPersonas.split(":");

            person.setName(datosPersona[0]);
            person.setTown((datosPersona[1] != "" ? datosPersona[1] : "Unknown"));
            person.setAge ((datosPersona.length < 3) ? 0 : Integer.parseInt(datosPersona[2]));

            ArrayList<Person> arrayPersonas = new ArrayList<>();
            arrayPersonas.add(person);

            filtrarEdad(arrayPersonas);
            revisarCodigo(infoPersonas);
        }

        // System.out.println(person.toString());
        return person;
    }


    public static void read_file() throws FileNotFoundException {

        try {
            Path entrada = Paths.get("C:/Users/karim.gonzalez/Documents/people.txt");
            BufferedReader mibuffer = Files.newBufferedReader(entrada); // guarda el texto
            String line = mibuffer.readLine();// lee el file


            while (line != null) { // Sigue hasta encontrar null

                String[] personasData = line.split(":");
                line = mibuffer.readLine();// Lee cada linea cortada con split
                createPerson(line);// A line le aplicamos el metodo createPerson
            }

        }   catch (IOException e){
            e.printStackTrace();
        }
    }
}