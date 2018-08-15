import static java.lang.String.valueOf;

class ArmstrongNumbers {

  boolean isArmstrongNumber(int numberToCheck) {
    return valueOf(numberToCheck).chars()
      .map(Character::getNumericValue)
      .map(digit -> (int) Math.pow(digit, valueOf(numberToCheck).length()))
      .sum() == numberToCheck;
  }
}
