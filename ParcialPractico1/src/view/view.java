package view;
import java.util.Scanner;

public class view {

    public void show_message(String message){
        System.out.println(message);
    }
    public String recive_message(){
        Scanner scanner = new Scanner(System.in);
        String message = scanner.nextLine();
        return message;
    }
    public void menu_message(){
        System.out.println("Bienvenido al programa de cifrado CESAR");
        System.out.println("1. Cifrar un mensaje." + "\n" +
                "2. Descifrar un mensaje cifrado." + "\n" + "3. Salir.");
    }

}
