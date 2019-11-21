package org.tnw.server.service.impl;

import org.springframework.stereotype.Service;
import org.tnw.server.entity.hessian.Code;
import org.tnw.server.entity.hessian.FileTransInfo;
import org.tnw.server.service.FileTransService;

import java.util.Random;

/**
 * Created by Lannister on 2019/11/21.
 */
@Service
public class FileTransServiceImpl implements FileTransService {

  @Override
  public Integer createTask(FileTransInfo info) {
    System.out.println(info);
    return new Random().nextInt();
  }

  @Override
  public Code getStatus() {
    return new Code(new Random().nextInt(),new Random().nextInt());
  }

  @Override
  public Integer reset() {
    return new Random().nextInt();
  }
}
