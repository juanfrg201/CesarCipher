import model.cesar_cipher;
import view.view;

public class function {
    view view = new view();
    cesar_cipher cesar = new cesar_cipher();

    public void inicializar(){
        int menu_option = 0;
        boolean aux_validator = false;
        while(aux_validator == false){
            view.menu_message();
            try {
                menu_option = Integer.parseInt(view.recive_message());
                if (menu_option >= 1 && menu_option <= 3) {
                    switch (menu_option) {
                        case 1:
                            view.show_message("Ingresa el mensaje a encriptar");
                            String encryp_message = view.recive_message();
                            view.show_message("Ingresa la clave para encriptar");
                            int password_encrypt = Integer.parseInt(view.recive_message());  
                            view.show_message("El mensaje encriptado es: "+cesar.encrypt(encryp_message, password_encrypt));
                            break;
                        case 2:
                            view.show_message("Ingresa el mensaje a encriptar");
                            String descrypt_message = view.recive_message();
                            view.show_message("Ingresa la clave para encriptar");
                            int password_descrypt = Integer.parseInt(view.recive_message());  
                            view.show_message("El mensaje desencriptado es: "+cesar.decrypt(descrypt_message, password_descrypt));
                            break;
                        case 3:
                            aux_validator = true;
                            break;
                        default:
                            System.out.println("Valor inválido para día de la semana");
                            break;
                    }
                }else{
                    view.show_message("No se ingreso un numero valido");
                }
            } catch (Exception e) {
                System.out.println("Se ha producido una excepción: " + e.getMessage());
            }
        }
    }
}
