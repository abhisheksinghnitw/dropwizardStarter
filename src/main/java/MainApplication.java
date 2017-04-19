import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

/**
 * Created by abhishek.singh6 on 19/04/17.
 */
public class MainApplication extends Application<AppConfiguration> {
    public static void main(String[] args) throws Exception {
        new MainApplication().run(args);
    }

    @Override
    public String getName() {
        return "hello-world";
    }

    @Override
    public void initialize(Bootstrap<AppConfiguration> bootstrap) {
        // nothing to do yet
    }

    @Override
    public void run(AppConfiguration configuration,
                    Environment environment) {
        Keyserver keyserver = new Keyserver();
        DeleteKey key = new DeleteKey();
        environment.jersey().register(key);
        environment.jersey().register(keyserver);
    }

}
