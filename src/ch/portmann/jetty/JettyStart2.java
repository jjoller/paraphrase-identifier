package ch.portmann.jetty;

import org.eclipse.jetty.server.Handler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.DefaultHandler;
import org.eclipse.jetty.server.handler.HandlerList;
import org.eclipse.jetty.server.handler.ResourceHandler;

public class JettyStart2 {

	public static void main(String[] args) throws Exception {


	    Server server = new Server(7088);

	    ResourceHandler resource_handler = new ResourceHandler();
	    resource_handler.setDirectoriesListed(true);
	    resource_handler.setWelcomeFiles(new String[]{ "index.txt" });

	    resource_handler.setResourceBase("D:\\");

	    HandlerList handlers = new HandlerList();
	    handlers.setHandlers(new Handler[] { resource_handler, new DefaultHandler() });
	    server.setHandler(handlers);

	    server.start();
	}
}
