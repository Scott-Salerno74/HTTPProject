import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class HTTPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(7478);
        while(true){
            Socket client = server.accept();
            InputStreamReader input = new InputStreamReader(client.getInputStream());
            BufferedReader HTTPReader = new BufferedReader(input);
            String inputLine = HTTPReader.readLine();
              while(!inputLine.isEmpty()){
                  System.out.println(inputLine);
                  inputLine = HTTPReader.readLine();
              }
        }
    }
}
