package org.tnw.server.controller;

import org.springframework.web.bind.annotation.*;
import org.tnw.server.entity.hessian.Code;
import org.tnw.server.entity.hessian.FileTransInfo;
import org.tnw.server.entity.hessian.HessianServiceFactory;
import org.tnw.server.service.FileTransService;

/**
 * Created by Lannister on 2019/10/11.
 */
@RestController
public class HessianRpcController {

  @GetMapping("/loader/createTask")
  public Integer createTask(){
    try{
      FileTransService fileTransService = HessianServiceFactory.create(FileTransService.class);
      Integer task = fileTransService.createTask(new FileTransInfo("192.168.1.1", "/usr/tmp/schedule.txt"));
      return task;
    }catch (Exception e){
      System.out.println(e.toString());
      return null;
    }
  }

  @GetMapping("/loader/getStatus")
  public Code getStatus(){
    try{
      FileTransService fileTransService = HessianServiceFactory.create(FileTransService.class);
      Code status = fileTransService.getStatus();
      return status;
    }catch (Exception e){
      System.out.println(e.toString());
      return null;
    }
  }

  @GetMapping("/loader/reset")
  public Integer reset(){
    try{
      FileTransService fileTransService = HessianServiceFactory.create(FileTransService.class);
      Integer reset = fileTransService.reset();
      return reset;
    }catch (Exception e){
      System.out.println(e.toString());
      return null;
    }
  }
}
