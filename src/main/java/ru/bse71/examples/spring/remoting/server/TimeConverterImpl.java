package ru.bse71.examples.spring.remoting.server;

import ru.bse71.examples.spring.remoting.common.TimeConverter;

public class TimeConverterImpl implements TimeConverter {

  @Override
  public Integer convertToSeconds(Integer hours, Integer minutes) {
    return (hours * 60 + minutes) * 60;
  }
}

