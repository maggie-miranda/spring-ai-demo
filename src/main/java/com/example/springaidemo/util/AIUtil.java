package com.example.springaidemo.util;

import org.springframework.ai.chat.ChatClient;
import org.springframework.ai.chat.prompt.Prompt;
import lombok.extern.slf4j.Slf4j;

/**
 * Utility class for AI-related operations.
 */
@Slf4j
public class AIUtil {

    /**
     * Gets information about Agentic AI from ChatGPT.
     *
     * @param chatClient the ChatClient to use for the API call
     * @return the response from ChatGPT
     */
    public static String getAgenticAIInfo(ChatClient chatClient) {
        log.info("Getting information about Agentic AI");
        String promptText = "What is Agentic AI?";
        Prompt prompt = new Prompt(promptText);
        // Commented out the OpenAI API call
        // return chatClient.call(prompt).getResult().getOutput().getContent();

        // Return a simple message instead
        return "Hello Spring AI";
    }
}
