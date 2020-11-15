package cachesdk.fastfish.autoconfigure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.UUID;

@Configuration
public class FishAutoConfiguration {

    @Bean
    public void makeThread(){
        System.out.println("守护线程开启！！ ");
        Thread a=new Thread(() -> test());
        a.setDaemon(true);
        a.start();
    }

    private void  test(){
        for (;;) {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Test cache!!1"+ UUID.randomUUID().toString().replace("-",""));
        }
    }
}
