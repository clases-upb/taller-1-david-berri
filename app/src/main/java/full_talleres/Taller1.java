/*
 * Este es el primer taller de lógica de programación. Tenga en cuenta la siguiente rúbrica que debe ser  
 * tenida en cuenta para cada ejercicio y se basa en los mandamientos del programador. El taller es una 
 * herramienta para comenzar a preparar la evaluación donde los descuentos si van a ser tenidos en cuenta. 
 * Con este taller, usted irá aprendiendo a aplicar buenas prácticas en la programación.
 * 
 * Al valor que obtenga en la evaluación automática de github, se revisará si cumple con buenas prácticas
 * de acuerdo con la siguiente rúbrica que se descuenta en cada ejercicio y es acumulativa:
 * Descuento por quemar valores en el código y no usar constantes: -0.5
 * Descuento por no implementar control de errores con trycatch: -0.8
 * Descuento por no escribir el código ordenado, identado: -0.4
 * 
 * RÉTESE, PÓNGASE A PRUEBA!!!
 * 
 */
package full_talleres;

public class Taller1 {
    
    public static void main(String[] args) {

        System.out.println(Convertir_km_seg(40));

        System.out.println(Convertir_cm_lt(3500));

        System.out.println(Convertir_us_cops(45623 ));

        System.out.println(Convertir_cent_far((float)5));

        System.out.println(Calcular_segs((short)1, (short)1, (short)1, (short)1));

        System.out.println(Calcular_peso_carga((float)47.5, (float)7.5));

        System.out.println(Calcular_horasxviaje("Armenia", (short)285, (short)72));

        System.out.println(Calcular_combustible(638, 312, 1243, 220));

        System.out.println(Calcular_peso_luna((byte)80));

    }

    /* 
     2.	Diseñe un algoritmo e implemente la función Convertir_km_seg que: reciba una velocidad entera en Km/seg 
     y la convierta a metros/seg y a metros/hora. Retorne un string del tipo: ### m/s - ### m/h. Si hay error, 
     devuelva el string "Error en la conversion"
    */
    public static String Convertir_km_seg(int km_seg){
        try {
                float metros_seg = 0;
                float metros_hora = 0;
                final float conversion_metros_seg = 1000;
                final float  conversion_metros_hora = (float)1/3600;
                metros_seg = km_seg * conversion_metros_seg;
                metros_hora = metros_seg  /conversion_metros_hora;
                String resultado = metros_seg + " m/s" + " - " + metros_hora + " m/h";
                return resultado;
            } 
            
        catch (Exception e) {
            return "Error en la conversion";

            }
    }
    
    /*3. Diseñe un algoritmo e implemente la función Convertir_cm_lt que: reciba una cantidad double expresada en 
    cc (centímetros cúbicos) y devuelva un float con su equivalente en litros. Si hay algún error, retorne 0.
    */

    public static float  Convertir_cm_lt(double litros) {
        try {
                float total_litros = 0;
                final double  cm3xlitro = 0.001; // Corrección: 0.001 en lugar de 1
                total_litros = (float)(litros * cm3xlitro);
                return total_litros;
            } 

        catch (Exception e) {
            return 0; // Manejo de errores: retorna 0 si hay algún problema

            }
    }

   /*4.	Diseñe un algoritmo e implemente la función Convertir_us_cops que reciba una cantidad entera de dólares 
   y devuelva su equivalente en pesos usando una TRM de $4170 pesos por cada dólar. La función recibe enteros
   y devuelve enteros, pueden ser grandes. Si hay algún error, retorne -1.
   */
   public static int Convertir_us_cops(int us){
        try {
                int total_cops = 0;
                final int  usx_cops = 4170;
                total_cops = us * usx_cops;
                return total_cops;

            } 

        catch (Exception e) {
            return -1;

            }

    }

   /*5.	Diseñe un algoritmo e implemente la función Convertir_cent_far que recibe la temperatura real en grados 
   centígrados y la devuelve en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5). Si hay algún error, 
   retorne 0.
   */
  public static float Convertir_cent_far(float C){
        try {
                float total_f = 0;
                float cenx_farenheit = 32 + (9 * C/5);
                total_f = cenx_farenheit;
                return total_f;
                
            } 

        catch (Exception e) {
            return 0;
            
            }
    }

