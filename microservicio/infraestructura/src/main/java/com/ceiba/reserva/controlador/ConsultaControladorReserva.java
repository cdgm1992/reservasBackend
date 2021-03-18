package com.ceiba.reserva.controlador;

import com.ceiba.reserva.consulta.ManejadorListarReservas;
import com.ceiba.reserva.modelo.dto.DtoReserva;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/reservas")
@Api(tags={"Controlador consulta reserva"})
public class ConsultaControladorReserva {

    private final ManejadorListarReservas manejadorListarreservas;

    @Autowired
    public ConsultaControladorReserva(ManejadorListarReservas manejadorListarreservas) {
        this.manejadorListarreservas = manejadorListarreservas;
    }

    @GetMapping
    @ApiOperation("Listar Mesas")
    public List<DtoReserva> listar() {
        return this.manejadorListarreservas.ejecutar();
    }

}
