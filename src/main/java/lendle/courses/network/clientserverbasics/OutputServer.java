/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendle.courses.network.clientserverbasics;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import static java.lang.System.out;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author user
 */
public class OutputServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        try (ServerSocket serverSocket = new ServerSocket(8000)){
            while(true){
                Socket socket = serverSocket.accept();
                OutputStream output = socket.getOutputStream();
                OutputStreamWriter osw = new OutputStreamWriter(output, "utf-8");
                osw.write("hello world1");
                osw.flush();
            }
        } 
    }
