package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by liyuqiao on 2017/5/14.
 */

//这一行要注明
@EnableConfigurationProperties(DemoProperties.class)
public class DemoConfig1 implements CommandLineRunner {

    @Autowired
    private DemoProperties demoProperties;

    //上层spring程序启动时，如果这行执行了，并且是用的上层spring程序的配置，就说明成功了
    public void run(String... strings) throws Exception {
        System.out.println("--------------" + demoProperties.getDemoProp1() + "--------------");
    }
}
