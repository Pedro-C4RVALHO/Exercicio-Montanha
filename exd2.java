import java.util.Scanner;

public class exd2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username, password;

        while (true) {
            System.out.print("Digite o nome de usuário: ");
            username = scanner.nextLine();

            System.out.print("Digite a senha: ");
            password = scanner.nextLine();

            if (!password.equals(username)) {
                System.out.println("Cadastro realizado com sucesso!");
                break;
            } else {
                System.out.println("Erro: A senha não pode ser igual ao nome de usuário. Por favor, tente novamente.");
            }
        }
    }
}


 
       

      
        

   
 