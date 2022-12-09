package ServerWork;

import DB.SQLFactory;
import Org.*;

import java.io.*;
import java.net.Socket;
import java.sql.SQLException;
import java.util.AbstractMap;
import java.util.ArrayList;

public class Worker implements Runnable {
    protected Socket clientSocket = null;
    ObjectInputStream sois;
    ObjectOutputStream soos;

    public Worker(Socket clientSocket) {
        this.clientSocket = clientSocket;
    }

    @Override
    public void run() {
        try {
            sois = new ObjectInputStream(clientSocket.getInputStream());
            soos = new ObjectOutputStream(clientSocket.getOutputStream());
            while (true) {
//                Students student = (Students)sois.readObject();
//                System.out.println(student.toString());
                System.out.println("Получение команды от клиента...");
                String choice = sois.readObject().toString();
                System.out.println(choice);
                System.out.println("Команда получена");
                switch (choice) {

                    case "authorization" ->
                    {
                        System.out.println("Выполняется авторизация пользователя....");
                        Authorization auth = (Authorization) sois.readObject();
                        System.out.println(auth.toString());

                        SQLFactory sqlFactory = new SQLFactory();

                        boolean r = sqlFactory.getRole().getRole(auth);
                        
                    }
                    
                    default ->
                    {
                        System.out.println("HUI TAM");
                        break;
                    }
                }
            }
        } catch (IOException | ClassNotFoundException | SQLException e) {
            System.out.println("Client disconnected.");
        }
    }
}