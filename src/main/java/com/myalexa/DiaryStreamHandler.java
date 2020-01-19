package com.myalexa;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;

public class DiaryStreamHandler extends SkillStreamHandler {

  private static Skill getSkill() {
    return Skills.standard()
            .addRequestHandlers(
                    new CancelandStopIntentHandler(),
                    new DiaryIntentHandler(),
                    new HelpIntentHandler(),
                    new LaunchRequestHandler(),
                    new SessionEndedRequestHandler())
            .build();
  }

  public DiaryStreamHandler() {
    super(getSkill());
  }
}
