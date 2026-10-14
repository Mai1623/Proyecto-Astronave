/**
 * Clase que gestiona la ficha técnica y de estado de una nave espacial.
 * Permite registrar los datos del piloto, realizar cálculos de autonomía 
 * de combustible y verificar los sistemas para la misión.
 * 
 * @author Maitane
 * @author Carlos
 * @version 1.0
 */
public class FichaNave {

    public static void main(String[] args) {
        
        // Datos de la Nave y Piloto (Variables)
        String nombrePiloto = "Pepe"; // Guardamos el nombre del piloto como texto
        char rangoPiloto = 'C'; // Guardamos la inicial del rango: 'C' significa Capitán
        int nivelExperiencia = 5; // Guardamos el nivel de experiencia como un número entero
        double combustibleActual = 1450.75; // Guardamos los litros de combustible, incluyendo decimales
        boolean sistemasListos = true; // Indicamos si los sistemas están listos: true o false

        // Constantes de Misión
        final double CAPACIDAD_MAXIMA_LITROS = 2000.0; // Capacidad total del tanque de la nave
        final double CONSUMO_POR_AÑO_LUZ = 180.5; // Litros consumidos por cada año luz viajado

        // Operaciones y Cálculos
        nivelExperiencia++; // Incrementamos el nivel de experiencia en 1 usando el operador (++)
        
        // Calculamos los años luz que puede recorrer la nave con el combustible actual
        double anosLuz = combustibleActual / CONSUMO_POR_AÑO_LUZ; 
        
        // Calculamos el porcentaje de tanque lleno respecto a la capacidad máxima
        double porcentajeTanque = (combustibleActual / CAPACIDAD_MAXIMA_LITROS) * 100; 

        // Presupuesto y Casting Explícito
        // Aplicamos casting explícito a (int) para truncar los decimales de la autonomía
        int años_luz_entero = (int) anosLuz;

        // Salida de datos por consola 
                System.out.println("******************* FICHA OFICIAL DE LA NAVE *****************");
                System.out.println("");
                System.out.println("=========================== DATOS ============================");
        System.out.println("Piloto: " + nombrePiloto + " | Rango: " + rangoPiloto);
        System.out.println("¿El sistema está listo?: " + sistemasListos);
        System.out.println("¿Cual es la capacidad maxima de litros tiene?: " + CAPACIDAD_MAXIMA_LITROS );
        System.out.println("¿Cual es el consumo por año luz de la AEROnave espacial?: "+ CONSUMO_POR_AÑO_LUZ);
        System.out.println("Nuevo nivel de experiencia: " + nivelExperiencia);
            System.out.println("===============================================================");
                System.out.println("\n");
            System.out.println("=========================== CALCULOS ==========================");
        System.out.println("Porcentaje del tanque: " + porcentajeTanque + "%");
        System.out.println("Autonomía calculada (entera): " + años_luz_entero + " años luz.");
        System.out.println("Autonomía calculada (decimales): " + anosLuz + " años luz.");
            System.out.println("===============================================================");
    }
}
