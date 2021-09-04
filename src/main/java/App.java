import java.util.Scanner;
public class App {
    public static void main(String[] args) {
        Scanner getInput = new Scanner(System.in);
        System.out.println("Enter service:\n 1.Encryption \n 2.Decryption \n 3.Exit");

        int option = getInput.nextInt();
    //   option.nextLine();

        if (option == 1)
        {
            System.out.println("Enter message to encrypt:");
           // String.inputText =getInput.nextLine().toUpperCase();
            System.out.println("Enter Shift Key:");
            int ShiftKey = getInput.nextInt();
         //   Encoding encryptInput = new Encoding(inputText,ShiftKey);
          //  System.out.println(String.format("Your input has been encrypted as:%s",encoding.encode()));
        }
        else if (option == 2)
        {
            System.out.println("Enter message to decrypt:");
            // String.inputText =getInput.nextLine().toUpperCase();
            System.out.println("Enter Shift Key:");
            int ShiftKey = getInput.nextInt();
            //   Decoding decryptInput = new Decoding(inputText,ShiftKey);
            //  System.out.println(String.format("Your input has been decrypted as:%s",decoding.decode()));
        }
        else if (option == 3)
        {
           System.exit(0);
        }
        else {
            System.out.println("Please enter a valid input.");
        }
        }
    }


