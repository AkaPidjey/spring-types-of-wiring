package koschei.config;

import koschei.KoscheiTheDeathless;
import koschei.models.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Base64;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(Wood3 wood) {
        return new Island2(wood);
    }


//    @Bean
//    public Deth8 deth8() {
//        return new Deth8();
//    }

//    @Bean
//    public Needle7 needle7() {
//        return new Needle7(deth8());
//    }

//    @Bean
//    public Egg6 egg6() {
//        return new Egg6(needle7());
//
//    }
//
//    @Bean
//    public Duck5 duck5() {
//        return new Duck5(egg6());
//    }
//
//    @Bean
//    public Rabbit4 rabbit4() {
//        return new Rabbit4(duck5());
//    }
//
//    @Bean
//    public Wood3 wood3() {
//        return new Wood3(rabbit4());
//    }
//
//    @Bean
//    public  Island2 island2() {
//        return new Island2(wood3());
//    }
//
//    @Bean
//    public Ocean1 ocean1() {
//        return new Ocean1(island2());
//    }
//
//    @Bean
//    public KoscheiTheDeathless koscheiTheDeathless() {
//        return new KoscheiTheDeathless(ocean1());
//    }

}
