package com.aluracursos.screenmatch2.service;
import com.theokanning.openai.completion.CompletionRequest;
import com.theokanning.openai.completion.chat.ChatMessage;
import com.theokanning.openai.service.OpenAiService;

import java.util.List;

public class ConsultaChatGPT {

    private final static String GPT_KEY = System.getenv("GPT_API_KEY");
    public static String obtenerTraduccion(String texto) {
        OpenAiService service = new OpenAiService(GPT_KEY);

        //ChatMessage mensaje = new ChatMessage("user", "Traduce al español el siguiente texto: " + texto);     1

        CompletionRequest requisicion = CompletionRequest.builder()
                .model("gpt-4o")
                //.model("gpt-4o")                                          1
                .prompt("traduce a español el siguiente texto: " + texto)
                //.messages(List.of(mensaje))                               1
                .maxTokens(1000)
                .temperature(0.7)
                .build();

        var respuesta = service.createCompletion(requisicion);
        return respuesta.getChoices().get(0).getText();
        //return respuesta.getChoices().get(0).getMessage().getContent();   1
    }
}







