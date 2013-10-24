package sk.upjs.ics.novotnyr.chocolate.restlet;

import org.restlet.Server;
import org.restlet.data.Protocol;

public class RestletApplicationRunner {

    public static void main(String[] args) throws Exception {
        Server server = new Server(Protocol.HTTP, 8182, ChocolatesResource.class);
        server.start();
    }
}
