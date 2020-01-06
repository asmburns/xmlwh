import com.sun.net.httpserver.HttpContext;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpServer;

import java.net.InetSocketAddress;

public class WareHouse {

    public static void main(String... arg){
        try {
            HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
            HttpContext context = server.createContext("/");
            HttpHandler handler = new RequestHandler();
            context.setHandler(handler);
            server.start();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
