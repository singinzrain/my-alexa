package com.myalexa;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;

import java.util.Optional;

import static com.amazon.ask.request.Predicates.intentName;

public class CancelandStopIntentHandler implements RequestHandler {

  public boolean canHandle(HandlerInput input) {
    return input.matches(intentName("AMAZON.StopIntent").or(intentName("AMAZON.CancelIntent")));
  }

  public Optional<Response> handle(HandlerInput input) {
    String speechText = "Goodbye stranger, it's been nice.";
    return input.getResponseBuilder()
            .withSpeech(speechText)
            .withSimpleCard("MyDiary", speechText)
            .withShouldEndSession(true)
            .build();
  }
}
