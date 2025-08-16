import models.Transaction;

import java.time.LocalDateTime;
import java.util.Scanner;

public class OPPMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Crear un objeto de tranmsaccion

        Transaction transaccion1 = new Transaction();
        transaccion1.setNombre("Transaccion codigo");

        Transaction transaction2 = new Transaction(
                2,
                "Transaccion dos",
                25.50,
                LocalDateTime.now(),
                "Yape",
                "Comida",
                "Chinawok"
        );

        System.out.println(transaccion1.getNombre());
        System.out.println(transaction2.getFechaCreacion());
        System.out.println(transaction2.getCategoria());
    }

}

