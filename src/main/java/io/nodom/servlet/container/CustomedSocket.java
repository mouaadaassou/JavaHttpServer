package io.nodom.servlet.container;

public class CustomedSocket {
	
//	public static void main(String[] args) throws IOException, InterruptedException {
//		CustomedSocket cs = new CustomedSocket();
//		cs.socketInitialization();
//	}
//
//	public void socketInitialization() throws IOException, InterruptedException {
//		Socket socket = new Socket("127.0.0.1", 8082);
//		PrintWriter printWriter = new PrintWriter(socket.getOutputStream(), true);
//
//		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
//		writeToServer(printWriter);
//		readResponse(in);
//		socket.close();
//	}
//	
//	public void writeToServer(PrintWriter printWriter) {
//		printWriter.println("GET /index.jsp HTTP/1.1");
//		printWriter.println("HOST localhost:8080");
//		printWriter.println("Connection: Close");
//		printWriter.println();
//	}
//	
//	@SuppressWarnings("static-access")
//	public void readResponse(BufferedReader in) throws IOException, InterruptedException {
//		boolean loop = true;
//		StringBuffer sb = new StringBuffer(8096);
//		while (loop) {
//		  if ( in.ready() ) {
//		    int i=0;
//		    while (i!=-1) {
//		      i = in.read();
//		      sb.append((char) i);
//		    }
//		    loop = false;
//		  }
//		  Thread.currentThread().sleep(50);
//		}
//		System.out.println(sb.toString());
//	}

}
