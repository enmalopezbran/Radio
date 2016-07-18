/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package radio;

/**
 *
 * @author enmalopez
 */
public class mainRadio {
    public static void main (String[] args){
        int op = 0;
        int opBoton = 0;
        Radio miRadio = new Radio();
        Scanner dato = new Scanner(System.in);
        System.out.println("¡Bienvenido!\n"
                + "Esta radio está apagada.");
        do{
            System.out.println("\nMenu:\n"
                    + "1. On/Off\n"
                    + "2. AM/FM\n"
                    + "3. Forward\n"
                    + "4. Backward\n"
                    + "5. Guardar\n"
                    + "6. Ver el estado del boton guardado"
                    + "7. Salir del programa\n"
                    + "\n Escoja el numeral del boton que desea usar:   ");
            op = dato.nextInt();
            if (op == 1){
                 miRadio.OnOff();
                miRadio.isOn = false;
                System.out.println("/n La radio esta apagada");
                System.out.println("/n Si desea encender (1) /n Si desea apagar(2)");
                
                boolean estado = miRadio.isOn();
                opOnOff = dato.nextInt();
                if (opOnOff == 1){
                    estado = true;
                    System.out.println("La radio se encendio!");
                }else{
                    estado =false;
                    System.out.println("La radio se apago!");
                }
            }else if (op == 2){
                miRadio.changeFrecuency();
                System.out.println("/n La radio esta en AM");
                System.out.println("/n Si desea cambiar frecuencia AM (1) /n Si desea cambiar frecuencia FM(2)");
                opFrecuency = dato.nextInt();
                String frecuencia = miRadio.getFrecuency();
               if (opFrecuency ==1){
                   frecuencia = "AM";
                   System.out.println("La radio esta en la frecuencia AM");
               }else{
                   frecuencia ="FM";
                   System.out.println("La radio esta en la frecuencia FM");
               } 
                
            }else if (op == 3){
                String station = miRadio.getStation();
                miRadio.Forward();
                System.out.println("La estacion que esta sonando es:" + station);
                
               
                
            }else if (op == 4){
                String station = miRadio.getStation();
                miRadio.Backward();
                System.out.println("La estacion que esta sonando es:" + station);
                
                
                
                
            }else if (op == 5){
                System.out.println("\nNumero de boton: ");
                opBoton = dato.nextInt();
                if (opBoton > 0 && opBoton < 13){
                 miRadio.setMemory(opBoton);
                }else {
                    System.out.println("Error! Ingreso incorrecto!");
                }
            }else if (op == 6){
                System.out.println("\nNumero de boton: ");
                opBoton = dato.nextInt();
                if (opBoton > 0 && opBoton < 13){
                 System.out.println("\nLa frecuencia y estacion guardada en el boton "+opBoton +" es:\n"
                        + miRadio.getMemory(opBoton));
                }else {
                    System.out.println("Error! Ingreso incorrecto!");
                }
                
            }else if (op == 7){
                System.out.println("¡Gracias por preferirnos! Hasta pronto.\n");
                System.exit(0);
            }else{
                System.out.println("Error! Ingreso incorrecto!");
            }
        }while(op != 7);
    }
        
    }
