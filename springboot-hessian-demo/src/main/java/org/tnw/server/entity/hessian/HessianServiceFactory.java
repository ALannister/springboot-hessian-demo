package org.tnw.server.entity.hessian;

import com.caucho.hessian.client.HessianProxyFactory;
import org.springframework.remoting.caucho.HessianServiceExporter;
import org.springframework.stereotype.Component;
import org.tnw.server.service.FileTransService;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Lannister on 2019/10/11.
 * Hessian RPC 工厂类
 */
@Component
public class HessianServiceFactory {

  private static Map<String,String> map;
  static{
    map = new HashMap<>();
    map.put(FileTransService.class.getCanonicalName(),"http://localhost:8081/service/fileTransService");
  }

  @SuppressWarnings("unchecked")
  public static <T> T create(Class<T> service) throws Exception {
    HessianProxyFactory factory = new HessianProxyFactory();
    factory.setOverloadEnabled(true);
    return (T) factory.create(service, map.get(service.getCanonicalName()));
  }

  public static HessianServiceExporter export(Object service, Class<?> serviceInterface) {
    HessianServiceExporter exporter = new HessianServiceExporter();
    exporter.setService(service);
    exporter.setServiceInterface(serviceInterface);
    return exporter;
  }
}
