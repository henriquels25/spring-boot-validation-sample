package io.sicredi.poc.restvalidation;

import io.sicredi.tm4j.common.annotations.TestCase;
import io.sicredi.tm4j.junit5.extensions.Tm4jExtension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@ExtendWith(Tm4jExtension.class)
class RestValidationApplicationTests {

	@Test
	@TestCase(key = "CR02-T6994")
	void contextLoads() {
	}

}
