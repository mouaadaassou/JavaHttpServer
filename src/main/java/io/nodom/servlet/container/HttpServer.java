package io.nodom.servlet.container;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * this class designed to be a web server, that accepts HTTP requests from a web
 * client, and return an appropriate response with all the HTTP metadata
 * 
 * @author moaad-novelis
 *
 */
public class HttpServer {

	/**
	 * WEB_ROOT is the directory where our HTML and other files reside. For this
	 * package, WEB_ROOT is the "webroot" directory under the working directory.
	 * 
	 * The working directory is the location in the filesystem from where the java
	 * command was invoked
	 * 
	 */
	public static final String WEB_ROOT = System.getProperty("user.dir") + File.separator + "src/main/resources";

	/**
	 * SHUTDOWN_COMMAND : shutdown command
	 */
	private static final String SHUTDONW_COMMAND = "/shutdown";

	/**
	 * is the shutdown command received
	 */
	private boolean shutdown = false;

	public void await() throws IOException {
		ServerSocket serverSocket = new ServerSocket(8080, 1, InetAddress.getByName("127.0.0.1"));
		System.out.println("****************************************************\n");
		System.out.println(WEB_ROOT);
		System.out.println("****************************************************\n");
		while (!shutdown) {
			Socket socket = serverSocket.accept();
			InputStream in = socket.getInputStream();
			OutputStream out = socket.getOutputStream();

			// create request object and parse
			Request request = new Request(in);
			request.parse();

			// create response object
			Response response = new Response(out);
			response.setRequest(request);
			response.sendStaticResources();
			this.shutdown = request.getUri().equals(SHUTDONW_COMMAND);
			serverSocket.close();
		}
	}

	public static void main(String[] args) throws IOException{
		HttpServer server = new HttpServer();
		server.await();
	}
}