   /*6.	Diseñe un algoritmo e implemente la función Calcular_segs que recibirá el número de Días, el número de horas, 
   el número de minutos y número segundos como enteros bytes, positivos y devuelva todo en segundos en un entero. 
   Si hay algún error, devuelva -1.
   */
  public static int Calcular_segs(short dias,short  horas,short  minutos, short  segundos){
        try {
                int total_segundos = 0;
                final int eq_dia = 86400;
                final int eq_hora = 3600;
                final int eq_minuto = 60;
                final int eq_segundo = 1;
                total_segundos = dias * eq_dia + horas * eq_hora + minutos * eq_minuto + segundos * eq_segundo;
                return total_segundos;

            
            } 
        
        catch (Exception e) {
            return -1;

            }
    }

   /*7.	Un usuario tiene un sistema de báscula para pesar camiones. Diseñe un algoritmo e implemente la función 
   Calcular_peso_carga que reciba un float con el peso total del camión cargado en toneladas y otro float con 
   lo que pesa el camión vacío en toneladas, y devuelva el peso neto de la carga en kilos y toneladas 
   en un string del tipo: "### kilos - ### toneladas". 
   Si hay algún error, devuelva en un string "Error en la función Calcular_peso_carga"*/
   public static String Calcular_peso_carga(float peso_total,float  peso_vacio){
        try {
                float carga_toneladas = 0;
                float carga_kilos = 0;
                final int conversion = 1000;
                carga_toneladas = peso_total - peso_vacio;
                carga_kilos = carga_toneladas * conversion;
                String resultado = carga_kilos + " kilos - " + carga_toneladas + " toneladas";
                return resultado;
                
            } 
        
        catch (Exception e) {
            return "Error en la funcion Calcular_peso_carga";

            }
    }

   /*8.	Diseñe un algoritmo e implemente la función Calcular_horasxviaje que calcule y devuelva un float con las horas  
   necesarias para alcanzar un destino que es recibido en un string, además de un short con la distancia en kms
   otro dato short que es la velocidad  promedio que alcanzará también el vehículo en kilómetros/hora.  
   Si hay algún error, devuelva -1.
   */

   public static float Calcular_horasxviaje(String ciudad, short distancia, short velocidad){
        try {
                float horas_necesarias = 0;
                horas_necesarias = distancia/velocidad;
                return horas_necesarias; 

            } 
        
        catch (Exception e) {
            return -1;

            }

    }
  
   /*9.	Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. 
   Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. 
   En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. 
   
   El piloto desea que sea diseñado un algoritmo e implementado en la función Calcular_combustible, 
   el kilometraje total para cada una de cuatro rutas que son datos enteros, y devuelva un float con la cantidad total 
   de combustible que debe ser cargado en el avión.
   
   Si hay algún error, devuelva -1.*/

   public static float Calcular_combustible(int r1,int r2, int r3, int r4){
        try {

                float combustible_final = 0;
                float combustible_parcial = 0;
                float ida_vuelta = 0;
                final float gastox_recorrido = 0.2f;
                final float recorrido = 60.8f;
                final float despegue = 4.8f;
                final float  aterrizaje = 1.6f;
                ida_vuelta = gastox_recorrido / recorrido;
                combustible_parcial = ida_vuelta * (r1+r2+r3+r4);
                combustible_final = combustible_parcial + despegue + aterrizaje;
                return combustible_final;
        
            }

        catch (Exception e) {
            return -1;

            }

    }

   /*10. Diseñe un algoritmo e implemente la función Calcular_peso_luna que recibe un byte con el peso en la tierra en kilos
   y devuelve un double el equivalente de ese peso en la luna en Newtons. Utilice las siguientes fórmulas.
   peso_tierra_new = peso_kilos * 9.81m/s2
   peso_luna_new = peso_tierra_new * 0.165
   
   Si hay algún error, devuelva 0.
   */
   public static double Calcular_peso_luna(byte peso_kilos){

        try {
                double peso_tierra_new = 0;
                double peso_luna_new = 0;
                final float gravedad = 9.81f;
                final float conversion = 0.165f;
                peso_tierra_new = peso_kilos * gravedad;
                peso_luna_new = peso_tierra_new * conversion;
                return peso_luna_new;
            }
  
        catch (Exception e) {
            return 0;

            }
        
    }
}
