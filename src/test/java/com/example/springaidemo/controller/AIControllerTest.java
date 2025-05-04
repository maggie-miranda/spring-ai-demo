package com.example.springaidemo.controller;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.ChatResponse;
import org.springframework.ai.chat.Generation;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import java.util.List;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(AIController.class)
public class AIControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ChatClient chatClient;

    @Test
    public void testGetAgenticAIInfo() throws Exception {
        // Since we've commented out the OpenAI API call and now return a static message,
        // we don't need to mock the ChatClient response anymore
        // String mockResponse = "Agentic AI refers to AI systems that can act autonomously to achieve goals.";
        // Generation generation = new Generation(mockResponse);
        // ChatResponse chatResponse = new ChatResponse(List.of(generation));
        // Mockito.when(chatClient.call(any(Prompt.class))).thenReturn(chatResponse);

        // The expected response is now the static message
        String expectedResponse = "Hello Spring AI";

        mockMvc.perform(get("/api/ai-info"))
                .andExpect(status().isOk())
                .andExpect(content().string(expectedResponse));
    }
}
