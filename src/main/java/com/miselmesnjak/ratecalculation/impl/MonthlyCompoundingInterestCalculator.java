package com.miselmesnjak.ratecalculation.impl;

import com.miselmesnjak.ratecalculation.InterestCalculator;

public class MonthlyCompoundingInterestCalculator implements InterestCalculator {

  @Override
  public Double calculateTotalForPeriod(Double principal, int period, Double rate) {
    double monthlyRepayment = (rate * principal) / (1 - Math.pow(1 + rate, 0 - period));

    return monthlyRepayment * period;
  }

  @Override
  public Double calculateEffectiveRate(Double rate) {
    return Math.pow(1 + rate, 1.0 / 12) - 1;
  }
}
