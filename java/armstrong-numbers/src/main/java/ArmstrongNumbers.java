class ArmstrongNumbers {

  boolean isArmstrongNumber(int numberToCheck) {
    return String.valueOf(numberToCheck).chars()
      .map(Character::getNumericValue)
      .map(digit -> (int) Math.pow(digit, String.valueOf(numberToCheck).length()))
      .sum() == numberToCheck;
  }
}
