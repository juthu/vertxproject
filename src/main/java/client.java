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

        client.websocket(5432, "localhost", "/some-uri", websocket -> {
            websocket.handler(data -> {
                System.out.println("Received data " + data.toString("ISO-8859-1"));
                client.close();
            });
            websocket.writeBinaryMessage(Buffer.buffer("Hello world"));
        });
    }

}
