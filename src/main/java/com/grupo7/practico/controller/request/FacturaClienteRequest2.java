package com.grupo7.practico.controller.request;

import com.grupo7.practico.model.Factura;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class FacturaClienteRequest2 {
  Factura factura;
  Integer idCliente;
}