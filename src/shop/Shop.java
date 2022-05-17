package shop;


import java.util.Scanner;
public class Shop{
    public static void main(String[] args){

        String[] brand = {"MacBookAir" , "Thinkpad T450" , "Asus-FL5800"};
        double[] size  = {13.3 , 14.0 , 15.6};
        double[] price = {6988.88 , 5999.99 ,4999.5};
        int[]   count = {5 ,10, 18 };

        while(true){
            int choose = chooseFunction();
            switch(choose){

                case 1:
                    printStore(brand , size , price ,count );
                    break;

                case 2:
                    changeCount(brand , count);
                    break;

                case 3:
                    return;

                default:
                    System.out.println ("Lo sentimos, esta función no está disponible actualmente");
                    break;
            }
        }
    }

    public static void changeCount(String [] brand,int[] count){
        Scanner ran = new Scanner(System.in);
        //int number_1 = ran.nextInt();
        for(int i = 0;i < brand.length; i++){
            System.out.println(brand[i]);
            count[i] = ran.nextInt();
        }
    }

    public static void printStore(String [] brand,double[] size, double [] price, int [] count ){
        int totalCount  = 0;
        double totalMoney  = 0;
        System.out.println ("—————————————— Lista de inventario del centro comercial ————————————————");
        System.out.println ("Modelo de marca, tamaño, precio, stock");
        for(int i = 0; i < brand.length; i++){
            System.out.println(brand[i]+"		"+size[i]+"		"+price[i]+"		"+count[i]);
            totalCount += count[i];
            totalMoney += price[i]*count[i];
        }

        System.out.println ("Inventario total:" + totalCount);
        System.out.println ("Cantidad total de productos de inventario:" + totalMoney);
    }


    public static int chooseFunction(){
        System.out.println ("------------- Gestión de inventario ------------");
        System.out.println ("1.Ver lista de inventario");
        System.out.println ("2. Modificar la cantidad de inventario del producto");
        System.out.println ("3.Exit");
        System.out.println ("Seleccione las funciones que desea usar:");
        Scanner ran = new Scanner(System.in);
        int number = ran.nextInt();
        return number;
    }

}
