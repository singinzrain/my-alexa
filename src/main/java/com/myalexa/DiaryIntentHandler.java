package com.myalexa;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class DiaryIntentHandler implements RequestHandler {

  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("DiaryIntent"));
  }

  public Optional<Response> handle(HandlerInput input) {
    String speechText = "Tell me what happened today";
    return input.getResponseBuilder()
            .withSpeech(speechText)
            .withSimpleCard("MyDiary", speechText)
            .build();
  }
}
