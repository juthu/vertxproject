import io.vertx.core.AbstractVerticle;

/**
 * Created by sirena on 2015-12-11.
 */
    public class conn extends AbstractVerticle {
    @Override
    public void start() throws Exception {
        vertx.createHttpServer().websocketHandler(ws -> ws.handler(ws::writeBinaryMessage)).requestHandler(req -> {
            if (req.uri().equals("/")) req.response().sendFile("ws.html");
        }).listen(5432);
        /*server.websocketHandler(websocket -> {
            System.out.println("Connected!");
        });
        server.listen(80, "0.0.0.0", res -> {
            if (res.succeeded()) {
                System.out.println("Server is now listening!");
            } else {
                System.out.println("Failed to bind!");
            }
        });*/
    }

    // Convenience method so you can run it in your IDE
  /*  public static void main(String[] args) {



        Runner.runExample(conn.class);
    }

    @Override
    public void start() throws Exception {

        //Configure server
        //  HttpServerOptions options = new HttpServerOptions().setMaxWebsocketFrameSize(1000000);

        HttpServer server = vertx.createHttpServer();
    //Specify the host and port in the call to listen
        /*
        The default host is 0.0.0.0 which means
        'listen on all available addresses' and
        the default port is 80.
         */
        /*
        The actual bind is asynchronous so the server might not actually be listening until some time after the call to listen has returned.

If you want to be notified when the server is actually listening you can provide a handler to the listen call. For example:
         */
  /*      server.listen(80, "0.0.0.0", res -> {
            if (res.succeeded()) {
                System.out.println("Server is now listening!");
            } else {
                System.out.println("Failed to bind!");
            }
        });*/
/*
To be notified when a request arrives you need to set a requestHandler:
 */
      /*  server.requestHandler(request -> {
            System.out.printf("request arrives");

            // Handle the request in here
        });*/
/*
Here’s a simple example of a server handling a request and
 replying with "hello world" to it.
 */
      /*  vertx.createHttpServer().requestHandler(request -> {
            request.response().end("Hello world");
        }).listen(8080);
    }*/
    }
