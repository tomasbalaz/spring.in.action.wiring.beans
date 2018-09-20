package spring.in.action.spring.in.action.wiring.beans.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import spring.in.action.spring.in.action.wiring.beans.soundsystem.CDPlayer;
import spring.in.action.spring.in.action.wiring.beans.soundsystem.CompactDisc;
import spring.in.action.spring.in.action.wiring.beans.soundsystem.MediaPlayer;
import spring.in.action.spring.in.action.wiring.beans.soundsystem.SgtPepperss;

@Configuration
public class CDPlayerConfigBean {
	
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPepperss();
	}
	
	@Bean(name="cdPlayer")
	public MediaPlayer cdPlayer() {
		return new CDPlayer(sgtPeppers());
	}
	
	@Bean(name="anotherCDPlayer")
	public MediaPlayer anotherCDPlayer() {
		return new CDPlayer(sgtPeppers());
	}

}
