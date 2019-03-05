package com.miselmesnjak.ratecalculation;

import java.math.BigDecimal;

public interface InterestCalculator {
  Double calculateEffectiveRate(Double rate);
  Double calculateTotalForPeriod(Double principal, int period, Double effectiveRate);
}
