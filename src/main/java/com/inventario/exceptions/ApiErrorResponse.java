package com.inventario.exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author jonatan.velasco
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiErrorResponse {
  
  private String code;
  private String description;
}
