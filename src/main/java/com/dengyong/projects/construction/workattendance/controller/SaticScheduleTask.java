package com.dengyong.projects.construction.workattendance.controller;

import java.time.LocalDateTime;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Configuration      //1.主要用于标记配置类，兼备Component的效果。
@EnableScheduling   // 2.开启定时任务
public class SaticScheduleTask {
	@Scheduled(cron = "0 30 23 * * ?")
	private void configureTasks() {
		System.err.println("执行静态定时任务时间: " );

	}

}
