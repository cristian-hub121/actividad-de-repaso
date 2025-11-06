/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package pood2.prueb3;

import java.util.Scanner;

/**
 *
 * @author ALUMNO#
 */
public class Prueb3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in, opc;
        String Nombre, tid;
        boolean Salir = true;
        
        while (Salir) {
            System.out.println("desea ingesar clientes? 1 - si o 2 - no: ");
            System.out.println("1 = si");
            System.out.println("2 = no");

              opc = sc.nextInt();
            sc.nextLine();

            System.out.println();
            System.out.println("*****REGISTRO DE DATOS****");

            System.out.println("ingrese su tipo de identificacion: ");
            tid = sc.nextLine();

            System.out.println("ingrese se numero de identificacion: ");
            in = sc.nextInt();

            sc.nextLine();

            System.out.println("ingrese su nombre");
            Nombre = sc.nextLine();

            System.out.println();
            System.out.println("tipo de identificacion: " + tid);
            System.out.println("identificacion: " + in);
            System.out.println("nombre: " + Nombre);

            System.out.println("desea seguir ingrensando clientes? 1 - si o 2 - no: ");
            opc = sc.nextInt();

            if (opc == 1) {
                Salir = true;
            } else {
                Salir = false;
            }
        }
    }
}
