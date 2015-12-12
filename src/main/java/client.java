/**
 * Created by sirena on 2015-12-12.
 */

import io.vertx.core.AbstractVerticle;
import io.vertx.core.buffer.Buffer;
import io.vertx.core.http.HttpClient;


/*
 * @author <a href="http://tfox.org">Tim Fox</a>
 */
public class client extends AbstractVerticle {


    @Override
    public void start() throws Exception {
        HttpClient client = vertx.createHttpClient();
        client.websocket(5432,"localhost","/some-uri", websocket -> {
            System.out.println("Connected!");
            websocket.writeFinalTextFrame("Geronimo!");
            Buffer buff = Buffer.buffer().appendInt(12).appendString("foo");
            websocket.writeFinalBinaryFrame(buff);
        });



// Send a websocket messages consisting of a single final binary frame:




       /* vertx.createHttpClient().getNow(5423, "localhost", "/", resp -> {
            System.out.println("Got response " + resp.statusCode());
            resp.bodyHandler(body -> {
                System.out.println("Got data " + body.toString("ISO-8859-1"));
            });
        });*/
        /*
        HttpClient client = vertx.createHttpClient();

        client.websocket(5432, "localhost", "/some-uri", websocket -> {
            /*websocket.handler(data -> {
                System.out.println("Received data " + data.toString("ISO-8859-1"));
                client.close();
            });
            websocket.writeBinaryMessage(Buffer.buffer("Hello world"));
       */
/*
            System.out.printf("conected");
            Buffer buffer = Buffer.buffer().appendInt(123).appendFloat(1.23f);

            websocket.writeBinaryMessage(buffer);
        });*/
    }

}
