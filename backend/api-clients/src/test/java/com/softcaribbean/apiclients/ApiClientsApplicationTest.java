package com.softcaribbean.apiclients;

import static org.junit.Assert.assertEquals;

import com.softcaribbean.apiclients.models.common.ResponseService;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class ApiClientsApplicationTest extends AbstractTest {

    @Test
    public void getAllClient() throws Exception {
        String uri = "/api/getAllClient";
        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri).accept(MediaType.APPLICATION_JSON_VALUE))
                .andReturn();

        int status = mvcResult.getResponse().getStatus();
        assertEquals(200, status);
        String content = mvcResult.getResponse().getContentAsString();
        ResponseService responseService = super.mapFromJson(content, ResponseService.class);
       // assertTrue(productlist.length > 0);
    }

}
