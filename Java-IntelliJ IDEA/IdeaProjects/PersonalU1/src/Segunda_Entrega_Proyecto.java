public class Segunda_Entrega_Proyecto {

    public static void main (String [] args){

        //Tablero_de_juego
        String tablero[][] = new String[37][9];
        String[] muros = new String [20];
        int posicion_jugador_1_i = 2;
        int posicion_jugador_1_j = 4;
        int posicion_jugador_2_i = 34;
        int posicion_jugador_2_j = 4;
        int [] posicion_jugador_1 = {posicion_jugador_1_i,posicion_jugador_1_j};
        int [] posicion_jugador_2 = {posicion_jugador_2_i,posicion_jugador_2_j};
        int accion = 0;
        int colocar = 0;
        int x = -1;
        int y = -1;
        int a = 0;
        boolean ganar = false;

        tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
        /*
        Parte_libre_para_pensar_los_movimientos:
        Posicion_inicial = tablero_[2][4]
        movimiento_hacia_arriba_o_abajo = tablero_[i-4][j] o tablero_[i+4][j]
        movimiento_hacia_izquierda_o_derecha = tablero_[i][j-1] o tablero_[i][j+1]

        Parte_libre_para_pensar_las_paredes:
        1. Preguntar_Casilla
        1.1. Coordenadas_x, Coordenadas_y
        1.2. Orientacion_
        2. Verificacion_
        2.1. Si_ya_habia_una_pared_antes
        2.2. Si_quedan_paredes_con_las_que_jugar

        1.
        1.1. int_ casilla_i = 4x, casilla_j = y;
        1.2.
        if (pared_arriba){ if (x==0) { No_se_puede } else if (range) { tablero_[i][j] = pared_arriba() }
        if (pared_abajo){ if (x==9) { No_se_puede } else if (range) { tablero_[i+4][j] = pared_abajo() }
        if (pared_izquierda){ if (y==0) { No_se_puede } else if (range) { tablero_[i][j] = pared_arriba() }
        if (pared_derecha){ if (y==9) { No_se_puede } else if (range) { tablero_[i][j+1] = pared_abajo() }

        Problema_: Se_borra_la_accion_anterior_al_repetir_el_while
        Solucion_: Probablemente_usar_un_arreglo_auxiliar_en_el_que guardar_el_tablero_actual
        Prob_Solu: Como_sumar_los_progresos

        Inicializar_ tabl_aux = tabl_
        while{

        }
        */

        //Menu_principal
        int turno = 1;
        java.util.Scanner teclado = new java.util.Scanner (System.in);
        while (ganar == false){
            while (turno == 1){
                System.out.println("\nDigite 1 para moverse o 2 para colocar una pared\n");
                accion = teclado.nextInt();

                //Menu_de_movimiento
                if (accion==1){
                    //Falta_excepcion_de_movimiento_hacia_pared
                    System.out.println("¿Hacia que direccion desea moverse?");
                    System.out.println("1 = arriba, 2 = abajo, 3 = izquierda, 4 = derecha");
                    System.out.println("Si desea regresar al menu principal, digite 0");
                    int moverse = 1;
                    while (moverse>=0 && moverse<5){

                        moverse = teclado.nextInt();
                        if (moverse == 1){
                            //tablero[i-4][j] == fila_vacia && lo mismo con j
                            if (posicion_jugador_1_i > 2 && tablero[posicion_jugador_1_i-4][posicion_jugador_1_j] == fila_vacia()) {
                                if (posicion_jugador_1_i - 4 == posicion_jugador_2_i)
                                    posicion_jugador_1_i -= 4;
                                posicion_jugador_1_i = moverse_arriba(posicion_jugador_1_i);
                                tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                turno=2;
                                break;
                            } else {
                                System.out.println("No se puede desplazar hacia arriba");
                            }
                        } else {
                            if (moverse == 2){
                                if (posicion_jugador_1_i < 32 && (posicion_jugador_1 != posicion_jugador_2)) {
                                    if (posicion_jugador_1_i + 4 == posicion_jugador_2_i)
                                        posicion_jugador_1_i += 4;
                                    posicion_jugador_1_i = moverse_abajo(posicion_jugador_1_i);
                                    tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                    turno=2;
                                    break;
                                } else {
                                    System.out.println("No se puede desplazar hacia abajo");
                                }
                            } else {
                                if (moverse == 3){
                                    if (posicion_jugador_1_j > 0 && (posicion_jugador_1 != posicion_jugador_2)){
                                        posicion_jugador_1_j = moverse_izquierda(posicion_jugador_1_j);
                                        System.out.println("");
                                        tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                        turno=2;
                                        break;
                                    } else {
                                        System.out.println("No se puede desplazar hacia la izquierda");
                                    }
                                } else {
                                    if (moverse == 4){
                                        if (posicion_jugador_1_j < 8 && (posicion_jugador_1 != posicion_jugador_2)){
                                            posicion_jugador_1_j = moverse_derecha(posicion_jugador_1_j);
                                            tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                            turno=2;
                                            break;
                                        } else {
                                            System.out.println("No se puede desplazar hacia la derecha");
                                        }
                                    } else {
                                        if (moverse == 0){
                                            break;
                                        } else {
                                            System.out.println("El numero digitado no es una opcion, digite uno valido");
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {

                    //Menu_de_paredes
                    if (accion==2) {
                        //Falta_la_excepcion_de_las_cuatro_paredes_en_una_casilla
                        //Falta_la_excepcion_para_no_poner_un_muro_dos_veces_en_el_mismo_sitio
                        //Falta_la_excepcion_por_ser_10_la_cantidad_maxima_de_muros
                        colocar=1;
                        System.out.println("Digite las coordenadas 'x' y 'y' de la casilla donde desea colocar la pared");
                        y = teclado.nextInt();
                        x = teclado.nextInt();
                        x *= 4;
                        System.out.println("Digite el lado hacia el que desea poner la pared");
                        System.out.println("1 = arriba, 2 = abajo, 3 = izquierda, 4 = derecha");
                        System.out.println("Si desea regresar al menu principal, digite 0");
                        colocar = teclado.nextInt();
                        if (colocar == 1){
                            if (x > 0 && x <= 32) {
                                tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                turno=2;
                                break;
                            } else {
                                System.out.println("No se puede colocar un muro en esta posicion");
                            }
                        } else {
                            if (colocar == 2){
                                if (x >= 0 && x < 32) {
                                    tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                    turno=2;
                                    break;
                                } else {
                                    System.out.println("No se puede colocar un muro en esta posicion");
                                }
                            } else {
                                if (colocar == 3){
                                    tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                    turno=2;
                                    break;
                                } else {
                                    if (colocar == 4){
                                        tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                        turno=2;
                                        break;
                                    } else {
                                        if (colocar == 0){
                                            break;
                                        } else {
                                            System.out.println("El numero digitado no es una opcion, digite uno valido");
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            while (turno == 2){
                System.out.println("\nDigite 1 para moverse o 2 para colocar una pared\n");
                accion = teclado.nextInt();

                //Menu_de_movimiento
                if (accion==1){
                    //Falta_excepcion_de_movimiento_hacia_pared
                    System.out.println("¿Hacia que direccion desea moverse?");
                    System.out.println("1 = arriba, 2 = abajo, 3 = izquierda, 4 = derecha");
                    System.out.println("Si desea regresar al menu principal, digite 0");
                    int moverse = 1;
                    while (moverse>=0 && moverse<5){
                        moverse = teclado.nextInt();
                        if (moverse == 1){
                            if (posicion_jugador_2_i > 2 && tablero[posicion_jugador_1_i-4][posicion_jugador_1_j] == fila_vacia()) {
                                if (posicion_jugador_2_i - 4 == posicion_jugador_1_i)
                                    posicion_jugador_2_i -= 4;
                                posicion_jugador_2_i = moverse_arriba(posicion_jugador_2_i);
                                tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                turno=1;
                                break;
                            } else {
                                System.out.println("No se puede desplazar hacia arriba");
                            }
                        } else {
                            if (moverse == 2){
                                if (posicion_jugador_2_i < 32 && (posicion_jugador_1 != posicion_jugador_2)) {
                                    if (posicion_jugador_2_i + 4 == posicion_jugador_1_i)
                                        posicion_jugador_1_i += 4;
                                    posicion_jugador_2_i = moverse_abajo(posicion_jugador_2_i);
                                    tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                    turno=1;
                                    break;
                                } else {
                                    System.out.println("No se puede desplazar hacia abajo");
                                }
                            } else {
                                if (moverse == 3){
                                    if (posicion_jugador_2_j > 0 && (posicion_jugador_1 != posicion_jugador_2)){
                                        posicion_jugador_2_j = moverse_izquierda(posicion_jugador_2_j);
                                        System.out.println("");
                                        tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                        turno=1;
                                        break;
                                    } else {
                                        System.out.println("No se puede desplazar hacia la izquierda");
                                    }
                                } else {
                                    if (moverse == 4){
                                        if (posicion_jugador_2_j < 8 && (posicion_jugador_1 != posicion_jugador_2)){
                                            posicion_jugador_2_j = moverse_derecha(posicion_jugador_2_j);
                                            tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                            turno=1;
                                            break;
                                        } else {
                                            System.out.println("No se puede desplazar hacia la derecha");
                                        }
                                    } else {
                                        if (moverse == 0){
                                            break;
                                        } else {
                                            System.out.println("El numero digitado no es una opcion, digite uno valido");
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {

                    //Menu_de_paredes
                    if (accion==2) {
                        //Falta_la_excepcion_de_las_cuatro_paredes_en_una_casilla
                        //Falta_la_excepcion_para_no_poner_un_muro_dos_veces_en_el_mismo_sitio
                        //Falta_la_excepcion_por_ser_10_la_cantidad_maxima_de_muros
                        colocar=1;
                        System.out.println("Digite las coordenadas 'x' y 'y' de la casilla donde desea colocar la pared");
                        y = teclado.nextInt();
                        x = teclado.nextInt();
                        x *= 4;
                        System.out.println("Digite el lado hacia el que desea poner la pared");
                        System.out.println("1 = arriba, 2 = abajo, 3 = izquierda, 4 = derecha");
                        System.out.println("Si desea regresar al menu principal, digite 0");
                        while (colocar>=0 && colocar<5) {
                            colocar = teclado.nextInt();
                            if (colocar == 1){
                                if (x > 0 && x <= 32) {
                                    tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                    turno=1;
                                    break;
                                } else {
                                    System.out.println("No se puede colocar un muro en esta posicion");
                                }
                            } else {
                                if (colocar == 2){
                                    if (x >= 0 && x < 32) {
                                        tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                        turno=1;
                                        break;
                                    } else {
                                        System.out.println("No se puede colocar un muro en esta posicion");
                                    }
                                } else {
                                    if (colocar == 3){
                                        tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                        turno=1;
                                        break;
                                    } else {
                                        if (colocar == 4){
                                            tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
                                            turno=1;
                                            break;
                                        } else {
                                            if (colocar == 0){
                                                break;
                                            } else {
                                                System.out.println("El numero digitado no es una opcion, digite uno valido");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (posicion_jugador_1_i == 34 && posicion_jugador_2_i != 2) {
                ganar = true;
                System.out.println("El ganador es el jugador 1");
            }
            else if (posicion_jugador_2_i == 2 && posicion_jugador_1_i != 34) {
                ganar = true;
                System.out.println("El ganador es el jugador 2");
            }
        }
    }

    //Funciones_para_el_jugador
    static String fila_llena(){
        return "# # # # ";
    }
    static String fila_vacia(){
        return "#       ";
    }
    static String posicion_jugador1(){
        return "#   1   ";
    }
    static String posicion_jugador2(){
        return "#   2   ";
    }
    static int moverse_arriba(int i){
        i -= 4;
        return i;
    }
    static int moverse_abajo(int i){
        i += 4;
        return i;
    }
    static int moverse_izquierda(int i){
        i -= 1;
        return i;
    }
    static int moverse_derecha(int i){
        i += 1;
        return i;
    }
    static String pared_arriba(){
        return "#///////";
    }
    static String pared_abajo(){
        return "#///////";
    }
    static String pared_izquierda(){
        return "/       ";
    }
    static String pared_derecha(){
        return "/       ";
    }
    //Metodo_juego
    static void quoridor(String tablero[][], int posicion_jugador_1_i, int posicion_jugador_1_j, int posicion_jugador_2_i, int posicion_jugador_2_j, int accion, int colocar, int x, int y,String[] muros, int a){
        tablero(tablero, posicion_jugador_1_i, posicion_jugador_1_j, posicion_jugador_2_i, posicion_jugador_2_j, accion, colocar, x, y, muros, a);
        //Primero arreglo el resto del codigo
    }
    //Menu_principal
    static void menu_principal(){
        System.out.println("\nDigite 1 para moverse o 2 para colocar una pared\n");
    }
    //Metodo_para_mostrar_tablero
    static void tablero (String tablero[][], int posicion_jugador_1_i, int posicion_jugador_1_j, int posicion_jugador_2_i, int posicion_jugador_2_j, int accion, int colocar, int x, int y, String[] muros, int a) {
        System.out.println("");
        for (int i = 0; i < 37; i++) {
            for (int j = 0; j < 9; j++) {
                if (i % 4 == 0){
                    tablero[i][j]=fila_llena();
                    if (accion == 2 && colocar == 1) {
                        if (i+4 == x && j == y) {
                            tablero[i][j]=pared_arriba();
                        }
                        if (i+4 == x && j+1 == y) {
                            tablero[i][j]=pared_arriba();
                        }
                    }
                    if (accion == 2 && colocar == 2) {
                        if (i == x && j == y) {
                            tablero[i][j]=pared_abajo();
                        }
                        if (i == x && j+1 == y) {
                            tablero[i][j]=pared_abajo();
                        }
                    }
                } else {
                    tablero[i][j]=fila_vacia();
                    if (i == posicion_jugador_1_i && j == posicion_jugador_1_j) {
                        tablero[i][j]=posicion_jugador1();
                    }
                    if (i == posicion_jugador_2_i && j == posicion_jugador_2_j) {
                        tablero[i][j]=posicion_jugador2();
                    }
                    if (accion == 2 && colocar == 3) {
                        if (i-3 == x && j+1 == y) {
                            tablero[i][j]=pared_izquierda();
                        }
                        if (i-2 == x && j+1 == y) {
                            tablero[i][j]=pared_izquierda();
                        }
                        if (i-1 == x && j+1 == y) {
                            tablero[i][j]=pared_izquierda();
                        }
                        if (i+1 == x && j+1 == y) {
                            tablero[i][j]=pared_izquierda();
                        }
                        if (i+2 == x && j+1 == y) {
                            tablero[i][j]=pared_izquierda();
                        }
                        if (i+3 == x && j+1 == y) {
                            tablero[i][j]=pared_izquierda();
                        }
                    }
                    if (accion == 2 && colocar == 4) {
                        if (i-3 == x && j == y) {
                            tablero[i][j]=pared_derecha();
                        }
                        if (i-2 == x && j == y) {
                            tablero[i][j]=pared_derecha();
                        }
                        if (i-1 == x && j == y) {
                            tablero[i][j]=pared_derecha();
                        }
                        if (i+1 == x && j == y) {
                            tablero[i][j]=pared_derecha();
                        }
                        if (i+2 == x && j == y) {
                            tablero[i][j]=pared_derecha();
                        }
                        if (i+3 == x && j == y) {
                            tablero[i][j]=pared_derecha();
                        }
                    }
                }
                System.out.print(tablero[i][j]);
            }
            System.out.println("#");
        }
        System.out.println("");
    }
}

