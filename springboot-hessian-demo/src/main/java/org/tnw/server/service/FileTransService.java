package org.tnw.server.service;

import org.tnw.server.entity.hessian.Code;
import org.tnw.server.entity.hessian.FileTransInfo;

/**
 * Created by Lannister on 2019/11/21.
 */
public interface FileTransService {

  public Integer createTask(FileTransInfo info);

  public Code getStatus();

  public Integer reset();
}
