package spring.in.action.spring.in.action.wiring.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import spring.in.action.spring.in.action.wiring.beans.config.CDPlayerConfig;
import spring.in.action.spring.in.action.wiring.beans.config.CDPlayerConfigBean;
import spring.in.action.spring.in.action.wiring.beans.soundsystem.CompactDisc;
import spring.in.action.spring.in.action.wiring.beans.soundsystem.MediaPlayer;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfigBean.class)
public class CDPlayerTest {

	//@Rule
	//public final StandardOutputStreamLog log = new StandardOutputStreamLog();
	
	@Autowired
	@Qualifier(value="cdPlayer")
	private MediaPlayer player;

	@Autowired
	private CompactDisc cd;

	@Test
	public void cdShouldNotBeNull() {
		assertNotNull(cd);
	}

	@Test
	public void play() {
		player.play();
		//assertEquals("Playing Sgt. Pepper's Lonely Hearts Club Band" + " by The Beatles\n", log.getLog());
	}

}
