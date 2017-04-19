import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by abhishek.singh6 on 19/04/17.
 */

@Path("/generateKeys")
public class Keyserver {
    private final AtomicLong counter;

    public Keyserver() {
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public String sayHello() {
        return String.valueOf(counter.addAndGet(1));
    }

}
