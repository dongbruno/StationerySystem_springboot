package citi.dao.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import citi.entity.Systeminfo;
@RunWith(SpringRunner.class)
@SpringBootTest
public class SysteminfoHomeTest {

	@Test
	public void testFindById() {
		SysteminfoHome s = new SysteminfoHome();
		int id = 1;
		assertThat(s).isNotNull();
		System.out.println("start");
//		Systeminfo sys = s.findById(id);
//		
//		System.out.println(sys.toString());
//		fail("Not yet implemented");
	}

}
