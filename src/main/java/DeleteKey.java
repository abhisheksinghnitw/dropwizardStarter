import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.DELETE;
import javax.ws.rs.Path;

/**
 * Created by abhishek.singh6 on 19/04/17.
 */
@Path("/deleteKey")
public class DeleteKey {
    @DELETE
    @Timed
    public String deleteKey() {
        return "deleted key" + Service.number;
    }
}
