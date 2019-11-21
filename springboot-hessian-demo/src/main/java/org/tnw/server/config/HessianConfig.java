package org.tnw.server.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.tnw.server.entity.hessian.HessianServiceFactory;
import org.tnw.server.service.FileTransService;

/**
 * Created by Lannister on 2019/10/11.
 * Hessian RPC 配置
 */
@Configuration
public class HessianConfig {

  @Autowired
  private FileTransService fileTransService;

  @Bean(name = "/service/fileTransService")
  public HessianServiceExporter exoprtService(){
    return HessianServiceFactory.export(fileTransService, FileTransService.class);
  }
}
