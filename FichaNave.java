/**
 * Clase que gestiona la ficha técnica, analítica y de estado de una nave espacial.
 * Permite registrar datos del piloto, realizar cálculos precisos de autonomía,
 * controlar el porcentaje de combustible y gestionar las métricas oficiales.
 * 
 * Justificación de Diseño: Se han estructurado los datos en bloques lógicos y
 * modulares, asegurando la escalabilidad del sistema de navegación.
 * 
 * @author Maitane
 * @author Carlos
 */
public class FichaNave {

    public static void main(String[] args) {
     
    
        String nombrePiloto = "Pepe"; 
        char rangoPiloto = 'C'; 
        int nivelExperiencia = 5; 
        double combustibleActual = 1450.75; 
        boolean sistemasListos = true; 
         /*
        Utilizamos contantes.
         */
        final double CAPACIDAD_MAXIMA_LITROS = 2000.0; 
        final double CONSUMO_POR_AÑO_LUZ = 180.5; 

        
        // Incremento del nivel de experiencia utilizando el operador unario estricto (++)
        nivelExperiencia++; 
        
        // Operación aritmética de división para proyectar la autonomía espacial
        double anosLuz = combustibleActual / CONSUMO_POR_AÑO_LUZ; 
        
        // Cálculo del porcentaje proporcional del tanque con operadores combinados
        double porcentajeTanque = (combustibleActual / CAPACIDAD_MAXIMA_LITROS) * 100; 

        /*
        Calculamos el combustible sobrante por si lo queremos ver mas adelante
         */
        double combustibleSobranteVuelta = combustibleActual % CONSUMO_POR_AÑO_LUZ;


    
 
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
        System.out.println("Combustible sobrante: " + combustibleSobranteVuelta);
            System.out.println("===============================================================");
    }
    
}
