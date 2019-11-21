package org.tnw.server.entity.hessian;

import lombok.*;

import java.io.Serializable;

/**
 * Created by Lannister on 2019/11/21.
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FileTransInfo implements Serializable {

  private String targetIp;
  private String filePath;
}
