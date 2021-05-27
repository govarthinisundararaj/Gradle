package io.reflectoring.mocking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SendMoneyService implements SendMoneyUseCase {

private static final Logger log = LoggerFactory.getLogger(SendMoneyService.class);
  public SendMoneyService() {
    log.info(">>> constructing SendMoneyService! <<<");
  }

  @Override
  public boolean sendMoney(SendMoneyCommand command) {
    log.info("sending money!");
    return false;
  }

}
