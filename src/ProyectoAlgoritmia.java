
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel Negrete Jaider Gil Edgar consuegra Juan Betancourt Juan Bossa
 */
public class ProyectoAlgoritmia {

    public static void main(String[] args) {
        //variables, vectores.
        int CountSw, NumRamd, NumRamd2, NumRamd3, Suma2 = 0, Suma3 , Respuesta, SW = 0, SWCase22 = 0, SWCase4 = 0, SWdo = 0, Num, Num2, RamFrut, Exit = 0, SwWhile, RamNombre, RamNombre2, NumCalc,
                iFor, SwNombre, SwWhile2, NumRamdProb = 0, NumRamdProbTemp = 0;

        int NumCalcVec[] = new int[20];

        String Frut, Frut2, CadNum = "", Balon = "", Balon2 = "";

        String Frutas[] = {"Sandia", "fresas", "bananas", "melones", "manzanas", "peras", "uvas",
            "naranjas", "piñas", "mangos", "cerezas", "mamones", "mandarinas", "moras"};

        String Fruta[] = {"Sandia", "fresa", "banana", "melon", "manzana", "pera", "uva",
            "naranja", "piña", "mango", "cereza", "mamon", "mandarina", "mora"};

        String Nombres[] = {"", "Pepito", "Juan", "Emilio", "Kevin", "Wilson", "Sebastian",
            "David", "Diego", "Veronica", "Andrea", "Maria", "Jorge", "Liliana"};

        //menú
        JOptionPane.showMessageDialog(null, "Bienvenidos al programa que te ayudará a sumar, ¿estás listo?");
        while (Exit == 0) {
            CountSw = 0;
            SwWhile = 0;
            while (SwWhile == 0) {
                CountSw = Integer.parseInt(JOptionPane.showInputDialog("--------------------------------------------------- \n"
                        + "1 Aprendamos a sumar.\n"
                        + "2 Realizemos algunos Ejercicios.\n"
                        + "3 Es momento de calcular.\n"
                        + "4 Problemas verbales.\n"
                        + "5 Terminar Proceso.\n"
                        + "--------------------------------------------------- "));
                if (CountSw != 1 && CountSw != 2 && CountSw != 3 && CountSw != 4 && CountSw != 5) {
                    JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                } else {
                    SwWhile = 1;
                }
            }
            switch (CountSw) {

                case 1:
                    NumRamd = (int) (Math.random() * 10 + 1);
                    NumRamd2 = (int) (Math.random() * 10 + 1);
                    RamFrut = (int) (Math.random() * 13 + 1);
                    RamNombre = (int) (Math.random() * 13 + 1);
                    RamNombre2 = (int) (Math.random() * 13 + 1);
                    Suma2 = (NumRamd + NumRamd2);

                    //Comprobacion Nombres Iguales//
                    SwNombre = 0;
                    while (SwNombre == 0) {
                        if (RamNombre2 == RamNombre) {
                            RamNombre2 = (int) (Math.random() * 13 + 1);
                        } else {
                            SwNombre = 1;
                        }
                    }
                    //Combropacion Nombres Iguales//

                    if (NumRamd == 1) {
                        Frut = Fruta[RamFrut];
                    } else {
                        Frut = Frutas[RamFrut];
                    }
                    if (NumRamd2 == 1) {
                        Frut2 = Fruta[RamFrut];
                    } else {
                        Frut2 = Frutas[RamFrut];
                    }

                    JOptionPane.showMessageDialog(null, "Si " + Nombres[RamNombre] + " tiene: " + NumRamd + " " + Frut + "\n"
                            + " " + Nombres[RamNombre2] + " tiene: " + NumRamd2 + " " + Frut2 + "\n"
                            + " y ellos deciden juntar el total de " + Frutas[RamFrut] + "\n"
                            + "¿cuantas " + Frutas[RamFrut] + " hay en total?");
                    JOptionPane.showMessageDialog(null, "Debemos sumar el total de " + Frutas[RamFrut] + " de " + Nombres[RamNombre] + "\n"
                            + "mas el total de " + Frutas[RamFrut] + " de " + Nombres[RamNombre2] + " \n"
                            + "numero de " + Frutas[RamFrut] + " " + Nombres[RamNombre] + ": " + NumRamd + "\n"
                            + "numero de " + Frutas[RamFrut] + " " + Nombres[RamNombre2] + ": " + NumRamd2 + "\n"
                            + "el total de " + Frutas[RamFrut] + " sera: " + Suma2 + "\n"
                            + "porque " + NumRamd + " + " + NumRamd2 + " = " + Suma2);

                    break;

                case 2:

                    SW = 0;
                    while (SW == 0) {
                        SW = 0;
                        NumRamd = (int) (Math.random() * 10 + 1);
                        NumRamd2 = (int) (Math.random() * 10 + 1);
                        RamFrut = (int) (Math.random() * 13 + 1);
                        RamNombre = (int) (Math.random() * 13 + 1);
                        RamNombre2 = (int) (Math.random() * 13 + 1);
                        Suma2 = (NumRamd + NumRamd2);

                        //Comprobacion Nombres Iguales//
                        SwNombre = 0;
                        while (SwNombre == 0) {
                            if (RamNombre2 == RamNombre) {
                                RamNombre2 = (int) (Math.random() * 13 + 1);
                            } else {
                                SwNombre = 1;
                            }
                        }
                        //Combropacion Nombres Iguales//

                        if (NumRamd == 1) {
                            Frut = Fruta[RamFrut];
                        } else {
                            Frut = Frutas[RamFrut];
                        }
                        if (NumRamd2 == 1) {
                            Frut2 = Fruta[RamFrut];
                        } else {
                            Frut2 = Frutas[RamFrut];
                        }
                        Respuesta = Integer.parseInt(JOptionPane.showInputDialog(Nombres[RamNombre] + " tiene " + NumRamd + " " + Frut + "\n"
                                + Nombres[RamNombre2] + " tiene " + NumRamd2 + " " + Frut2 + "\n"
                                + " ¿Cuantas " + Frutas[RamFrut] + " hay, si sumamos todas las frutas? :"));

                        if (Respuesta == Suma2) {
                            JOptionPane.showMessageDialog(null, "Felicidades respondiste correctamente.\n"
                                    + "total de " + Frutas[RamFrut] + " es: " + Suma2);
                            SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentarlo?\n"
                                    + "0  Si\n"
                                    + "1  No"));
                            while (SW != 1 && SW != 0) {

                                JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                                SW = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres volver a intentarlo?\n"
                                        + "0  Si\n"
                                        + "1  No"));
                            }

                        } else {
                            SW = Integer.parseInt(JOptionPane.showInputDialog("ohhhhh vaya fallaste\n"
                                    + "La suma de las " + Frutas[RamFrut] + " de " + Nombres[RamNombre] + "\n"
                                    + "y las " + Frutas[RamFrut] + " de " + Nombres[RamNombre2] + " dan un total de : " + Suma2 + "\n"
                                    + "Te recomendamos entrar a la opcion 1 del programa para que mejores.\n"
                                    + "¿Quieres Volver a intentarlo?\n"
                                    + "0 Si\n"
                                    + "1 No"));
                        }
                        while (SW != 1 && SW != 0) {

                            JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                            SW = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres volver a intentarlo?\n"
                                    + "0  Si\n"
                                    + "1  No"));
                        }

                    }
                    break;

                case 3:

                    NumCalc = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de digitos a sumar: "));
                    Suma2 = 0;
                    CadNum = "";
                    for (iFor = 1; iFor <= NumCalc; iFor++) {
                        NumCalcVec[iFor] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese numero " + iFor + ": "));
                        Suma2 = Suma2 + NumCalcVec[iFor];
                        if (iFor < NumCalc) {
                            CadNum = CadNum + "                     " + NumCalcVec[iFor] + "\n";
                        } else if (iFor == NumCalc) {
                            CadNum = CadNum + "                +   " + NumCalcVec[iFor] + "\n";
                        }
                    }

                    JOptionPane.showMessageDialog(null, "--------------------------------------\n\n"
                            + "     Calculadora (Suma)\n\n\n"
                            + "" + CadNum + "\n"
                            + "               ------------\n"
                            + "                     " + Suma2 + "\n\n"
                            + "--------------------------------------");
                    Suma2 = 0;
                    CadNum = "";
                    break;

                case 4:

                    SWCase4 = 0;

                    while (SWCase4 == 0) {

                        NumRamdProb = (int) (Math.random() * 3 + 1);

                        if (NumRamdProb == NumRamdProbTemp) {

                            while (NumRamdProb == NumRamdProbTemp) {

                                NumRamdProb = (int) (Math.random() * 3 + 1);

                            }

                        }

                        NumRamdProbTemp = NumRamdProb;
                        NumRamd = (int) (Math.random() * 20 + 1);
                        NumRamd2 = (int) (Math.random() * 20 + 1);
                        NumRamd3 = (int) (Math.random() * 20 + 1);
                        Suma2 = (NumRamd + NumRamd2);
                        Suma3 = (NumRamd + NumRamd2 + NumRamd3);

                        //Problema #1
                        if (NumRamd == 1) {
                            Balon = "balon";
                        } else {
                            Balon = "balones";
                        }
                        if (NumRamd2 == 1) {
                            Balon2 = "balon";
                        } else {
                            Balon2 = "balones";
                        }
                        //Problema #1

                        switch (NumRamdProbTemp) {

                            case 1:
                                SWCase22 = 0;
                                while (SWCase22 == 0) {
                                    Respuesta = Integer.parseInt(JOptionPane.showInputDialog("En el gimnasio de mi colegio hay "
                                            + NumRamd + " " + Balon + " de fútbol,\n" + NumRamd2 + " "
                                            + Balon2 + " de baloncesto.\n "
                                            + "¿Cuántos balones hay en total?"));
                                    if (Respuesta == Suma2) {
                                        JOptionPane.showMessageDialog(null, "Si, la suma de balones de futbol: " + NumRamd + ", \n"
                                                + "mas los balones de baloncesto: " + NumRamd2 + "\n"
                                                + "es: " + Suma2 + "\n"
                                                + "(" + NumRamd + " + " + NumRamd2 + " = " + Suma2 + ")\n"
                                                + "Total de balones : " + Suma2);
                                        SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                + "0  Intentar con otro problema.\n"
                                                + "1  Intentar nuevamente.\n"
                                                + "2  Salir al menú principal."));
                                        while (SW != 1 && SW != 0 && SW != 2) {

                                            JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                                            SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                    + "0  Intentar con otro problema.\n"
                                                    + "1  Intentar nuevamente.\n"
                                                    + "2  Salir al menú principal."));
                                        }
                                        if (SW == 0) {
                                            SWCase22 = 1;
                                        } else if (SW == 1) {
                                            NumRamd = (int) (Math.random() * 20 + 1);
                                            NumRamd2 = (int) (Math.random() * 20 + 1);
                                            Suma2 = (NumRamd + NumRamd2);
                                            //Problema #1
                                            if (NumRamd == 1) {
                                                Balon = "balon";
                                            } else {
                                                Balon = "balones";
                                            }
                                            if (NumRamd2 == 1) {
                                                Balon2 = "balon";
                                            } else {
                                                Balon2 = "balones";
                                            }
                                            //Problema #1
                                        } else {
                                            SWCase22 = 1;
                                            SWCase4 = 1;
                                        }

                                    } else {
                                        JOptionPane.showMessageDialog(null, "Ohh vaya, te has equivocado.\n"
                                                + "la respuesta es : " + Suma2 + " balones.\n"
                                                + "porque si sumamos los balones que hay en el gimnasio: \n"
                                                + NumRamd + " " + Balon + " de futbol\n"
                                                + NumRamd2 + " " + Balon2 + " de baloncesto\n"
                                                + "la suma nos dará " + Suma2 + ".");
                                        SW = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                + "0  Intentar con otro problema.\n"
                                                + "1  Intentar nuevamente.\n"
                                                + "2  Salir al menú principal."));
                                        while (SW != 1 && SW != 0 && SW != 2) {

                                            JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                                            SW = Integer.parseInt(JOptionPane.showInputDialog("¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                    + "0  Intentar con otro problema.\n"
                                                    + "1  Intentar nuevamente.\n"
                                                    + "2  Salir al menú principal."));
                                        }
                                        if (SW == 0) {
                                            SWCase22 = 1;
                                        } else if (SW == 1) {
                                            NumRamd = (int) (Math.random() * 20 + 1);
                                            NumRamd2 = (int) (Math.random() * 20 + 1);
                                            Suma2 = (NumRamd + NumRamd2);
                                            //Problema #1
                                            if (NumRamd == 1) {
                                                Balon = "balon";
                                            } else {
                                                Balon = "balones";
                                            }
                                            if (NumRamd2 == 1) {
                                                Balon2 = "balon";
                                            } else {
                                                Balon2 = "balones";
                                            }
                                            //Problema #1
                                        } else {
                                            SWCase22 = 1;
                                            SWCase4 = 1;
                                        }

                                    }
                                }
                                break;

                            case 2:
                                SWCase22 = 0;
                                while (SWCase22 == 0) {
                                    Respuesta = Integer.parseInt(JOptionPane.showInputDialog("María tiene " + NumRamd + " manzanas, \n"
                                            + "Pedro tiene " + NumRamd2 + " manzanas \n"
                                            + "y Susana tiene " + NumRamd3 + ".\n"
                                            + " Si juntan todas las manzanas en una cesta\n"
                                            + "¿Cuántas manzanas tienen en total?"));
                                    if (Respuesta == Suma3) {
                                        JOptionPane.showMessageDialog(null, "Si, la suma de manzanas de María: " + NumRamd + ", \n"
                                                + "mas las manzanas de Predro: " + NumRamd2 + "\n"
                                                + "y las manzanas de Susana: " + NumRamd3 + "\n"
                                                + "es: " + Suma3 + ".\n"
                                                + "(" + NumRamd + " + " + NumRamd2 + " + " + NumRamd3 + " = " + Suma3 + ")\n"
                                                + "Total de manzanas : " + Suma3);
                                        SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                + "0  Intentar con otro problema.\n"
                                                + "1  Intentar nuevamente.\n"
                                                + "2  Salir al menú principal."));
                                        while (SW != 1 && SW != 0 && SW != 2) {

                                            JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                                            SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                    + "0  Intentar con otro problema.\n"
                                                    + "1  Intentar nuevamente.\n"
                                                    + "2  Salir al menú principal."));
                                        }
                                        if (SW == 0) {
                                            SWCase22 = 1;
                                        } else if (SW == 1) {
                                            NumRamd = (int) (Math.random() * 20 + 1);
                                            NumRamd2 = (int) (Math.random() * 20 + 1);
                                            Suma2 = (NumRamd + NumRamd2);
                                            //Problema #1
                                            if (NumRamd == 1) {
                                                Balon = "balon";
                                            } else {
                                                Balon = "balones";
                                            }
                                            if (NumRamd2 == 1) {
                                                Balon2 = "balon";
                                            } else {
                                                Balon2 = "balones";
                                            }
                                            //Problema #1
                                        } else {
                                            SWCase22 = 1;
                                            SWCase4 = 1;
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "Ohhh no, algo te esta fallando.\n"
                                                + "Te recomendamos la opcion 1 para aprender a sumar,\n"
                                                + "pero tambien te recomendamos usar la opcion 2, para practicar\n"
                                                + "con ejercicios mas sencillos\n"
                                                + "y la opcion 3, para calcular sumas\n"
                                                + "o puedes intentar de nuevo.");
                                        SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                + "0  Intentar con otro problema.\n"
                                                + "1  Intentar nuevamente.\n"
                                                + "2  Salir al menú principal."));
                                        while (SW != 1 && SW != 0 && SW != 2) {

                                            JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                                            SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                    + "0  Intentar con otro problema.\n"
                                                    + "1  Intentar nuevamente.\n"
                                                    + "2  Salir al menú principal."));
                                        }
                                        if (SW == 0) {
                                            SWCase22 = 1;
                                        } else if (SW == 1) {
                                            NumRamd = (int) (Math.random() * 20 + 1);
                                            NumRamd2 = (int) (Math.random() * 20 + 1);
                                            Suma2 = (NumRamd + NumRamd2);
                                            //Problema #1
                                            if (NumRamd == 1) {
                                                Balon = "balon";
                                            } else {
                                                Balon = "balones";
                                            }
                                            if (NumRamd2 == 1) {
                                                Balon2 = "balon";
                                            } else {
                                                Balon2 = "balones";
                                            }
                                            //Problema #1
                                        } else {
                                            SWCase22 = 1;
                                            SWCase4 = 1;
                                        }
                                    }
                                }
                                break;

                            case 3:
                                SWCase22 = 0;
                                while (SWCase22 == 0) {
                                    Respuesta = Integer.parseInt(JOptionPane.showInputDialog("En un aparcamiento hay " + NumRamd + " coches.\n"
                                            + " Han llegado otros " + NumRamd2 + " más. \n"
                                            + "¿Cuántos coches hay ahora?"));
                                    if (Respuesta == Suma2) {
                                        JOptionPane.showMessageDialog(null, "Wow impresionante\n"
                                                + "estas en lo cierto, si entran " + NumRamd2 + " coches al aparcamiento\n"
                                                + "y dentro del aparcamiento se encuentran " + NumRamd + " coches,\n"
                                                + "ahoran habran " + Suma2 + " coches\n"
                                                + "(" + NumRamd + " + " + NumRamd2 + " = " + Suma2 + ")");
                                        SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                + "0  Intentar con otro problema.\n"
                                                + "1  Intentar nuevamente.\n"
                                                + "2  Salir al menú principal."));
                                        while (SW != 1 && SW != 0 && SW != 2) {

                                            JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                                            SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                    + "0  Intentar con otro problema.\n"
                                                    + "1  Intentar nuevamente.\n"
                                                    + "2  Salir al menú principal."));
                                        }
                                        if (SW == 0) {
                                            SWCase22 = 1;
                                        } else if (SW == 1) {
                                            NumRamd = (int) (Math.random() * 20 + 1);
                                            NumRamd2 = (int) (Math.random() * 20 + 1);
                                            Suma2 = (NumRamd + NumRamd2);
                                            //Problema #1
                                            if (NumRamd == 1) {
                                                Balon = "balon";
                                            } else {
                                                Balon = "balones";
                                            }
                                            if (NumRamd2 == 1) {
                                                Balon2 = "balon";
                                            } else {
                                                Balon2 = "balones";
                                            }
                                            //Problema #1
                                        } else {
                                            SWCase22 = 1;
                                            SWCase4 = 1;
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(null, "F, no es la respuesta.\n"
                                                + "si al llegar " + NumRamd2 + " coches\n"
                                                + "y ya habian " + NumRamd + " coches\n"
                                                + "solo tienes que sumar " + "(" + NumRamd2 + " + " + NumRamd + ")\n"
                                                + "Resultado = " + Suma3);
                                        SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                + "0  Intentar con otro problema.\n"
                                                + "1  Intentar nuevamente.\n"
                                                + "2  Salir al menú principal."));
                                        while (SW != 1 && SW != 0 && SW != 2) {

                                            JOptionPane.showMessageDialog(null, "Upsss, Seleccione una opcion valida", "Error", JOptionPane.ERROR_MESSAGE);
                                            SW = Integer.parseInt(JOptionPane.showInputDialog("Estupendo, ¿Quieres volver a intentar el mismo problema o intentar con otro?\n"
                                                    + "0  Intentar con otro problema.\n"
                                                    + "1  Intentar nuevamente.\n"
                                                    + "2  Salir al menú principal."));
                                        }
                                        if (SW == 0) {
                                            SWCase22 = 1;
                                        } else if (SW == 1) {
                                            NumRamd = (int) (Math.random() * 20 + 1);
                                            NumRamd2 = (int) (Math.random() * 20 + 1);
                                            Suma2 = (NumRamd + NumRamd2);
                                            //Problema #1
                                            if (NumRamd == 1) {
                                                Balon = "balon";
                                            } else {
                                                Balon = "balones";
                                            }
                                            if (NumRamd2 == 1) {
                                                Balon2 = "balon";
                                            } else {
                                                Balon2 = "balones";
                                            }
                                            //Problema #1
                                        } else {
                                            SWCase22 = 1;
                                            SWCase4 = 1;
                                        }

                                    }
                                }
                                break;

                        }
                    }

                    break;

                case 5:
                    Exit = 1;
                    break;

            }
        }
    }
}
