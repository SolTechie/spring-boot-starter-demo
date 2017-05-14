package demo;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by liyuqiao on 2017/5/14.
 */

//这个配置就是上层spring的配置前缀
@ConfigurationProperties(prefix = "starter.demo")
public class DemoProperties {

    //会被上层spring程序的配置覆盖
    private String demoProp1 = "demoProp1";
    //会被上层spring程序的配置覆盖
    private String demoProp2 = "demoProp2";

    public void setDemoProp1(String demoProp1) {
        this.demoProp1 = demoProp1;
    }

    public void setDemoProp2(String demoProp2) {
        this.demoProp2 = demoProp2;
    }

    public String getDemoProp1() {
        return demoProp1;
    }

    public String getDemoProp2() {
        return demoProp2;
    }
}
