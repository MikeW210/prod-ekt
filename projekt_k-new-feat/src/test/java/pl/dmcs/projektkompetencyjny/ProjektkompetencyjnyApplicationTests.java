package pl.dmcs.projektkompetencyjny;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pl.dmcs.projektkompetencyjny.domain.repository.KnightRepository;
import pl.dmcs.projektkompetencyjny.domain.Knight;

import static junit.framework.TestCase.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProjektkompetencyjnyApplicationTests {

	@Autowired
	Knight knight;

	@Autowired
	KnightRepository castle;

	@Test
	public void contextLoads() {
	}

	@Test
	public void testCastle(){
		String except = "Znajduje sie tu zamek o nazwie East Watch. Zamieszkały przez rycerzaRycerz o imieniu Lancelot ( 29 ). Ma za zadanie Uratuj księżniczkę!";
		assertEquals(except,castle.toString());
	}

}
