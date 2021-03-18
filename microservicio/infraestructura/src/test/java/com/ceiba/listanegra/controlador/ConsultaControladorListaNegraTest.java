package com.ceiba.listanegra.controlador;

import com.ceiba.ApplicationMock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.hamcrest.CoreMatchers.is;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;


@RunWith(SpringRunner.class)
@ContextConfiguration(classes= ApplicationMock.class)
@WebMvcTest(ConsultaControladorListaNegra.class)
public class ConsultaControladorListaNegraTest {

    @Autowired
    private MockMvc mocMvc;

    @Test
    public void findbyId() throws Exception {
        // arrange
	Long id = 1L;
        // act - assert
        mocMvc.perform(MockMvcRequestBuilders.get("/listanegra/{id}",id)
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(content().json("{'valor': true}"));
    }

    @Test
    public void listar() throws Exception {
        // arrange

        // act - assert
        mocMvc.perform(MockMvcRequestBuilders.get("/listanegra")
                .contentType(MediaType.APPLICATION_JSON))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$[0].nombreCliente", is("Cliente vetado Encontrado")));
    }

}
