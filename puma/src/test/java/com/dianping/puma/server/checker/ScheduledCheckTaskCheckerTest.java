package com.dianping.puma.server.checker;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:config/spring/common/*.xml")
public class ScheduledCheckTaskCheckerTest {

	@Autowired
	TaskChecker taskChecker;

	@Test
	public void testCheck() throws Exception {
		taskChecker.check();
	}

	@Test
	public void testFindCreatedTasks() throws Exception {

	}

	@Test
	public void testFindUpdatedTasks() throws Exception {

	}

	@Test
	public void testFindDeletedTasks() throws Exception {

	}
}