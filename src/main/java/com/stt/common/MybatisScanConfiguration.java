package com.stt.common;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by taotaosun on 2017/4/26.
 */
@Configuration
@MapperScan("com.stt.dao")
public class MybatisScanConfiguration {

}
