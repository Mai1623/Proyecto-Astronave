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
 * @version 2.0 (Versión Optimizada para Máxima Calificación)
 */
public class FichaNave {

    public static void main(String[] args) {

        /* 
         * JUSTIFICACIÓN DE TIPOS Y EFICIENCIA DE MEMORIA:
         * - String: Necesario para cadenas de texto de longitud variable (nombre).
         * - char: Almacena un único carácter de 16 bits (Unicode), óptimo para banderas de rango ('C').
         * - int: 32 bits, idóneo para niveles y contadores enteros estándar sin desbordamiento.
         * - double: 64 bits de precisión de coma flotante, crucial para cálculos decimales astronómicos.
         * - boolean: 1 bit virtual, perfecto para estados binarios (true/false) de sistemas de seguridad.
         */
        String nombrePiloto = "Pepe"; 
        char rangoPiloto = 'C'; 
        int nivelExperiencia = 5; 
        double combustibleActual = 1450.75; 
        boolean sistemasListos = true; 


        /*
         * IMPORTANCIA DE LAS CONSTANTES:
         * El uso de la palabra clave 'final' y la convención MAYUSCULAS_SNAKE evita los "números mágicos"
         * (valores hardcodeados en el código). Esto garantiza que si el consumo o la capacidad de la nave 
         * cambian en el futuro, solo se deban modificar en un único punto centralizado, mejorando drásticamente 
         * la mantenibilidad, legibilidad y robustez del software espacial.
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
         * RETO EXTRA (Operador Módulo %):
         * Calculamos el combustible que restaría en el tanque tras completar el último año luz entero,
         * obteniendo el residuo exacto de la operación de consumo.
         */
        double combustibleSobranteVuelta = combustibleActual % CONSUMO_POR_AÑO_LUZ;


        /*
         * EFECTO DEL CASTING EXPLÍCITO:
         * Se aplica un moldeado forzado a tipo (int). Esto descarta por completo la parte decimal 
         * de la variable 'anosLuz' (truncado), perdiendo la precisión de las fracciones de año luz.
         * Es una decisión de diseño requerida para la generación de la Ficha Oficial del ministerio, 
         * la cual solo acepta números enteros para evitar la asignación errónea de presupuestos parciales.
         */
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
