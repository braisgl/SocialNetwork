import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SocialNetworkShould {

    SocialNetwork socialNetwork;

    @Test
    void post(){
        String command = "Irene -> What a nice breakfast!";
        socialNetwork = new SocialNetwork();
        Assertions.assertEquals("Posting",socialNetwork.execute(command));
    }

    @Test
    void read(){
        String command = "Irene";
        socialNetwork = new SocialNetwork();
        Assertions.assertEquals("Reading",socialNetwork.execute(command));
    }


}
