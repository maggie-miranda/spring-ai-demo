package com.example.springaidemo.controller;

import org.springframework.ai.chat.ChatClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springaidemo.util.AIUtil;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api")
@Slf4j
@Tag(name = "AI", description = "AI API")
public class AIController {

    private final ChatClient chatClient;

    @Autowired
    public AIController(ChatClient chatClient) {
        this.chatClient = chatClient;
    }

    @GetMapping("/ai-info")
    @Operation(
        summary = "Get information about Agentic AI",
        description = "Returns information about Agentic AI from ChatGPT",
        responses = {
            @ApiResponse(
                responseCode = "200",
                description = "Successful operation",
                content = @Content(
                    mediaType = "text/plain",
                    schema = @Schema(type = "string")
                )
            )
        }
    )
    public String getAgenticAIInfo() {
        log.info("AI info endpoint called");
        return AIUtil.getAgenticAIInfo(chatClient);
    }
}