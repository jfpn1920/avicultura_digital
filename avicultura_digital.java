import java.util.Scanner;
public class avicultura_digital {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String[] lotes = new String[10];
        String[] razas = new String[10];
        int[] cantidades = new int[10];
        int[] edades = new int[10];
        String[] alimentos = new String[10];
        double[] consumos = new double[10];
        int[] producciones = new int[10];
        String[] vacunaciones = new String[10];
        String[] galpones = new String[10];
        String[] estados = new String[10];
        int total = 0;
        int opcion;
        //------------------------------------------//
        //--|menu_principal_de_avicultura_digital|--//
        //------------------------------------------//
        do {
            System.out.println("menu principal de avicultura digital");
            System.out.println("1) Registrar lote");
            System.out.println("2) Editar lote");
            System.out.println("3) Listar lotes");
            System.out.println("4) Buscar lote");
            System.out.println("5) Eliminar lote");
            System.out.println("6) Mostrar resumen");
            System.out.println("7) Salir");
            System.out.print("Seleccione una opcion: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                //--------------------//
                //--|registrar_lote|--//
                //--------------------//
                case 1:
                    if (total >= lotes.length) {
                        System.out.println("No hay espacio para registrar mas lotes.");
                        break;
                    }
                    System.out.println("registro de lote");
                    System.out.println("ID: " + (total + 1));
                    System.out.print("identificacion del lote: ");
                    lotes[total] = entrada.nextLine();
                    System.out.print("raza: ");
                    razas[total] = entrada.nextLine();
                    System.out.print("cantidad de aves: ");
                    cantidades[total] = entrada.nextInt();
                    System.out.print("edad en semanas: ");
                    edades[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("tipo de alimento: ");
                    alimentos[total] = entrada.nextLine();
                    System.out.print("consumo de alimento en kg: ");
                    consumos[total] = entrada.nextDouble();
                    System.out.print("produccion de huevos: ");
                    producciones[total] = entrada.nextInt();
                    entrada.nextLine();
                    System.out.print("estado de vacunacion: ");
                    vacunaciones[total] = entrada.nextLine();
                    System.out.print("galpon: ");
                    galpones[total] = entrada.nextLine();
                    System.out.print("estado del lote: ");
                    estados[total] = entrada.nextLine();
                    total++;
                    System.out.println("Lote registrado correctamente.");
                    break;
                //-----------------//
                //--|editar_lote|--//
                //-----------------//
                case 2:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                        break;
                    }
                    System.out.println("datos de los lotes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Lote: " + lotes[i] + " | Raza: " + razas[i] + " | Cantidad: " + cantidades[i] + " | Edad: " + edades[i] + " semanas | Alimento: " + alimentos[i] + " | Consumo: " + consumos[i] + " kg | Produccion: " + producciones[i] + " huevos | Vacunacion: " + vacunaciones[i] + " | Galpon: " + galpones[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del lote a editar: ");
                    int idEditar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEditar >= 1 && idEditar <= total) {
                        int posicion = idEditar - 1;
                        System.out.println("editar lote");
                        System.out.print("nueva identificacion del lote: ");
                        lotes[posicion] = entrada.nextLine();
                        System.out.print("nueva raza: ");
                        razas[posicion] = entrada.nextLine();
                        System.out.print("nueva cantidad de aves: ");
                        cantidades[posicion] = entrada.nextInt();
                        System.out.print("nueva edad en semanas: ");
                        edades[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("nuevo tipo de alimento: ");
                        alimentos[posicion] = entrada.nextLine();
                        System.out.print("nuevo consumo de alimento en kg: ");
                        consumos[posicion] = entrada.nextDouble();
                        System.out.print("nueva produccion de huevos: ");
                        producciones[posicion] = entrada.nextInt();
                        entrada.nextLine();
                        System.out.print("nuevo estado de vacunacion: ");
                        vacunaciones[posicion] = entrada.nextLine();
                        System.out.print("nuevo galpon: ");
                        galpones[posicion] = entrada.nextLine();
                        System.out.print("nuevo estado del lote: ");
                        estados[posicion] = entrada.nextLine();
                        System.out.println("Lote actualizado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //------------------//
                //--|listar_lotes|--//
                //------------------//
                case 3:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                    } else {
                        System.out.println("lista de lotes");
                        for (int i = 0; i < total; i++) {
                            System.out.println("ID: " + (i + 1) + " | Lote: " + lotes[i] + " | Raza: " + razas[i] + " | Cantidad: " + cantidades[i] + " | Edad: " + edades[i] + " semanas | Alimento: " + alimentos[i] + " | Consumo: " + consumos[i] + " kg | Produccion: " + producciones[i] + " huevos | Vacunacion: " + vacunaciones[i] + " | Galpon: " + galpones[i] + " | Estado: " + estados[i]);
                        }
                    }
                    break;
                //-----------------//
                //--|buscar_lote|--//
                //-----------------//
                case 4:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                        break;
                    }
                    System.out.println("busqueda de lote");
                    System.out.print("Ingrese el ID del lote a buscar: ");
                    int idBusqueda = entrada.nextInt();
                    entrada.nextLine();
                    if (idBusqueda >= 1 && idBusqueda <= total) {
                        int posicion = idBusqueda - 1;
                        System.out.println("lote encontrado");
                        System.out.println("ID: " + idBusqueda + " | Lote: " + lotes[posicion] + " | Raza: " + razas[posicion] + " | Cantidad: " + cantidades[posicion] + " | Edad: " + edades[posicion] + " semanas | Alimento: " + alimentos[posicion] + " | Consumo: " + consumos[posicion] + " kg | Produccion: " + producciones[posicion] + " huevos | Vacunacion: " + vacunaciones[posicion] + " | Galpon: " + galpones[posicion] + " | Estado: " + estados[posicion]);
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //-------------------//
                //--|eliminar_lote|--//
                //-------------------//
                case 5:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                        break;
                    }
                    System.out.println("datos de los lotes");
                    for (int i = 0; i < total; i++) {
                        System.out.println("ID: " + (i + 1) + " | Lote: " + lotes[i] + " | Raza: " + razas[i] + " | Cantidad: " + cantidades[i] + " | Edad: " + edades[i] + " semanas | Alimento: " + alimentos[i] + " | Consumo: " + consumos[i] + " kg | Produccion: " + producciones[i] + " huevos | Vacunacion: " + vacunaciones[i] + " | Galpon: " + galpones[i] + " | Estado: " + estados[i]);
                    }
                    System.out.print("Ingrese el ID del lote a eliminar: ");
                    int idEliminar = entrada.nextInt();
                    entrada.nextLine();
                    if (idEliminar >= 1 && idEliminar <= total) {
                        int posicion = idEliminar - 1;
                        for (int i = posicion; i < total - 1; i++) {
                            lotes[i] = lotes[i + 1];
                            razas[i] = razas[i + 1];
                            cantidades[i] = cantidades[i + 1];
                            edades[i] = edades[i + 1];
                            alimentos[i] = alimentos[i + 1];
                            consumos[i] = consumos[i + 1];
                            producciones[i] = producciones[i + 1];
                            vacunaciones[i] = vacunaciones[i + 1];
                            galpones[i] = galpones[i + 1];
                            estados[i] = estados[i + 1];
                        }
                        total--;
                        System.out.println("Lote eliminado correctamente.");
                    } else {
                        System.out.println("ID no encontrada.");
                    }
                    break;
                //---------------------//
                //--|mostrar_resumen|--//
                //---------------------//
                case 6:
                    if (total == 0) {
                        System.out.println("No existen lotes registrados.");
                        break;
                    }
                    int totalAves = 0;
                    int totalHuevos = 0;
                    double totalAlimento = 0;
                    int mayorCantidad = cantidades[0];
                    String loteMayorCantidad = lotes[0];
                    for (int i = 0; i < total; i++) {
                        totalAves += cantidades[i];
                        totalHuevos += producciones[i];
                        totalAlimento += consumos[i];
                        if (cantidades[i] > mayorCantidad) {
                            mayorCantidad = cantidades[i];
                            loteMayorCantidad = lotes[i];
                        }
                    }
                    String razaMayor = razas[0];
                    int cantidadRazaMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadRaza = 0;
                        for (int j = 0; j < total; j++) {
                            if (razas[i].equalsIgnoreCase(razas[j])) {
                                cantidadRaza++;
                            }
                        }
                        if (cantidadRaza > cantidadRazaMayor) {
                            cantidadRazaMayor = cantidadRaza;
                            razaMayor = razas[i];
                        }
                    }
                    String galponMayor = galpones[0];
                    int cantidadGalponMayor = 0;
                    for (int i = 0; i < total; i++) {
                        int cantidadGalpon = 0;
                        for (int j = 0; j < total; j++) {
                            if (galpones[i].equalsIgnoreCase(galpones[j])) {
                                cantidadGalpon++;
                            }
                        }
                        if (cantidadGalpon > cantidadGalponMayor) {
                            cantidadGalponMayor = cantidadGalpon;
                            galponMayor = galpones[i];
                        }
                    }
                    int vacunados = 0;
                    int pendientes = 0;
                    int tratamientos = 0;
                    int activos = 0;
                    int enProduccion = 0;
                    int enCrecimiento = 0;
                    int finalizados = 0;
                    for (int i = 0; i < total; i++) {
                        if (vacunaciones[i].equalsIgnoreCase("Vacunado")) {
                            vacunados++;
                        } else if (vacunaciones[i].equalsIgnoreCase("Pendiente")) {
                            pendientes++;
                        } else if (vacunaciones[i].equalsIgnoreCase("En tratamiento")) {
                            tratamientos++;
                        }
                        if (estados[i].equalsIgnoreCase("Activo")) {
                            activos++;
                        } else if (estados[i].equalsIgnoreCase("En produccion")) {
                            enProduccion++;
                        } else if (estados[i].equalsIgnoreCase("En crecimiento")) {
                            enCrecimiento++;
                        } else if (estados[i].equalsIgnoreCase("Finalizado")) {
                            finalizados++;
                        }
                    }
                    double promedioHuevos = (double) totalHuevos / total;
                    double promedioAlimento = totalAlimento / total;
                    System.out.println("resumen de avicultura digital");
                    System.out.println("Lotes registrados: " + total);
                    System.out.println("Total de aves: " + totalAves);
                    System.out.println("Raza mas utilizada: " + razaMayor);
                    System.out.println("Lote con mayor cantidad de aves: " + loteMayorCantidad);
                    System.out.println("Mayor cantidad de aves: " + mayorCantidad);
                    System.out.println("Total de huevos producidos: " + totalHuevos);
                    System.out.println("Promedio de huevos por lote: " + promedioHuevos);
                    System.out.println("Total de alimento consumido: " + totalAlimento + " kg");
                    System.out.println("Promedio de alimento por lote: " + promedioAlimento + " kg");
                    System.out.println("Galpon mas utilizado: " + galponMayor);
                    System.out.println("Lotes vacunados: " + vacunados);
                    System.out.println("Lotes pendientes: " + pendientes);
                    System.out.println("Lotes en tratamiento: " + tratamientos);
                    System.out.println("Lotes activos: " + activos);
                    System.out.println("Lotes en produccion: " + enProduccion);
                    System.out.println("Lotes en crecimiento: " + enCrecimiento);
                    System.out.println("Lotes finalizados: " + finalizados);
                    break;
                //------------------------------//
                //--|salir_del_menu_principal|--//
                //------------------------------//
                case 7:
                    System.out.println("Gracias por utilizar Avicultura Digital.");
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (opcion != 7);
        entrada.close();
    }
}