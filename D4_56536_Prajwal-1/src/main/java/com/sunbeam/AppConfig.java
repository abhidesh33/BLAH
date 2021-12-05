package com.sunbeam;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@ComponentScan({"com.rowmapper","com.controller","com.app","com.service","com.dao","com.pojos"})
@Configuration
public class AppConfig {

}
