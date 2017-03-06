package net.sppan.base.config.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.ContextStartedEvent;
import org.springframework.context.event.ContextStoppedEvent;

public class ApplicationEventListener implements ApplicationListener<ApplicationEvent> {
	
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Override
	public void onApplicationEvent(ApplicationEvent event) {
		// 在这里可以监听到Spring Boot的生命周期
		if (event instanceof ApplicationEnvironmentPreparedEvent) { // 初始化环境变量
			logger.debug("初始化环境变量");
		} else if (event instanceof ApplicationPreparedEvent) { // 初始化完成
			logger.debug("初始化环境变量完成");
		} else if (event instanceof ContextRefreshedEvent) { // 应用刷新，当ApplicationContext初始化或者刷新时触发该事件。
			logger.debug("应用刷新");
		} else if (event instanceof ApplicationReadyEvent) {// 应用已启动完成
			logger.debug("应用已启动完成");
		} else if (event instanceof ContextStartedEvent) { // 应用启动，Spring2.5新增的事件，当容器调用ConfigurableApplicationContext的 Start()方法开始/重新开始容器时触发该事件。
			logger.debug("应用启动");
		} else if (event instanceof ContextStoppedEvent) { // 应用停止，Spring2.5新增的事件，当容器调用ConfigurableApplicationContext 的Stop()方法停止容器时触发该事件。
			logger.debug("应用停止");
		} else if (event instanceof ContextClosedEvent) { // 应用关闭，当ApplicationContext被关闭时触发该事件。容器被关闭时，其管理的所有 单例Bean都被销毁。
			logger.debug("应用关闭");
		} else {
		}
	}

}