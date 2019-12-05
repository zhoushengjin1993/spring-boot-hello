package com.sabchow;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableCaching // 开启缓存
@ComponentScan(basePackages = { "com.sabchow" })
public class ApplicationStartUp {
	private static Logger logger = LoggerFactory.getLogger(ApplicationStartUp.class);

	public static void main(String[] args) {
		SpringApplication.run(ApplicationStartUp.class, args);
		logger.info(
				"                                                                                                                    \n"
						+ "                                                                                                                    \n"
						+ "wwwwwww           wwwww           wwwwwww eeeeeeeeeeee    nnnn  nnnnnnnn       ggggggggg   ggggg    eeeeeeeeeeee    \n"
						+ " w:::::w         w:::::w         w:::::wee::::::::::::ee  n:::nn::::::::nn    g:::::::::ggg::::g  ee::::::::::::ee  \n"
						+ "  w:::::w       w:::::::w       w:::::we::::::eeeee:::::een::::::::::::::nn  g:::::::::::::::::g e::::::eeeee:::::ee\n"
						+ "   w:::::w     w:::::::::w     w:::::we::::::e     e:::::enn:::::::::::::::ng::::::ggggg::::::gge::::::e     e:::::e\n"
						+ "    w:::::w   w:::::w:::::w   w:::::w e:::::::eeeee::::::e  n:::::nnnn:::::ng:::::g     g:::::g e:::::::eeeee::::::e\n"
						+ "     w:::::w w:::::w w:::::w w:::::w  e:::::::::::::::::e   n::::n    n::::ng:::::g     g:::::g e:::::::::::::::::e \n"
						+ "      w:::::w:::::w   w:::::w:::::w   e::::::eeeeeeeeeee    n::::n    n::::ng:::::g     g:::::g e::::::eeeeeeeeeee  \n"
						+ "       w:::::::::w     w:::::::::w    e:::::::e             n::::n    n::::ng::::::g    g:::::g e:::::::e           \n"
						+ "        w:::::::w       w:::::::w     e::::::::e            n::::n    n::::ng:::::::ggggg:::::g e::::::::e          \n"
						+ "         w:::::w         w:::::w       e::::::::eeeeeeee    n::::n    n::::n g::::::::::::::::g  e::::::::eeeeeeee  \n"
						+ "          w:::w           w:::w         ee:::::::::::::e    n::::n    n::::n  gg::::::::::::::g   ee:::::::::::::e  \n"
						+ "           www             www            eeeeeeeeeeeeee    nnnnnn    nnnnnn    gggggggg::::::g     eeeeeeeeeeeeee  \n"
						+ "                                                                                        g:::::g                     \n"
						+ "                                                                            gggggg      g:::::g                     \n"
						+ "                                                                            g:::::gg   gg:::::g                     \n"
						+ "                                                                             g::::::ggg:::::::g                     \n"
						+ "                                                                              gg:::::::::::::g                      \n"
						+ "                                                                                ggg::::::ggg                        \n"
						+ "                                                                                   gggggg                           ");
	}
}
