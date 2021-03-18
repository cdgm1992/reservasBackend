package com.ceiba.reserva.comando;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ComandoReserva {

    private Long id;
	private Long idCliente;
    private String nombreCliente;
    private int cantidadComensales;
	private Long idMesa;
	private String fecha;
}
