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
public class Code implements Serializable {

  private Integer statusCode;
  private Integer errCode;
}
