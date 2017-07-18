package me.chanjar.json_format;

import me.chanjar.no_json_format.NoJsonFormatTestBase;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = { DateTime1Test.class, JacksonAutoConfiguration.class })
public class DateTime1Test extends NoJsonFormatTestBase {

}
