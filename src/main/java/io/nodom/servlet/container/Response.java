package io.nodom.servlet.container;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * HTTP Response = Status-Line ((generale-header | response-header |
 * entity-header) CRLF)
 * 
 * CRLF [message-body] Status-Line = HTTP-Version SP Status-Code SP
 * Reason-Phrase CRLF
 * 
 * 
 * @author moaad-novelis
 *
 */
public class Response {

	private static final int BUFFER_SIZE = 1024;
	Request request;
	OutputStream outputStream;

	public Response(OutputStream outputStream) {
		this.outputStream = outputStream;
	}

	public void setRequest(Request request) {
		this.request = request;
	}

	public void sendStaticResources() throws IOException{
		byte[] bytes = new byte[BUFFER_SIZE];
		File file = new File(HttpServer.WEB_ROOT, request.getUri());
		if (file.exists()) {
			try (FileInputStream fileInputStream = new FileInputStream(file);) {
				int chr = fileInputStream.read(bytes, 0, BUFFER_SIZE);
				while (chr != -1) {
					outputStream.write(bytes, 0, chr);
					chr = fileInputStream.read(bytes, 0, BUFFER_SIZE);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			String errorMessage = "HTTP/1.1 404 File Not Found \n".concat("Content-Type: text/html\r\n")
					.concat("Content-Length: 23\r\n").concat("\r\n").concat("<h1>File Not Found</h1>");
			outputStream.write(errorMessage.getBytes());
		}
	}
}
