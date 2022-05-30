import computer.ComputersDesktop;
import cookies.Cookies;
import shoes.Shoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean exit = false;

        ArrayList<ComputersDesktop> listComputers = new ArrayList<>();
        ArrayList<Cookies> listCookies = new ArrayList<>();
        ArrayList<Shoes> listShoes = new ArrayList<>();

        do{
            String option = "";
            showMenu(input);
            option = input.nextLine();

            if(option.equals("1"))
                showComputers(input, listComputers);
            else if(option.equals("2"))
                showCookies(input, listCookies);
            else if(option.equals("3"))
                showShoes(input, listShoes);
            else if(option.equals("4")){
                System.out.println("Saliendo...");
                exit = true;
            }
            else
                System.out.println("Opcion invalida.");
        }while(!exit);
    }

    private static void showMenu(Scanner input) {
        System.out.println("#####################################################");
        System.out.println("##########      WELCOME TO INVENTARY       ##########");
        System.out.println("#####################################################");
        System.out.println();
        System.out.println("-----------------------------------------------------");
        System.out.println("[1] Computadoras");
        System.out.println("[2] Galletas");
        System.out.println("[3] Zapatos");
        System.out.println("[4] Salir");
        System.out.println("----------------   Elige una opcion: ");
    }
    private static void showMenuComputers(Scanner input) {
        System.out.println();
        System.out.println("===================== MENU PC'S =====================");
        System.out.println("=====================================================");
        System.out.println("=> 1 : Ver");
        System.out.println("=> 2 : agregar");
        System.out.println("=> 3 : eliminar");
        System.out.println("=> 4 : Salir");
        System.out.println("================   Elige una opcion: ");
    }
    private static void showMenuCookies(Scanner input) {
        System.out.println();
        System.out.println("==================== MENU COOKIES ===================");
        System.out.println("=====================================================");
        System.out.println("=> 1 : Ver");
        System.out.println("=> 2 : agregar");
        System.out.println("=> 3 : eliminar");
        System.out.println("=> 4 : Salir");
        System.out.println("================   Elige una opcion: ");
    }
    private static void showMenuShoes(Scanner input) {
        System.out.println();
        System.out.println("====================  MENU SHOES  ===================");
        System.out.println("=====================================================");
        System.out.println("=> 1 : Ver");
        System.out.println("=> 2 : agregar");
        System.out.println("=> 3 : eliminar");
        System.out.println("=> 4 : Salir");
        System.out.println("================   Elige una opcion: ");
    }

    //COMPUTERS
    private static void showComputers(Scanner input, ArrayList<ComputersDesktop> listComputers) {
        boolean exit = false;
        String provided = "";
        String address = "";
        String name = "";
        String code = "";
        int price = 0;
        int amount = 0;
        String type = "";
        String trademark = "";

        do{
            String option = "";
            showMenuComputers(input);
            option = input.nextLine();

            if(option.equals("1")) {
                showListOfPc(listComputers);
            }
            else if(option.equals("2"))
                addNewPCtoList(provided, address, name, code, price, amount, type, trademark, input, listComputers);
            else if(option.equals("3")) {
                System.out.println("Ingrese el codigo del que desea eliminar: ");
                String delete = input.nextLine();
                listComputers.removeIf(pc -> pc.getCode().equals(delete));
            }
            else if(option.equals("4")){
                System.out.println("Regresando...");
                exit = true;
            }
            else
                System.out.println("Opcion invalida.");
        }while(!exit);

    }
    private static void showListOfPc(ArrayList<ComputersDesktop> listComputers) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %28s %15s %15s %15s %10s %10s %10s %15s", "PROVIDED", "ADDRESS", "NAME", "CODE", "PRICE", "AMOUNT", "TYPE", "TRADEMARK", "TOTAL DUE");
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        if (listComputers.isEmpty()) System.out.println("No hay registros ");
        listComputers.forEach(element -> {
            System.out.printf("%15s %28s %15s %15s %15.2f %10d %10s %10s %15.2f",
                    element.getProvider(), element.getAdress(), element.getName(), element.getCode(), element.getPrice(), element.getAmount(), element.getType(), element.getTrademark(), element.totalDue()
            );
            System.out.println();
        });
        System.out.println("________________________________________________________________________________________________________________________________________");
    }
    private static void addNewPCtoList(
            String provided,String address,String name,
            String code,int price,int amount,String  type,
            String  trademark, Scanner input, ArrayList<ComputersDesktop> listComputers
    ) {
        System.out.println("Ingresa los datos: ");
        System.out.println("Proveedor:  ");
        provided = input.nextLine();
        System.out.println("Direccion:  ");
        address = input.nextLine();
        System.out.println("Nombre:  ");
        name = input.nextLine();
        System.out.println("Codigo:  ");
        code = input.nextLine();
        System.out.println("Precio:  ");
        price = Integer.parseInt(input.nextLine());
        System.out.println("Cantidad:  ");
        amount = Integer.parseInt(input.nextLine());
        System.out.println("Tipo (desktop/laptop):  ");
        type = input.nextLine();
        System.out.println("Marca:  ");
        trademark = input.nextLine();
        listComputers.add(new ComputersDesktop(provided, address, name, code, price, amount, type, trademark));
    }

    //COOKIES
    private static void showCookies(Scanner input, ArrayList<Cookies> listCookies) {
        boolean exit = false;
        String provided = "";
        String address = "";
        String name = "";
        String code = "";
        int price = 0;
        int amount = 0;
        String flavor = "";

        do{
            String option = "";
            showMenuCookies(input);
            option = input.nextLine();

            if(option.equals("1")) {
                showListOfCookies(listCookies);
            }
            else if(option.equals("2"))
                addNewCookieToList(provided, address, name, code, price, amount, flavor, input, listCookies);
            else if(option.equals("3")) {
                System.out.println("Ingrese el codigo del que desea eliminar: ");
                String delete = input.nextLine();
                listCookies.removeIf(cookie -> cookie.getCode().equals(delete));
            }
            else if(option.equals("4")){
                System.out.println("Regresando...");
                exit = true;
            }
            else
                System.out.println("Opcion invalida.");
        }while(!exit);
    }
    private static void showListOfCookies(ArrayList<Cookies> listCookies) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %28s %15s %15s %15s %10s %15s %15s", "PROVIDED", "ADDRESS", "NAME", "CODE", "PRICE", "AMOUNT", "FLAVOR", "TOTAL DUE");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        if (listCookies.isEmpty()) System.out.println("No hay registros  ");
        listCookies.forEach(element -> {
            System.out.printf("%15s %28s %15s %15s %15.2f %10d %15s %15.2f",
                    element.getProvider(), element.getAdress(), element.getName(), element.getCode(), element.getPrice(), element.getAmount(), element.getFlavor(),element.totalDue()
            );
            System.out.println();
        });
        System.out.println("________________________________________________________________________________________________________________________________________");
    }
    private static void addNewCookieToList(
            String provided,String address,String name,
            String code,int price,int amount,String flavor,
            Scanner input, ArrayList<Cookies> listCookies
    ) {
        System.out.println("Ingresa los datos: ");
        System.out.println("Proveedor:  ");
        provided = input.nextLine();
        System.out.println("Direccion:  ");
        address = input.nextLine();
        System.out.println("Nombre:  ");
        name = input.nextLine();
        System.out.println("Codigo:  ");
        code = input.nextLine();
        System.out.println("Precio:  ");
        price = Integer.parseInt(input.nextLine());
        System.out.println("Cantidad:  ");
        amount = Integer.parseInt(input.nextLine());
        System.out.println("Sabor:  ");
        flavor = input.nextLine();

        listCookies.add(new Cookies(provided, address, name, code, price, amount, flavor));
    }

    //SHOES
    private static void showShoes(Scanner input, ArrayList<Shoes> listShoes) {
        boolean exit = false;
        String provided = "";
        String address = "";
        String name = "";
        String code = "";
        double price = 0.0;
        int amount = 0;
        double size = 0.0;

        do{
            String option = "";
            showMenuShoes(input);
            option = input.nextLine();

            if(option.equals("1")) {
                showListOfShoes(listShoes);
            }
            else if(option.equals("2"))
                addNewShoesToList(provided, address, name, code, price, amount, size, input, listShoes);
            else if(option.equals("3")) {
                System.out.println("Ingrese el codigo del que desea eliminar: ");
                String delete = input.nextLine();
                listShoes.removeIf(cookie -> cookie.getCode().equals(delete));
            }
            else if(option.equals("4")){
                System.out.println("Regresando...");
                exit = true;
            }
            else
                System.out.println("Opcion invalida.");
        }while(!exit);
    }
    private static void showListOfShoes(ArrayList<Shoes> listShoes) {
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%15s %28s %15s %15s %15s %10s %15s %15s", "PROVIDED", "ADDRESS", "NAME", "CODE", "PRICE", "AMOUNT", "SIZE", "TOTAL DUE");
        System.out.println("");
        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
        if (listShoes.isEmpty()) System.out.println("No hay registros  ");
        listShoes.forEach(element -> {
            System.out.printf("%15s %28s %15s %15s %15.2f %10d %15.2f %15.2f",
                    element.getProvider(), element.getAdress(), element.getName(), element.getCode(), element.getPrice(), element.getAmount(), element.getSize(), element.totalDue()
            );
            System.out.println();
        });
        System.out.println("________________________________________________________________________________________________________________________________________");
    }
    private static void addNewShoesToList(
            String provided,String address,String name,
            String code,double price,int amount,double size,
            Scanner input, ArrayList<Shoes> listShoes
    ) {
        System.out.println("Ingresa los datos: ");
        System.out.println("Proveedor:  ");
        provided = input.nextLine();
        System.out.println("Direccion:  ");
        address = input.nextLine();
        System.out.println("Nombre:  ");
        name = input.nextLine();
        System.out.println("Codigo:  ");
        code = input.nextLine();
        System.out.println("Precio:  ");
        price = Double.parseDouble(input.nextLine());
        System.out.println("Cantidad:  ");
        amount = Integer.parseInt(input.nextLine());
        System.out.println("Talla:  ");
        size = Double.parseDouble(input.nextLine());

        listShoes.add(new Shoes(provided, address, name, code, price, amount, size));
    }
}
